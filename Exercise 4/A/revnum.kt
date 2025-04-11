fun revnum(n: Int):Int{
    var num = n
    var result = 0
    
    while (num != 0){
        val digit = num % 10
        result = result * 10 + digit
        num /= 10
    }
    return re
}
fun main(){
    print("Enter a number:")
    val number = readLine()?.toIntOrNull()
    
    if (number != null ){
        println("Reversed Number: ${revnum(number)}")
    }else{
        println("Please enter a valid number.")
    }
}
