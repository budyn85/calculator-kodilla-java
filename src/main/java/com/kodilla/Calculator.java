package com.kodilla;
import java.lang.*;
import java.io.*;
import java.lang.*;

public class Calculator {

    public double addAToB(double a,double b){
        double sum;
        return sum = a+b;
       // System.out.println(sum);
    }

    public double substractAFromB(double a,double b){
        double difference;
        return difference=a-b;
        //System.out.println(difference);
    }
}
    class Application{
    public static void main(String[]args){
        Calculator calculator= new Calculator();
        double result = calculator.addAToB(12.4,3.12);
        double substract= calculator.substractAFromB(134.5,25.2);
        System.out.println(result);
        System.out.println(substract);
    }
}