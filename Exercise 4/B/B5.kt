class UppercaseConverter(val input: String) { 

    fun convertToUppercase(): String { 

        return input.uppercase() 

    } 

} 

 

fun main() { 

    print("Enter a string: ") 

    val str = readLine() ?: "" 

 

    val converter = UppercaseConverter(str) 

    println("Uppercase: ${converter.convertToUppercase()}") 

} 