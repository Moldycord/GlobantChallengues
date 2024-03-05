package sorting

class PascalTriangleChallenge {

    fun doTriangle(rowsNumber: Int): List<List<Int>> {
        val triangle = mutableListOf<List<Int>>()

        for (i in 0..<rowsNumber) {
            val row = MutableList(i + 1) { i }
            for (j in 1..<i) {
                row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
            }

            triangle.add(row)
        }
        return triangle
    }
}