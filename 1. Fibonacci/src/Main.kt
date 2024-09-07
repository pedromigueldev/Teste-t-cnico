fun fibonacci(number: Int): Int {
    if (number <= 1) return number

    return fibonacci(number - 1) + fibonacci(number - 2)
}

fun main() {
    println("Type a Number: ")
    var userInput: String = readln()
    var isNumberInFibonacci = false
    var reqNumber = userInput.toIntOrNull()

    while (userInput == "" || reqNumber == null) {
        println("Please provide a valid Number: ")
        userInput = readln()
        reqNumber = userInput.toIntOrNull()
    }

    for (i in 0..reqNumber + 1){
        val current = fibonacci(i)
        print("${current}, ")

        isNumberInFibonacci = current == reqNumber
        if (current >= reqNumber) break
    }

    if (isNumberInFibonacci)(
            println("The number $reqNumber is in Fibonacci.")
    ) else (
            println("There's no $reqNumber in the Fibonacci sequence.")
    )
}