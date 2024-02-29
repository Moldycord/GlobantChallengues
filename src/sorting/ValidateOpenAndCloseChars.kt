package sorting

class ValidateOpenAndCloseChars {


    fun validateInput(inputString: String) {
        if (validateOpenAndClose(inputString)) {
            println("El texto es válido ")
        } else {
            println("El texto no es válido")
        }
    }

    private fun validateOpenAndClose(inputString: String): Boolean {
        val parenthesisList = mutableListOf<Char>()
        var isValid = true

        for (char in inputString) {
            when (char) {
                STARTER_PARENTESHIS -> parenthesisList.add(char)
                CLOSING_PARENTESHIS -> {
                    if (parenthesisList.isEmpty() || parenthesisList.last() != STARTER_PARENTESHIS) {
                        isValid = false
                    }
                    parenthesisList.removeLast()
                }
            }
        }
        return isValid
    }

    companion object {
        const val STARTER_PARENTESHIS = '('
        const val CLOSING_PARENTESHIS = ')'
    }
}

