fun factorial(n:Int):Long{
    return if (n == 0 || n==1) 1 else n * factorial(n-1)
}

fun main(){
    print("Enter a number:")
    val number = readLine()?.toIntOrNull()
    
    if (number != null && number >=0){
        println("factorial of $number = ${factorial(number)}")
    } else {
        println("please enter a valid non-negative integer.")
    }
}
