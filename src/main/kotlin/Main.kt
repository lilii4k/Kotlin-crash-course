fun main() {
    val x = 5
    val y = 10
    val areBothEven = x % 2 == 0 && y % 2 == 0
    println("Are both numbers even? $areBothEven")
    val isOneEven = x % 2 == 0 || y % 2 == 0
    println("Is one number even? $isOneEven")

    println("Please enter a number: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    if(inputAsInteger != null) {
        println("You've entered $inputAsInteger.")
        val isEven = inputAsInteger % 2 == 0
        if(isEven) {
            println("This number is even.")
        } else {
            println("This number is odd.")
        }
    } else {
        println("Invalid input.")
    }

}