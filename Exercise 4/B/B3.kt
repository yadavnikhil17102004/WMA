class VowelExtractor(val input: String) {
    fun extractVowels(): String {
        return input.filter { it in "AEIOUaeiou" }  // Filters only vowels 
    }
} 

fun main() { 
    print("Enter a string: ") 
    val str = readLine() ?: "" 
    val extractor = VowelExtractor(str)
    println("Vowels in the string: ${extractor.extractVowels()}")
}