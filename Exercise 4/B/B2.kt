fun sumOfDigits(n: Int): Int {
    if (n == 0) return 0 
    return (n % 10) + sumOfDigits(n / 10) // Recursive call 
} 

fun main() { 
    print("Enter a number: ") 
    val number = readLine()?.toIntOrNull() ?: 0 
    println("Sum of digits: ${sumOfDigits(number)}") 
}