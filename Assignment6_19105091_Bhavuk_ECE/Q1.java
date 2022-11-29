import java.util.*;

public class Q1 {

		public static double division(int num1, int num2) { 
			if(num1 == 0 || num2 == 0) { // if num1 or num2 equals to 0 then it throws an arithmetic exception
				throw new ArithmeticException("invalid input!! either of the numbers cannot be zero");
			}
			else {
			    double ans = (double) num1 / num2;  // division
			    System.out.println("Division of the two numbers is : " +ans);
			    return ans;
			}
		}
		
		public static int multiply(int num1, int num2) {
			
			if(num1 == 0 || num2 == 0) {  // if num1 or num2 equals to zero then it throws an arithmetic exception
				throw new ArithmeticException("invalid input!! either of the numbers cannot be zero");
			}
			else {
				int ans = num1 * num2; // multiplication
			    System.out.println("Multiplication of the two numbers is : " + ans); 
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
				division(num1, num2);   
				
				multiply(num1, num2);
			}
			catch(ArithmeticException e) { // catch block
				System.out.println(e);
			}
		}

}