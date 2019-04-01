
package calculator;

import java.util.Scanner;

public class Calculator {
	
	static int answer;

	public static void main(String[] args) {	
		
		int firstNum;
		int secondNum;
		int operator;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		firstNum = scanner.nextInt();
		System.out.print("Enter the second number: ");
		secondNum = scanner.nextInt();
		System.out.print("Enter the operator. 1(+), 2(-), 3(*), 4(/), 5(%): ");
		operator = scanner.nextInt();

		int solution = calculate(firstNum, secondNum, operator);
		
		System.out.print("The answer is: " + solution);
		
	}

	private static int calculate(int firstNum, int secondNum, int operator) {
		switch(operator) {
		case 1: 
			answer = firstNum + secondNum;
			break;
		case 2: 
			answer = firstNum - secondNum;
			break;
		case 3: 
			answer = firstNum * secondNum;
			break;
		case 4: 
			answer = firstNum / secondNum;
			break;
		case 5: 
			answer = firstNum % secondNum;	
		}
		return answer;
	}

}






// test

//// TODO Auto-generated method stub
//int x = 9;
//double y = 9.8;
//// doubles are more precise than a float
//float z = 5.4f;
//String str = "yeet";
//byte a = 127;
//short s = 3;
//long l = 6;
//System.out.print(str + ", " + x + ", " + y + ", " + z);


