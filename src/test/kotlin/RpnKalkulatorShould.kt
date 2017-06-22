import junit.framework.Assert.assertTrue
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class RpnKalkulatorShould {
    lateinit var rpnKalkualtor: RpnKalkulator

    @Test
    fun display_same_digit_sent() {
        Assert.assertTrue("4" == rpnKalkualtor.calcule("4"))
    }

    @Test
    fun divide_to_two_digits() {
        Assert.assertTrue("4" == rpnKalkualtor.calcule("20 5 /"))
    }

    @Test
    fun make_operation_with_three_digits() {
        assertTrue("3" == rpnKalkualtor.calcule("4 2 + 3 -"))
    }

    @Test
    fun make_operation_with_multiple_digits_and_operator() {
        Assert.assertTrue("141" == rpnKalkualtor.calcule("3 5 8 * 7 + *"))
    }

    @Test
    fun make_operation_with_two_consecutive_digits() {
        assertTrue("5 3 4" == rpnKalkualtor.calcule("7 2 - 3 4"))
    }

    @Test
    fun make_multiple_operator_division_plus_minus() {
        assertTrue("1" == rpnKalkualtor.calcule("1 7 2 4 * 6 + / -"))
    }

    @Before
    fun setUp() {
        rpnKalkualtor = RpnKalkulator()
    }
}
