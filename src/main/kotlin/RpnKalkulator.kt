class RpnKalkulator {
    fun calcule(i: String): Int {
        val input = i.split(" ")
        val arrayNumbers = arrayListOf<Int>()
        val operators = arrayListOf<String>()

        input.forEach {
            try {
                val value = Integer.parseInt(it)
                arrayNumbers.add(value)
            } catch (ex: NumberFormatException) {
                val resultOperation = when (it) {
                    "/" -> arrayNumbers[0].div(arrayNumbers[1])
                    "-" -> arrayNumbers[0].minus(arrayNumbers[1])
                    "+" -> arrayNumbers[arrayNumbers.size-2].plus(arrayNumbers[arrayNumbers.size-1])
                    "*" -> arrayNumbers[arrayNumbers.size-1].times(arrayNumbers[arrayNumbers.size-2])
                    else -> arrayNumbers[0]
                }

                arrayNumbers.remove(arrayNumbers.last())
                arrayNumbers.remove(arrayNumbers.last())
                arrayNumbers.add(resultOperation)
            }
        }

        return arrayNumbers[0]
    }
}

