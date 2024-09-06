sealed class Result {
    data class Success(val value: Int) : Result()
    data class Failure(val reason: String) : Result()
    object Loading : Result() // singleton
}
fun proccessResult(result: Result) {
    when (result) {
        is Result.Loading -> println("Loading")
        is Result.Success -> {
            println("Success")
        }
        is Result.Failure -> {
            println("Failure")
        }
    }
}
