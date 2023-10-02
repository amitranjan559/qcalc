package com.amit.qcalc;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StandardCalculatorTest {

    StandardCalculator standardCalculator;

    @BeforeEach
    void initilize(){
        standardCalculator= new StandardCalculator();
    }
    
    //TESTING INTEGERS
    @Test
    @DisplayName("Test addition of two integers")
    void testAdditionOfTwoIntegers(){
        //Arrange
        standardCalculator.addition(2, 1);
        //Act
        double actualResult= standardCalculator.getResult();
        //Assert
        Assertions.assertEquals(3,actualResult);

    }

    @Test
    @DisplayName("Test substraction of two integers")
    public void testSubstractionOfIntegers(){
        standardCalculator.substraction(1, 1);
        double actualResult=standardCalculator.getResult();
        Assertions.assertEquals(0, actualResult);
    }

    //TESTING DOUBLES
    @Test 
    @DisplayName("Test addition of two doubles")
    public void testAdditionOfTwoDoubles(){
        standardCalculator.addition(3.4,1.1);
        double product= standardCalculator.getResult();
        Assertions.assertEquals(4.5, product);

    }
    //TESTING EXCEPTIONS

    @Test
    @DisplayName("Testing multiplication overflow of two doubles")
    public void testMultiplicationOverflowOfDoubles(){
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.multiplication(Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }



    @Test
    @DisplayName("Testing multiplication overflow of two doubles one is positive infinity and other is negative infinity ")
    public void testMultiplicationOverflowOfTwoDoublesPosNeg(){
        Assertions.assertThrows(ArithmeticException.class ,new Executable(){
            @Override
            public void execute()throws Throwable{
                standardCalculator.multiplication(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
            }
        });

    }

    @Test
    @DisplayName("Test double addition for overflow")
    public void testAdditionOfTwoDoublesOverflow(){
        Assertions.assertThrows(ArithmeticException.class,new Executable() {
           @Override
           public void execute(){
            standardCalculator.addition(Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY );
           } 
        });

    }

    @Test
    @DisplayName("Test Subtraction Overflow of Two Doubles")
    void testSubtractionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.substraction(-Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }

    



}
