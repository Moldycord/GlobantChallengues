package sorting

class SortingStringAlgo {

    fun sortString(inputString: String) {
        val numberChars = mutableListOf<Pair<Char, Int>>()
        val otherChars = mutableListOf<Char>()
        val lettersChars = mutableListOf<Pair<Char, Int>>()


        /**Iterate over the string and validate if each char is a letter, number or another type
         * if is not any of those, is added to another list that will contain each char that is not a number
         * or a letter
         * **/

        for (char in inputString) {
            when {
                char.isLetter() -> {
                    val letterPair = Pair(char, if (char.isUpperCase()) 1 else 0)
                    lettersChars.add(letterPair)
                }

                char.isDigit() -> {
                    val digitPair = Pair(char, if (char.toString().toInt() % 2 == 0) 1 else 0)
                    numberChars.add(digitPair)
                }

                else -> otherChars.add(char)
            }
        }

        lettersChars.sortWith(compareBy({ it.second }, { it.first }))
        numberChars.sortWith(compareBy({ it.second }, { it.first }))

        val sortedChars = mutableListOf<Char>().apply {
            addAll(lettersChars.map { it.first })
            addAll(numberChars.map { it.first })
            addAll(otherChars)
        }

        println(sortedChars.joinToString(""))
    }
}