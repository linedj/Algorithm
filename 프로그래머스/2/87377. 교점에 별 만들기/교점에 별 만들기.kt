class Solution {
    
    fun solution(lines: Array<IntArray>): Array<String> {
        return draw(findPoints(lines))
    }

    private fun findPoints(lines: Array<IntArray>): List<Map<String, Int>> {
        
        val points = mutableListOf<Map<String, Int>>()
        
        for (i in lines.indices) {
            for (j in i + 1 until lines.size) {
                val det = lines[i][0].toLong() * lines[j][1] - lines[i][1].toLong() * lines[j][0]
                if (det == 0L) continue

                val x = (lines[i][1].toLong() * lines[j][2] - lines[i][2].toLong() * lines[j][1])
                val y = (lines[i][2].toLong() * lines[j][0] - lines[i][0].toLong() * lines[j][2])
                if (x % det != 0L || y % det != 0L) continue

                points.add(mapOf("x" to (x / det).toInt(), "y" to (y / det).toInt()))
            }
        }
        return points
    }

    private fun draw(points: List<Map<String, Int>>): Array<String> {
        val (minX, maxX) = points.minOf { it["x"]!! } to points.maxOf { it["x"]!! }
        val (minY, maxY) = points.minOf { it["y"]!! } to points.maxOf { it["y"]!! }

        val grid = Array(maxY - minY + 1) { CharArray(maxX - minX + 1) { '.' } }
        points.forEach { grid[maxY - it["y"]!!][it["x"]!! - minX] = '*' }

        return grid.map { String(it) }.toTypedArray()
    }
}
