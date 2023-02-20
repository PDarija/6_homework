package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkCalculatorSubtraction()
    {
        Calculator calculator = new Calculator();
        int result = calculator.subTwoValues(10, 6 );
        assertEquals(4, result);
    }


    @Test

    public void checkCalculatorWithSecondZeroValueSubtraction(){

        Calculator calculator = new Calculator();
        int result = calculator.subTwoValues(10, 0 );
        assertEquals(10, result);
    }

    @Test
    public void checkCalcWithFirstZeroValueSub(){
        Calculator calculator = new Calculator();
        int result = calculator.subTwoValues(0 , 2);
        assertEquals(-2, result);
    }

    @Test
    public void checkCalculateWithFirstNegativeValuesSub(){
        Calculator calculator = new Calculator();
        int result = calculator.subTwoValues(-1, 2);
        assertEquals(-3, result);
    }

    @Test
    public void checkCalculateWithSecondNegativeValuesSub() {
        Calculator calculator = new Calculator();
        int result = calculator.subTwoValues(10, -2);
        assertEquals(12, result);
    }

    @Test
    public void checkCalculateWithTwoNegativeValuesSub() {
        Calculator calculator = new Calculator();
        int result = calculator.subTwoValues(-5, -2);
        assertEquals(-3, result);
    }

    @Test
    public void checkCalculateSecondValueBiggerSub(){
        Calculator calculator = new Calculator();
        int result = calculator.subTwoValues(10, 15);
        assertEquals(-5, result);
    }


    @Test
    public void checkCalculatorSum(){

        Calculator calculator = new Calculator();
        int result = calculator.sumTwoValues(12, 3);
        assertEquals(15, result);
    }
    @Test

    public void checkCalculatorSumWithFirstNegativeValue(){
        Calculator calculator = new Calculator();
        int result = calculator.sumTwoValues(-4, 3);
        assertEquals(-1, result);
    }

    @Test
    public void checkCalculateSumWithSecondNegativeValues() {
        Calculator calculator = new Calculator();
        int result = calculator.sumTwoValues(10, -2);
        assertEquals(12, result);
    }
    @Test
    public void checkCalculatorSumWithSecondZeroValue(){

        Calculator calculator = new Calculator();
        int result = calculator.sumTwoValues(9, 0 );
        assertEquals(9, result);
    }

    @Test
    public void checkCalcSumWithFirstZeroValue(){
        Calculator calculator = new Calculator();
        int result = calculator.sumTwoValues(0 , 2);
        assertEquals(2, result);
    }

    @Test
    public void checkCalculateSumWithTwoNegativeValues() {
        Calculator calculator = new Calculator();
        int result = calculator.sumTwoValues(-5, -2);
        assertEquals(-7, result);
    }

//Second part
    @Test
        public void checkUserWIthNoParameters() {
        User user = new User();
        assertNull(user.name);
        assertEquals(null, user.name);
    }

    @Test
            public void checkUsername(){
        User user = new User("Aleksej", 32644848, 19);
        assertNotNull(user.name);
        assertEquals("Aleksej", user.name);

    }

    @Test

    public void checkUserNameWithONeParameter() {
        User user = new User("Anna");
        assertNotNull(user.name);
        assertEquals("Anna", user.name);
    }



}
