class RpnKalkulator {
    fun calcule(i: String): Int {
        val input = i.split(" ")
        val arrayNumbers = arrayListOf<Int>()
        var operator = ""

        input.forEach {
            try {
                val value = Integer.parseInt(it)

                arrayNumbers.add(value)
            } catch (ex: NumberFormatException) {
                operator = it
            }
        }

       return when (operator) {
            "/" -> arrayNumbers[0].div(arrayNumbers[1])
            else -> arrayNumbers[0]
        }
    }
}

