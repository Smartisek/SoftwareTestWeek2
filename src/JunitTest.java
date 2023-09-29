import org.junit.jupiter.api.Test;

import java.awt.font.GlyphJustificationInfo;

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
        assertTrue(true);
    }
    @Test
    void fivePlusSixEqualsEleven(){
        System.out.println("Test 2 - 5 + 6");
        int num1 = 5;
        int num2 = 6;
        int expected = 11;
        Junit j = new Junit();
        int actual = j.add2Nums(num1,num2);
        assertEquals(expected,actual);
    }

//    Example 1
    @Test
    void twoPlusTwoEqualsEight(){
        System.out.println("Test 3 - 2 + 2 should equal 8");
        int num1 = 2;
        int num2 = 2;
        int expected = 8;
        Junit j = new Junit();
        int actual = j.sumDouble(num1,num2);
        assertEquals(expected, actual);
    }

    @Test
    void threePlusTwoEqualsFive(){
        System.out.println("Test 4 - 3 + 2 should equal 5");
        int num1 = 3;
        int num2 = 2;
        int expected = 5;
        Junit j = new Junit();
        int actual = j.sumDouble(num1,num2);
        assertEquals(expected, actual);
    }

    @Test
    void minusSixPlusMinusSix(){
        System.out.println("Test minus - -6 + -6 should equal -24");
        int num1 = -6;
        int num2 = -6;
        int expected = -24;
        Junit j = new Junit();
        int actual = j.sumDouble(num1,num2);
        assertEquals(expected, actual);
    }

//    Example 2
    @Test
    void isNotWeekdayIsVacation(){
        boolean isWeekday = false;
        boolean isVacation = true;
        System.out.println("Test 5 - Is not weekday but vacation");
        Junit j = new Junit();
        boolean test = j.sleepIn(isWeekday,isVacation);
        boolean expected = true;
        assertTrue(expected == test);
    }

    @Test
    void isWeekdayIsNotVacation(){
        boolean isWeekday = true;
        boolean isVacation = false;
        System.out.println("Test 6 - Is weekday but no vacation");
        Junit j = new Junit();
        boolean test = j.sleepIn(isWeekday,isVacation);
        boolean expected = false;
        assertTrue(expected == test);
    }

    @Test
    void isWeekdayIsVacation(){
        boolean isWeekday = true;
        boolean isVacation = true;
        System.out.println("Test 7 - Is weekday and is vacation");
        Junit j = new Junit();
        boolean test = j.sleepIn(isWeekday,isVacation);
        boolean expected = true;
        assertTrue(expected == test);
    }

//    Example 3
    @Test
    void aMonkeySmillesBMonkeyNot(){
        boolean aSmile = true;
        boolean bSmile = false;
        System.out.println("A monkey smilling, b monkey not, no trouble");
        Junit j = new Junit();
        boolean test = j.monkeyTrouble(aSmile,bSmile);
        boolean expected = false;
        assertTrue(expected == test);
    }

    @Test
    void aMonkeySmillesBMonkeySmilles(){
        boolean aSmile = true;
        boolean bSmile = true;
        System.out.println("A monkey smilling, b monkey smilling, trouble");
        Junit j = new Junit();
        boolean test = j.monkeyTrouble(aSmile,bSmile);
        boolean expected = true;
        assertTrue(expected == test);
    }

    @Test
    void aMonkeyNotSmillesBMonkeyNotSmilles(){
        boolean aSmile = false;
        boolean bSmile = false;
        System.out.println("A monkey not smilling, b monkey not smilling, trouble");
        Junit j = new Junit();
        boolean test = j.monkeyTrouble(aSmile,bSmile);
        boolean expected = true;
        assertTrue(expected == test);
    }

//    Example 5
    @Test
    void differenceAndSumIsNotSixAndNumberNotSix(){
        System.out.println("Number is not six and difference and sum is not six");
        int num1 = 3;
        int num2 = 2;
        Junit j = new Junit();
        boolean test = j.love6(num1, num2);
        boolean expected = false;
        assertTrue(expected == test);
    }

    @Test
    void differenceIsSix(){
        System.out.println("Difference is six");
        int num1 = 9;
        int num2 = -3;
        Junit j = new Junit();
        boolean test = j.love6(num1, num2);
        boolean expected = true;
        assertTrue(expected == test);
    }

    @Test
    void noDifferenceButNumberSix(){
        System.out.println("No difference and number is 6");
        int num1 = 6;
        int num2 = 8;
        Junit j = new Junit();
        boolean test = j.love6(num1, num2);
        boolean expected = true;
        assertTrue(expected == test);
    }

    @Test
    void sumIsSix(){
        System.out.println("Sum is six");
        int num1 = 3;
        int num2 = 3;
        Junit j = new Junit();
        boolean test = j.love6(num1, num2);
        boolean expected = true;
        assertTrue(expected == test);
    }

    @Test
    void minusNumbersAndDifferenceSix(){
        System.out.println("Both numbers minus and difference six");
        int num1 = -15;
        int num2 = -9;
        Junit j = new Junit();
        boolean test = j.love6(num1, num2);
        boolean expected = true;
        assertTrue(expected == test);
    }
}