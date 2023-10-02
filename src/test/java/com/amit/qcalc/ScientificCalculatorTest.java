package com.amit.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ScientificCalculatorTest {
    ScientificCalculator scientificCalculator;

    @BeforeEach
    public void initialize(){
        scientificCalculator= new ScientificCalculator();
    }
    
    @Test
    @DisplayName("Test Sin")
    public void testSin(){
        //Arrange
        double expectedValue =  1.0;
        //Act
        scientificCalculator.sin(Math.PI/2);
        double actualValue= scientificCalculator.getResult();
        
        //Assert
        Assertions.assertEquals( expectedValue,actualValue);

    }

    @Test
    @DisplayName("Test cos")
    public void testCos(){
        //Arrange
        double expectedValue=0.0;
        double delta = 1e-15; // Define a small delta for tolerance
        //ACT
        scientificCalculator.cos((Math.PI / 2));
        double actualValue= scientificCalculator.result;
        //Assert
        Assertions.assertEquals(expectedValue, actualValue,delta);

    }

    @Test
    @DisplayName("Test tan")
    public void testTan(){
        //Arrange
        double expectedValue=0;
        //act
        scientificCalculator.tan(0);
        double actualValue = scientificCalculator.getResult();
        //assert
        Assertions.assertEquals(expectedValue,actualValue);
    }


    @Test
    @DisplayName("Test Log of given Double")
    void testLogOperation(){
        //Arrange
        double expectedResult = 1;
        //Act
        scientificCalculator.log(Math.exp(1));
        double actualResult = scientificCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Square Root of given Double")
    void testSquareRootOperation(){
        //Arrange
        double expectedResult = 2;
        //Act
        scientificCalculator.sqrt(4);
        double actualResult = scientificCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Cube Root of given Double")
    void testCubeRootOperation(){
        //Arrange
        double expectedResult = 2;
        //Act
        scientificCalculator.cbrt(8);
        double actualResult = scientificCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

     @Test
    @DisplayName("Test Square ")
    void testSquareOperation(){
        //Arrange
        double expectedValue= 4;
        //act
        scientificCalculator.square(2);
        double actualValue= scientificCalculator.result;
        //assert
        Assertions.assertEquals(expectedValue, actualValue);
    }


    @Test
    @DisplayName("Test Square overflow")
    void testSquareOverflow(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class, new Executable() {

            @Override
            public void execute() throws Throwable{
                scientificCalculator.square(Double.MAX_VALUE);
            }
            
        });
    }

}










    



