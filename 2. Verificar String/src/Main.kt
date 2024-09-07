fun main() {
    val input = "Maria é casada"
    val countedAs = input.lowercase().count { it == 'a'}
    print("There is a total of $countedAs A's in the following text:\n$input")
}