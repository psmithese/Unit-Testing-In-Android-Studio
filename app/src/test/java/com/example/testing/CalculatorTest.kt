package com.example.testing

import org.junit.Assert.*

import org.junit.Test

class CalculatorTest {

    @Test
    /*
    * test for two positive number
    * */
    fun computeAddition_WhenGivenTwoPositiveNumbers_returnTrue() {

     //Given
        val a = 5
        val b = 5

     //When
        val calculator = Calculator()
        val result = calculator.computeAddition(a, b)

     //Assert
        assertEquals(result, 10)

    }
    @Test
            /*
              * test for two negative number
              * */
    fun computeAddition__WhenGivenTwoNegativeNumbers_returnTrue() {

        //Given
        val a = -5
        val b = -5

        //When
        val calculator = Calculator()
        val result = calculator.computeAddition(a, b)

        //Assert
        assertEquals(result, -10)

    }
    @Test
            /*
           * test for one positive number and one negative number
           * */
    fun computeAddition__WhenGivenOneNegativeNumbers_AndOnePositiveNumber_returnTrue() {

        //Given
        val a = 5
        val b = -3

        //When
        val calculator = Calculator()
        val result = calculator.computeAddition(a, b)

        //Assert
        assertEquals(result, 2)

    }
    @Test
    fun computeAddition__WhenGivenOneNegativeNumberAndOnePositiveNumber_returnTrue() {

        //Given
        val a = 5
        val b = -3

        //When
        val calculator = Calculator()
        val result = calculator.computeAddition(a, b)

        //Assert
        assertEquals(result, 2)

    }


    @Test
            /*
           * test for two positive number
           * */
    fun computedDivision_WhenGivenTwoPositiveNumbers_returnTrue() {

    //Given
        val a = 10
        val b = 5

    //When
        val calculator = Calculator()
        val result = calculator.computedDivision(a, b)

    //Assert
        assertEquals(result, 2)

    }
    @Test
    fun computedDivision_WhenGivenTwoNegativeNumbers_returnTrue() {

        //Given
        val a = -10
        val b = -5

        //When
        val calculator = Calculator()
        val result = calculator.computedDivision(a, b)

        //Assert
        assertEquals(result, 2)

    }

    @Test
    fun computedDivision_WhenGivenOneNegativeNumbers_and_OnePositiveNumber_returnTrue() {

        //Given
        val a = 10
        val b = -5

        //When
        val calculator = Calculator()
        val result = calculator.computedDivision(a, b)

        //Assert
        assertEquals(result, -2)

    }

    @Test
    fun computedDivision_WhenGivenOnNumbersIsDouble_and_OnePositiveNumber_returnTrue() {

        //Given
        val a = 3
        val b = -5

        //When
        val calculator = Calculator()
        val result = calculator.computedDivision(a, b)

        //Assert
        assertEquals(result, false)

    }


    @Test
    fun computedSubtraction_WhenGivenTwoPositiveNumbers_returnTrue() {

     //Given
        val a = 6
        val b = 5

    //When
        val calculator = Calculator()
        val result = calculator.computedSubtraction(a, b)

    //Assert
        assertEquals(result, 1)


    }


    @Test
    fun computedSubtraction_WhenGivenTwoNegativeNumbers_returnTrue() {

        //Given
        val a = -6
        val b = -5

        //When
        val calculator = Calculator()
        val result = calculator.computedSubtraction(a, b)

        //Assert
        assertEquals(result, -1)


    }

    @Test
    fun computedSubtraction_WhenGivenOneNegativeNumbers_and_OnePositiveNumber_returnTrue() {

        //Given
        val a = -6
        val b = 5

        //When
        val calculator = Calculator()
        val result = calculator.computedSubtraction(a, b)

        //Assert
        assertEquals(result, -11)


    }
    @Test
    fun computedMultiplication_WhenGivenTwoPositiveNumbers_returnTrue() {
    //Given
        val a = 5
        val b = 5

    //When
        val calculator = Calculator()
        val result = calculator.computedMultiplication(a, b)

    //Assert
        assertEquals(result, 25)

    }

    @Test
    fun computedMultiplication_WhenGivenTwoNegativeNumbers_returnTrue() {
        //Given
        val a = -5
        val b = -5

        //When
        val calculator = Calculator()
        val result = calculator.computedMultiplication(a, b)

        //Assert
        assertEquals(result, 25)

    }

    @Test
    fun computedMultiplication_WhenGivenOneNegativeNumbers_and_OnePositiveNumber_returnTrue() {
        //Given
        val a = -5
        val b = 5

        //When
        val calculator = Calculator()
        val result = calculator.computedMultiplication(a, b)

        //Assert
        assertEquals(result, -25)

    }
}