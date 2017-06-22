import org.junit.Assert
import org.junit.Before
import org.junit.Test

class RpnKalkulatorShould {

    @Test
    fun display_same_digit_sent() {
        val rpnKalkualtor = RpnKalkulator()

        Assert.assertTrue(4 == rpnKalkualtor.calcule("4"))
    }

    @Test
    fun divide_to_two_digits() {
        val rpnKalkualtor = RpnKalkulator()

        Assert.assertTrue(4 == rpnKalkualtor.calcule("20 5 /"))
    }

    @Test
    fun make_operation_with_three_digits() {

        val rpnKalkualtor = RpnKalkulator()

        Assert.assertTrue(3 == rpnKalkualtor.calcule("4 2 + 3 -"))
    }

    @Before
    fun setUp() {
    }
}
