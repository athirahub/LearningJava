package classprograms;

public class Calculator {
	double firstNumber;
	double secondNumber;
	
	Calculator(){
		
	}
	
	Calculator(double num1,double num2){
		firstNumber=num1;
		secondNumber=num2;
	}
	
	double addition() {
		double result=firstNumber+secondNumber;
		return result ;
	}
	double substraction() 
	{
		double result=firstNumber-secondNumber;
		return result;
	}
	
	double multiplication() {
		double result=firstNumber*secondNumber;
		return result;
	}
	double division() {
		double result=firstNumber/secondNumber;
		return result;
	}
	

}
