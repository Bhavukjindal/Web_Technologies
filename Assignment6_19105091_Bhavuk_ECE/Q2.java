import java.util.*;

public class Q2 {
			
		public static int addition(int num1, int num2) {
			if(num1 < 0 || num2 < 0) {  // if either of the two numbers is negative then it throws an arithmetic exception
				throw new ArithmeticException("Inavlid input!! numbers should be not be negative");
			}
			else {
				int ans = num1 + num2;  // addition of numbers
				System.out.println("Addition is : " + ans);
				return ans;
			}
		}
		
		public static int subtraction(int num1, int num2) {
			if(num1 < 0 || num2 < 0) {  // if either of the two numbers is negative then it throws an arithmetic exception
				throw new ArithmeticException("Inavlid input!! numbers should be not be negative");
			}
			else {
				int ans = num1 - num2;  // subtraction of num1 and num2
				System.out.println("Subtraction is : " + ans);
				return ans;
			}
		}
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Input first number : ");
			int num1 = sc.nextInt();
			
			System.out.print("Input second number : ");
			int num2 = sc.nextInt();
			
			try {  // try block
				addition(num1, num2);
				
				subtraction(num1, num2);
			}
			catch(ArithmeticException e) { // catch block
				System.out.println(e);
			}
		}
	}