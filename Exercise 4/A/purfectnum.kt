fun inPurNum(n: Int): Boolean {
    if (n<1) return false
     var sum = 0
     for (i in 1 until n){ //Loop from 1 to n-1
         if (n%i == 0) { //check if i is a divisor of n
             sum += i
        }
    }
    return sum == n
}

fun main(){
    print("Enter a number:")
    val number = readLine()?.toIntOrNull()
    
    if (number != null && number > 0){
        if (inPurNum(number)){
            println("$number is a Perfect Number.")
        }else{
            println("$number is Not a Perfect Number.")
        }
    }else{
        println("Please enter a valid positive integer.")
    }
}
