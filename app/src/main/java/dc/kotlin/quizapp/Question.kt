package dc.kotlin.quizapp

data class Question(
    val id: Int,
    val questions: String,
    val image: Int,
    val optionOne: String,
    val optionTow: String,
    val optionThree: String,
    val optionFor: String,
    val correctAnswer: Int
)
