package com.cedrox.training.selenium;

public class Calculator {
	
	public Calculator(){
		
	}
	
	public double addition(double number1, double number2){
		return number1+number2;
	}
	
	public double substraction(double number1, double number2){
		return number1-number2;
	}
	public double multiplication(double number1, double number2){
		return number1*number2;
	}
	public double division(double number1, double number2){
		return number1/number2;
	}
	public double exponentiation(double number1, double number2){
		double result=number1;
		for(double i=0;i<number2;i++){
			result=result*number1;
		}
		return result;
	}
}
