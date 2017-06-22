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

    @Before
    fun setUp() {
    }
}
