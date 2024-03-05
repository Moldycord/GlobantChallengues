import sorting.PascalTriangleChallenge
import sorting.SortingStringAlgo
import sorting.ValidateOpenAndCloseChars

fun main() {
    val sortingStringAlgo = SortingStringAlgo()
    sortingStringAlgo.sortString("231i49i23rifjdsijkkq0101o0oodpscl")
    sortingStringAlgo.sortString("P@rAngar1cu÷iRImîçūąřoʻ")

    val validateOpenAndClose = ValidateOpenAndCloseChars()

    validateOpenAndClose.validateInput("()(())")
    validateOpenAndClose.validateInput("(())(((((")

    val pascalTriangleChallenge = PascalTriangleChallenge()
    val triangle = pascalTriangleChallenge.doTriangle(5)
    triangle.forEach { println(it) }
}