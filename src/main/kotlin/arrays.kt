fun main() {
    val input = readln()
    val inputAsInteger = input.toIntOrNull()
    val favouriteNumbers = intArrayOf(1,2,3,4)

    if(inputAsInteger != null && inputAsInteger in 0.. favouriteNumbers.lastIndex) {
        println("Your number is ${favouriteNumbers[inputAsInteger]}")
    } else {
        println("That index doesn't exist")
    }
    println("$favouriteNumbers")


    println("How many numbers do you want to add?")
    val amountOfNumbers = readln().toIntOrNull() ?: 0
    var sum = 0
    var i = 0
    while(i < amountOfNumbers) {
        println("Please enter number #${i + 1}")
        val number = readln().toIntOrNull() ?: 0
        sum += number
        i++
    }
    println("The total is $sum")
}