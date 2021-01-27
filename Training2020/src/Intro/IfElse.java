package Intro;

public class IfElse {
	public static void main (String args[])
	{
		int a = 95;
		
//		if(a%2 == 0) {
//			// code block will executer if condition is true
//		System.out.println("even number");
//		}
//		else {
//			System.out.println("odd number");
//		}
		// Ternary opearator
//		String s = 	(a%2 == 0)?"even number": "odd number";
//	System.out.println(s);
		
//		if (a>30 && a< 49) {
//			System.out.println("You have passed");
//		}
//		else if(a> 49 && a< 60) {
//			System.out.println("Avg score");
//		}
//		else if (a>60 && a<90) {
//			System.out.println("Good Score");
//		}
//		else if(a>90) {
//			System.out.println("Great Score");
//		}
//		
		// Nested if statement
		int age = 1;
		int salary = 5;
		if (age > 25 && age < 60) {
			if(salary < 5)
			{ System.out.println("you cannot open account");}
			else if(salary >= 5 && salary < 10) {
				System.out.println("you can open you account");
			}
			else if(salary > 10) {
				System.out.println("Opt for Business account");
			}
		}
		else if (age > 60 )
		{ System.out.println("open senior account");}
		else {
			System.out.println("You cannot open your account");
		}
		

		
		
	}
}
/* 1. if statement 
 * 2. if - else statement
 * 3. if-else -if ladder
 * 4.nested if statement
  ternary operator = (condition)?"trueoutput":"elseoutput"
*/
