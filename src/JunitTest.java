import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitTest {

    @Test
    void twoPlusTwoEqualsFour() {
        System.out.println("Test 1 - 2 + 2");
        int num1 = 2;
        int num2 = 2;
        Junit j = new Junit ();
        int expected = 4;
        int actual = j.add2Nums(2,2);
        assertEquals(expected,actual);
    }
}