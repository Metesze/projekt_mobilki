package com.example.testquizapp

data class Question(
    val id: Int,
    val question: String,
    val image: Int=-1,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int,
    var isAnsweredCorrectly: Boolean = false // Dodane pole do przechowywania informacji o poprawnej odpowiedzi
)