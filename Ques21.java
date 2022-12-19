package finalassignment;

import java.util.Scanner;

class Operation {
	
	final double plus = 1;
	final double minus = 2;
	final double divide = 3;
	final double multiply = 4;

	public double calc(int i, double a, double b) {

		if (i == plus) {
			return (a + b);
		}
		else if (i == minus) {
			return (a - b);
		} 
		else if (i == divide) {
			return (a / b);
		}
		else if (i == multiply) {
			return (a * b);
		}
		return 0;
	}
}

public class Ques21 {
	
	/*
	 *Class named Operations have final variables like plus,minus,divide and multiply.
      This class has a method named calculate which takes 2 inputs of type double and return value in double
      inside calculate: if plus, inputs are added and returned.(similarly for other methods minus,divide and multiply).
      AssertionError is also thrown when user doesn't perform any of these operations in default.
      In your main method: calculate all 4 results and have these printed in console.
      Make sure to have dynamic inputs.*/

	public static void main(String[] args) throws AssertionError {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Click 1 for + ");
		System.out.println("Click 2 for - ");
		System.out.println("Click 3 for / ");
		System.out.println("Click 4 for * ");

		int i = sc.nextInt();
		Operation task = new Operation();

		if (i == 1) {
			System.out.println("Enter number1: ");
			double num1 = sc.nextDouble();
			System.out.println("Enter number2: ");
			double num2 = sc.nextDouble();
			double result = task.calc(i, num1, num2);

			System.out.println(result);
		} else if (i == 2) {

			System.out.println("Enter number1: ");
			double num1 = sc.nextDouble();
			System.out.println("Enter number2: ");
			double num2 = sc.nextDouble();
			double result = task.calc(i, num1, num2);

			System.out.println(result);
		} else if (i == 3) {
			System.out.println("Enter number1: ");
			double num1 = sc.nextDouble();
			System.out.println("Enter number2: ");
			double num2 = sc.nextDouble();
			double result = task.calc(i, num1, num2);
			
			System.out.println(result);

		} else if (i == 4) {

			System.out.println("Enter number1: ");
			double num1 = sc.nextDouble();
			System.out.println("Enter number2: ");
			double num2 = sc.nextDouble();
			double result = task.calc(i, num1, num2);
			
			System.out.println(result);

		} else {
			throw new AssertionError();

		}
		
	}

}
