import java.util.Scanner;

public class Project1Calculator {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static String isStandardOrScientific() {
		
		String mode = keyboard.next();
		
		if(mode.equals("Standard"))
			
			return mode;
		
		return "Scientific";
		
		}
	
	public static void calculatorOutput(String output) {
			
			System.out.println(output);
			
		}
	
	public static void displayResult(double result) {
		
		System.out.println(result);
	}
	
	public static String calculatorOperation(String mode) {
			
			String userOperation = keyboard.next();
			
			boolean x = false;
			
			if((userOperation.equals("+")) || (userOperation.equals("-")) || (userOperation.equals("*")) || (userOperation.equals("/")) || (userOperation.equals("sin")) && (mode.equals("Scientific")) || (userOperation.equals("cos")) && (mode.equals("Scientific")) || (userOperation.equals("tan")) && (mode.equals("Scientific"))){
				
				x = true;
				
				return userOperation;
			}
			
			while(x == false)
			
			 {
				
				if(mode.equals("Standard")) {
					
					calculatorOutput("Invalid operator " + userOperation);
					
					calculatorOutput("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
					
					userOperation = keyboard.next();
					
					if((userOperation.equals("+")) || (userOperation.equals("-")) || (userOperation.equals("*")) || (userOperation.equals("/"))){
						
						x = true;
					}
				}
				
				if(mode.equals("Scientific")) {
					
						calculatorOutput("Invalid operator " + userOperation);
						
						calculatorOutput("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x");
						
						userOperation = keyboard.next();
						
						if((userOperation.equals("+")) || (userOperation.equals("-")) || (userOperation.equals("*")) || (userOperation.equals("/")) || (userOperation.equals("sin")) || (userOperation.equals("cos")) || (userOperation.equals("tan"))){
							
							x = true;
							
						}
					
			}
			
		}
			return userOperation;
		}
	
	public static int getInt(){
		
		return keyboard.nextInt();
		
	}
	
	public static double getDouble(){
		
		return keyboard.nextDouble();
	}
	
	public static double [] getDoubleValues(double [] numRepeat) {
		
		
		for(int i = 0; i < numRepeat.length; ++i) {
			
			numRepeat [i] = keyboard.nextDouble();

		}
		
		return numRepeat;
		
	}
	
	public static double addition(int numOfNumbers, double [] values) {
		
		double result = 0.0;
		
		for(int i = 0; i < numOfNumbers; ++i) {
			
			 result += values[i];
			  
		}
		
		return result;
		
	}
	
	public static double subtraction(int numOfNumbers, double [] values) {
		
		double result = values[0];
		
		for(int i = 1; i < numOfNumbers; ++i) {
			
			 result -= values[i];
			  
		}
		
		return result;
		
	}
	
	public static double multiplication(int numOfNumbers, double [] values) {
		
		double result = 1.0;
		
		for(int i = 0; i < numOfNumbers; ++i) {
			
			 result *= values[i];
			  
		}
		
		return result;
		
	}
	
	public static double division(int numOfNumbers, double [] values) {
		
		double result = values[0];
		
		for(int i = 1; i < numOfNumbers; ++i) {
			
			 result /= values[i];
			  
		}
		
		return result;
		
	}
	
	public static double sin(double radian) {
		
		double result = Math.sin(radian);
		
		return result;
	}
	
	public static double cos(double radian) {
		
		double result = Math.cos(radian);
		
		return result;
	}
	
	public static double tan(double radian) {
		
		double result = Math.tan(radian);
		
		return result;
	}
	
	public static void main (String [] args) {
		
	boolean startOver = true;
		
	while(startOver == true) {
		
	calculatorOutput("Enter the calculator mode: Standard/Scientific?");
	
	String mode = isStandardOrScientific();
	
	if(mode.equals("Standard")) {
		
		calculatorOutput("The calculator will operate in standard mode.\nEnter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
	}
	
	if(mode.equals("Scientific")){
		
		calculatorOutput("The calculator will operate in scientific mode.\nEnter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
	}
	
	String operation = calculatorOperation(mode);
	
	double result = 0.0;
	
	if((operation.equals("+")) || (operation.equals("-")) || (operation.equals("*")) || (operation.equals("/"))) {
		
		if(operation.equals("+")) {
			
		calculatorOutput("How many numbers do you want to add?");
		
		}
		
		if(operation.equals("-")) {
			
		calculatorOutput("How many numbers do you want to subtract?");
		
		}
		
		if(operation.equals("*")) {
			
		calculatorOutput("How many numbers do you want to multiply?");
		
		}
		
		if(operation.equals("/")) {
			
		calculatorOutput("How many numbers do you want to divide?");
		
		}
		
	
	int numOfNumbers = getInt();
	
	calculatorOutput("Enter " + numOfNumbers + " numbers");
	
	double [] values = new double [numOfNumbers];
			
	getDoubleValues(values);
	
	if(operation.equals("+")) {
		
		result = addition(numOfNumbers, values);
	}
	
	if(operation.equals("-")) {
		
		result = subtraction(numOfNumbers, values);
	}
	
	if(operation.equals("*")) {
		
		result = multiplication(numOfNumbers, values);
	}
	
	if(operation.equals("/")) {
		
		result = division(numOfNumbers, values);
	}
	}
	
	if((operation.equals("sin")) || (operation.equals("cos")) || (operation.equals("tan"))){
		
		if(operation.equals("sin")) {
			
			calculatorOutput("Enter a number in radians to find the sine");
			
			double number = getDouble();
			
			result = sin(number);
		}
		
		if(operation.equals("cos")) {
			
			calculatorOutput("Enter a number in radians to find the cosine");
			
			double number = getDouble();
			
			result = cos(number);
		}
		
		if(operation.equals("tan")) {
			
			calculatorOutput("Enter a number in radians to find the tangent");
			
			double number = getDouble();
			
			result = tan(number);
		}
		
	}
	
	calculatorOutput("Result: " + result);
	
	calculatorOutput("Do you want to start over? (Y/N)");
	
	String yesOrNo = keyboard.next();
	
	if(yesOrNo.equals("Y")) {
		
		startOver = true;
		
	}
	
	if(yesOrNo.equals("N")){
		
		startOver = false;
	}
	
}
	
	calculatorOutput("Goodbye");
	
}
}