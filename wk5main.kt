fun main() {
    println (removeVowels("kotlin Programming language"))
}
fun removeVowels(s: String):String{
            val re = StringBuilder()
            for (c in s) { //to remove vowel from both uppercase and lower case
                if (c != 'A' && c != 'a'
                    && c != 'E' && c != 'e'
                    && c != 'I' && c != 'i'
                    && c != 'O' && c != 'o'
                    && c != 'U' && c != 'u'
                ) {
                    re.append(c)
                }
            }
            return re.toString()
}