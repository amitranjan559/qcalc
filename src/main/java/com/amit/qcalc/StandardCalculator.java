package com.amit.qcalc;

public class StandardCalculator{

    protected double result;

    void setResult(double value){
        this.result=value;// result=value : both are correct
    }


    public void addition(int a, int b){
        int sum =a+b;
        setResult(sum);
        
    }

    public void substraction(int a, int b){
        int diff = a-b;
        setResult(diff);
    }
    
    public void multiplication(int a, int b){

        int product= a*b;
        if(product==Double.MAX_VALUE || product==Double.POSITIVE_INFINITY ||product==Double.NEGATIVE_INFINITY ){
            throw new ArithmeticException("double Overflow error ");
        }
        setResult(product);
    }


    public void division(int a , int b) throws ArithmeticException
    {
        if(b==0){
            throw new ArithmeticException("Division by Zero Error ");
        }
        int div= a/b;
        setResult(div);
    }

    
    public void clearResult(){
        result=0;
    }


    void addition(double a, double b){
        double add = a+b;
        if(add==Double.MAX_VALUE || add==Double.POSITIVE_INFINITY || add==Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("double overflow error");
        }
        setResult(add);
    }

    void substraction(double a, double b){
        double result= a-b;
        if(result==Double.MAX_VALUE || result==Double.NEGATIVE_INFINITY || result==Double.POSITIVE_INFINITY){
            throw new ArithmeticException("double overflow error ");
        }
        this.result=result;
    }

    void multiplication(double a, double b){

        double result = a * b;

        if(result==Double.POSITIVE_INFINITY || result==Double.NEGATIVE_INFINITY|| result==Double.MAX_VALUE){
            throw new ArithmeticException("double overflow error");
        }

        this.result=result;
        
    }

    void division( double a, double b)throws ArithmeticException{

        if(b==0.0){
            throw new ArithmeticException("Division by Zero error Double" );
        }
        double div= a/b;
        setResult(div);
        
    }

    public double getResult(){
        return result;
    }

    void printResult(){
        System.out.println("Result is : " +result);
    }
}
