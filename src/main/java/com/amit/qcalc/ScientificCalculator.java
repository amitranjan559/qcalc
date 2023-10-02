package com.amit.qcalc;

public class ScientificCalculator extends StandardCalculator{

    public void getScientificCalculatorVersion(){
        System.out.println("Scientific Calculator version is 1.1");
    }

    public void sin(double a){
        double value= Math.sin(a);
        setResult(value);

    } 

    public void cos(double a){
        result=Math.cos(a);
    }
    public void square(double a){
       multiplication(a,a);
    }

    public void tan(double a){
        result= Math.tan(a);
    }

    public void log(double a){
        result= Math.log(a);
    }
    
    public void sqrt(double a){
        result= Math.sqrt(a);
    }
    
    public void cbrt(double a){
        result= Math.cbrt(a);
    }

    @Override
    public void printResult(){
        System.out.println("Scientific Calculator Result is :"+ result );
    }
}
