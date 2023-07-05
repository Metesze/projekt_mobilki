package com.example.testquizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.media3.common.util.UnstableApi
import com.example.testquizapp.databinding.ActivityQuizQuestionsBinding

@UnstableApi
class QuizQuestionsActivity : AppCompatActivity(), OnClickListener {

    private lateinit var binding: ActivityQuizQuestionsBinding

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null
    private var mRandomQuestion: Question? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        mQuestionsList = ArrayList(Constants.getQuestions().shuffled().take(10))

        setQuestion()

        binding.apply {
            tvOptionOne.setOnClickListener(this@QuizQuestionsActivity)
            tvOptionTwo.setOnClickListener(this@QuizQuestionsActivity)
            tvOptionThree.setOnClickListener(this@QuizQuestionsActivity)
            tvOptionFour.setOnClickListener(this@QuizQuestionsActivity)
            btnSubmit.setOnClickListener(this@QuizQuestionsActivity)
        }
        binding.btnSubmit.setOnClickListener(this@QuizQuestionsActivity)
    }

    @SuppressLint("SuspiciousIndentation")
    private fun setQuestion() {
        mRandomQuestion = mQuestionsList?.getOrNull(mCurrentPosition - 1)

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList?.size) {
            binding.btnSubmit.text = "FINISH"
        } else {
            binding.btnSubmit.text = "SUBMIT"
        }

        binding.apply {
            progressBar.progress = mCurrentPosition
            progressBar.max = mQuestionsList?.size ?: 0
            tvProgress.text = "$mCurrentPosition/${progressBar.max}"

            tvQuestion.text = mRandomQuestion?.question
            if (mRandomQuestion?.image != -1) {
                ivImage.setImageResource(mRandomQuestion?.image ?: -1)
            } else {
                ivImage.setImageDrawable(null)
            }

            tvOptionOne.text = mRandomQuestion?.optionOne
            tvOptionTwo.text = mRandomQuestion?.optionTwo
            tvOptionThree.text = mRandomQuestion?.optionThree
            tvOptionFour.text = mRandomQuestion?.optionFour
        }
    }

    private fun defaultOptionsView() {
        val options = listOf(
            binding.tvOptionOne,
            binding.tvOptionTwo,
            binding.tvOptionThree,
            binding.tvOptionFour
        )

        for (option in options) {
            option.setTextColor(Color.parseColor("#7a8089"))
            option.typeface = Typeface.DEFAULT
            option.isClickable = true
            option.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_option_one -> {
                checkAnswer(1)
                selectedOptionView(binding.tvOptionOne, 1)
            }
            R.id.tv_option_two -> {
                checkAnswer(2)
                selectedOptionView(binding.tvOptionTwo, 2)
            }
            R.id.tv_option_three -> {
                checkAnswer(3)
                selectedOptionView(binding.tvOptionThree, 3)
            }
            R.id.tv_option_four -> {
                checkAnswer(4)
                selectedOptionView(binding.tvOptionFour, 4)
            }
            R.id.btn_submit -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++

                    when {
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, mUserName)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = mRandomQuestion
                    if (question?.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    } else {
                        mCorrectAnswers++
                    }

                    question?.let {
                        answerView(
                            it.correctAnswer,
                            getBackgroundResIdForAnswer(it.correctAnswer)
                        )
                    }

                    if (mCurrentPosition == mQuestionsList?.size) {
                        binding.btnSubmit.text = "FINISH"
                    } else {
                        binding.btnSubmit.text = "NEXT QUESTION"
                    }

                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun getBackgroundResIdForAnswer(answer: Int): Int {
        return when (answer) {
            1 -> R.drawable.correct_option_border_bg
            2 -> R.drawable.correct_option_border_bg
            3 -> R.drawable.correct_option_border_bg
            4 -> R.drawable.correct_option_border_bg
            else -> R.drawable.default_option_border_bg
        }
    }

    private fun checkAnswer(selectedOption: Int) {
        val question = mRandomQuestion
        if (question?.correctAnswer != selectedOption) {
            Toast.makeText(this, "Odpowiedź jest niepoprawna", Toast.LENGTH_SHORT).show()
        }
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                binding.tvOptionOne.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                binding.tvOptionTwo.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                binding.tvOptionThree.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                binding.tvOptionFour.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363a43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this, R.drawable.selected_option_border_bg
        )
    }
}