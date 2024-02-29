import sorting.SortingStringAlgo
import sorting.ValidateOpenAndCloseChars

fun main() {
    val sortingStringAlgo = SortingStringAlgo()
    sortingStringAlgo.sortString("231i49i23rifjdsijkkq0101o0oodpscl")
    sortingStringAlgo.sortString("P@rAngar1cu÷iRImîçūąřoʻ")

    val validateOpenAndClose = ValidateOpenAndCloseChars()

    validateOpenAndClose.validateInput("()(())")
    validateOpenAndClose.validateInput("(())(((((")
}