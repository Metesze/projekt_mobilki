package com.example.testquizapp


object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,
            "Na osi liczbowej zaznaczono sumę przedziałów",
            R.drawable.zad1,
            " |x − 3,5| ≥ 1,5  ",
            "|x − 1,5| ≥ 3,5",
            " |x − 3,5| ≤ 1,5",
            " |x − 1,5| ≤ 3,5",
            2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2,
            "Dla każdej liczby rzeczywistej a wyrażenie (2a−3)^2−(2a+3)^2 +jest równe:",
            -1,
            " −24a",
            "0",
            "18",
            "16a^2 − 24a",
            1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3,
            "Zbiorem wszystkich rozwiązań nierówności −2(x+3)≤(2−x)/3 jest przedział",
            -1,
            "(−∞, −4]",
            "(−∞, 4]",
            " [−4, ∞)",
            "[4, ∞)",
            3
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4,
            "Jednym z rozwiązań równania √3(x^2 − 2)(x + 3) = 0 jest liczba",
            -1,
            "3",
            "2",
            " √3 ",
            "√2",
            4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5,
            "Równanie (x+1)(x-1)^2/((x-1)(x+1))^2=0 w zbiorze liczb rzeczywistych",
            -1,
            "nie ma rozwiązania",
            "ma dokładnie jedno rozwiązanie: −1",
            "ma dokładnie jedno rozwiązanie: 1",
            "ma dokładnie dwa rozwiązania: −1 oraz 1",
            1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6,
            "Dziedziną funkcji F jest zbiór",
            R.drawable.zad2,
            " [−6, 5] ",
            " (−6, 5)",
            "(−3, 5]",
            "[−3, 5]",
            1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7,
            "Największa wartość funkcji F w przedziale [−4, 1] jest równa",
            R.drawable.zad2,
            "0",
            "1",
            "2",
            "5",
            3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8,
            "Liczba a oraz liczba b we wzorze funkcji f spełniają warunki:\n",
            R.drawable.zad3,
            " a > 0 i b > 0.",
            "a > 0 i b < 0",
            "a < 0 i b > 0",
            "a < 0 i b < 0",
            3
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9,
            "Jednym z miejsc zerowych funkcji kwadratowej f jest liczba (−5). Pierwsza współrzędna\n" +
                    "wierzchołka paraboli, będącej wykresem funkcji f, jest równa 3.\n"+
                    "Drugim miejscem zerowym funkcji 𝑓 jest liczba"
            ,
            -1,
            "11",
            "1",
            "-1",
            "-13",
            1
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10,
            "Ciąg (an) jest określony wzorem an=2^n⋅(n+1) dla każdej liczby naturalnej n≥1 Wyraz a4 jest równy:",
            -1,
            "64",
            "40",
            "48",
            "80",
            4
        )
        questionsList.add(que10)
        // 11
        val que11 = Question(
            11,
            "Trzywyrazowy ciąg (27,9,a−1) jest geometryczny. Liczba a jest równa:",
           -1,
            "3",
            "0",
            "4",
            "2",
            3
        )
        questionsList.add(que11)
        // 12
        val que12 = Question(
            12,
            "Dla każdego kąta ostrego α wyrażenie sin^4α+sin^2α*cos^2α jest równe:",
            -1,
            "sin^2α",
            "sin^6 α * cos2 α",
            "sin^4α",
            "sin^2α*(sinα+cosα)*(sinα+cosα)",
            1
        )
        questionsList.add(que12)
        // 13
        val que13 = Question(
            13,
            "W rombie o boku długości 6–√2 kąt rozwarty ma miarę 150° Iloczyn długości przekątnych tego rombu jest równy:",
            -1,
            "24",
            "72",
            "36",
            "36√2",
            2
        )

        questionsList.add(que13)
        // 14
        val que14= Question(
            14,
            " Liczba (28–√−32–√)^2 jest równa:",
            -1,
            "2",
            "1",
            "26",
            "14",
            1
        )

        questionsList.add(que14)
        // 15
        val que15 = Question(
            15,
            "Dodatnie liczby x i yspełniają warunek 2x=3y Wynika stąd, że wartość wyrażenia x^2+y^2/(x*y)jest równa:",
            -1,
            "2/3",
            "16/6",
            "6/16",
            "3/2",
            2
        )

        questionsList.add(que15)
        // 16
        val que16 = Question(
            16,
            "Zbiorem wszystkich rozwiązań nierówności 2/5−x/3 > x/5 jest przedział:",
            -1,
            " (−∞, 0) ",
            "(0, +∞) ",
            " (−∞,3/4)",
            "(3/4,+∞)",
            2
        )

        questionsList.add(que16)
        // 17
        val que17 = Question(
            17,
            " Iloczyn wszystkich rozwiązań równania 2x(x^2−9)(x+1)= 0 jest równy:",
            -1,
            "-3",
            "3",
            "0",
            "9",
            3
        )

        questionsList.add(que17)
        // 18
        val que18 = Question(
            18,
            "Iloczyn f(−3)*f(0)*f(4) jest równy:",
            R.drawable.zad4,
            "-12",
            "-8",
            "0",
            "16",
            2
        )

        questionsList.add(que18)
        // 19
        val que19 = Question(
            19,
            "Miejscem zerowym funkcji liniowej f określonej wzorem f(x)= −1/3(x+3)+5jest liczba:",
            -1,
            "-3",
            "9/2",
            "5",
            "12",
            4
        )

        questionsList.add(que19)
        // 20
        val que20 = Question(
            20,
            "Wykresem funkcji kwadratowej f(x)=3x^2+bx+c jest parabola o wierzchołku w punkcie W=(−3,2) Wzór tej funkcji w postaci kanonicznej to:",
            -1,
            "f(x)=3(x-3)^2+2",
            "f(x)=3(x+3)^2+2",
            "f(x)=(x-3)^2+2",
            "f(x)=(x+3)^2+2",
            2
        )

        questionsList.add(que20)
        // 21
        val que21 = Question(
            21,
            "Ciąg (an) jest określony wzorem an=(2n^2−30n)/n dla każdej liczby naturalnej n≥1 Wtedy a7 jest równy:",
            -1,
            "-196",
            "-32 ",
            "-26",
            "-16",
            4
        )

        questionsList.add(que21)
        // 22
        val que22 = Question(
            22,
            "Wszystkie wyrazy nieskończonego ciągu geometrycznego (an) określonego dla każdej liczby naturalnej n≥1 są dodatnie i 9a_5=4a_3 Wtedy iloraz tego ciągu jest równy:",
            -1,
            "2/3",
            "3/2",
            "2/9",
            "9/2",
            1
        )

        questionsList.add(que22)
        val que23 = Question(
            23,
            "Na wykresie funkcji liniowej określonej wzorem f(x)=(m−1)x+3 leży punkt S=(5,−2). Zatem:",
            -1,
            "m=1",
            "m=2 ",
            "m=-1",
            "m=0",
            4
        )

        questionsList.add(que23)

        val que24 = Question(
            24,
            "Funkcja liniowa f określona wzorem f(x) = 2x + b ma takie samo miejsce zerowe, jakie ma funkcja g(x) = −3x + 4. Stąd wynika, że:",
            -1,
            "b=-8/3",
            "b=4/3",
            "b=4",
            "b=-3/2",
            1
        )

        questionsList.add(que24)

        val que25 = Question(
            25,
            "Proste o równaniach: y=2mx−m2−1 oraz y=4m2x+m2+1 są prostopadłe dla:",
            -1,
            "m=-1/2",
            "m=1/2",
            "m=1",
            "m=2",
            1
        )

        questionsList.add(que25)

        val que26 = Question(
            26,
            "Proste o równaniach 2x−3y=4 i 5x−6y=7 przecinają się w punkcie P. Stąd wynika, że:",
            -1,
            "P=(1,2)",
            "P=(-1,2)",
            "P=(-1,-2)",
            "P=(1,-2)",
            3
        )

        questionsList.add(que26)

        val que27 = Question(
            27,
            "Dana jest funkcja liniowa f(x) =3/4x + 6. Miejscem zerowym tej funkcji jest liczba:",
            -1,
            "8",
            "6",
            "-6",
            "-8",
            4
        )

        questionsList.add(que27)

        val que28 = Question(
            28,
            "Proste opisane równaniami y=2/(m-1) oraz y=mx+1/(m+1) sa prostopadle, gdy",
            -1,
            "m=2",
            "m=1/2",
            "m=1/3",
            "m=-2",
            3
        )

        questionsList.add(que28)

        val que29 = Question(
            29,
            "Miara kąta wpisanego w okrąg jest o 30st  mniejsza od miary kąta środkowego opartego na tym samym łuku. Wynika stąd, że miara kąta wpisanego jest równa:",
            -1,
            "30st",
            "20st",
            "10st",
            "5st",
            1
        )

        questionsList.add(que29)

        val que30 = Question(
            30,
            "Kąt środkowy oparty na łuku, którego długość jest równa  4/9 długości okręgu, ma miarę:",
            -1,
            "160st",
            "80st",
            "40st",
            "20st",
            1
        )

        questionsList.add(que30)

        val que31 = Question(
            31,
            "W trójkącie prostokątnym ABC odcinek AB jest przeciwprostokątną i |AB|=13 oraz |BC|=12 . Wówczas sinus kąta ABC jest równy.",
            -1,
            "12/13",
            "5/13",
            "5/12",
            "13/12",
            2
        )

        questionsList.add(que31)

        val que32 = Question(
            32,
            "Suma wszystkich pierwiastków równania (x+3)(x+7)(x-11)=0  jest równa:",
            -1,
            "21",
            "-1",
            "-21",
            "1",
            4
        )

        questionsList.add(que32)

        val que33 = Question(
            33,
            "Do zbioru rozwiązań nierówności (x^4+1)(2−x)>0 nie należy liczba:",
            -1,
            "1",
            "-1",
            "3",
            "-3",
            3
        )

        questionsList.add(que33)

        val que34 = Question(
            34,
            "W układzie współrzędnych dane są punkty A=(a,6) oraz B=(7,b). Środkiem odcinka AB jest punkt M=(3,4). Wynika stąd, że:",
            -1,
            "a=5 i b=5",
            "a-1 i b=2",
            "a=4 i b=10",
            "a=-4 i b=-2",
            2
        )

        questionsList.add(que34)

        val que35 = Question(
            35,
            "Dany jest okrąg o środku S=(2,3) i promieniu r=5. Który z podanych punktów leży na tym okręgu?",
            -1,
            "A=(-1,7)",
            "B=(2,-3)",
            "C=(3,2)",
            "D=(5,3)",
            1
        )

        questionsList.add(que35)

        val que36 = Question(
            36,
            "Dane są punkty M=(3,−5) oraz N=(−1,7). Prosta przechodząca przez te punkty ma równanie:",
            -1,
            "y=-3x+4",
            "y=3x-4",
            "y=-1/3 + 4",
            "y=3x+4",
            1
        )

        questionsList.add(que36)

        val que37 = Question(
            37,
            "Ciąg (x,2x+3,4x+3) jest geometryczny. Pierwszy wyraz tego ciągu jest równy:",
            -1,
            "-4",
            "1",
            "0",
            "-1",
            4
        )

        questionsList.add(que37)

        val que38 = Question(
            38,
            "W ciągu arytmetycznym an, określonym dla n≥1, dane są: a1=5, a2=11. Wtedy:",
            -1,
            "a14=71",
            "a12=71",
            "a11=71",
            "a10=71",
            2
        )

        questionsList.add(que38)

        val que39 = Question(
            39,
            "Dany jest trójwyrazowy ciąg geometryczny (24,6,a−1). Stąd wynika, że:",
            -1,
            "a=5/2",
            "a=2/5",
            "a=3/2",
            "a=2/3",
            1
        )

        questionsList.add(que39)

        val que40 = Question(
            40,
            "Dla ciągu arytmetycznego (an), określonego dla n≥1, jest spełniony warunek a4+a5+a6=12. Wtedy:",
            -1,
            "a5=4",
            "a5=3",
            "a5=6",
            "a5=6",
            1
        )

        questionsList.add(que40)

        val que41 = Question(
            41,
            "W ciągu arytmetycznym (an) określonym dla n≥1 dane są a1=−4 i r=2. Którym wyrazem tego ciągu jest liczba 156?",
            -1,
            "81",
            "80",
            "76",
            "77",
            1
        )

        questionsList.add(que41)

        val que42 = Question(
            42,
            "Liczby: x−2, 6, 12, w podanej kolejności, są trzema kolejnymi wyrazami ciągu geometrycznego. Liczba x jest równa:",
            -1,
            "0",
            "2",
            "3",
            "5",
            4
        )

        questionsList.add(que42)

        return questionsList
    }
    private val questionsList = getQuestions()
    private val usedQuestionIndices = ArrayList<Int>()
    fun getTotalQuestionCount(): Int {
        return questionsList.size
    }

    fun getRandomQuestion(): Question {
        if (usedQuestionIndices.size == questionsList.size || usedQuestionIndices.size >= 10) {
            resetUsedQuestionIndices()
        }

        var randomIndex: Int
        do {
            randomIndex = (0 until questionsList.size).random()
        } while (usedQuestionIndices.contains(randomIndex))

        usedQuestionIndices.add(randomIndex)

        return questionsList[randomIndex]
    }

    private fun resetUsedQuestionIndices() {
        usedQuestionIndices.clear()
    }
}