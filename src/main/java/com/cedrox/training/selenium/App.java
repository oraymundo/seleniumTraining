package com.cedrox.training.selenium;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	Calculator calculator = new Calculator();
    	int option;
    	double number1,number2,result=0;
    	
        System.out.println( "Calculator!" );
        System.out.println( "1. Addition 2. Substraction 3. Multiplication 4.Division 5.Exponentiation" );
        option = scan.nextInt();
        System.out.println( "Enter number 1" );
        number1 = scan.nextInt();
        System.out.println( "Enter number 2" );
        number2 = scan.nextInt();
        
        switch(option){
        case 1:
        	result=calculator.addition(number1, number2);
        case 2:
        	result=calculator.substraction(number1, number2);
        case 3:
        	result=calculator.multiplication(number1, number2);
        case 4:
        	result=calculator.division(number1, number2);    
        case 5:
        	result=calculator.exponentiation(number1,number2);
        }
        
        System.out.println("The result is "+result);
        
        
    }
    
    
    
}
