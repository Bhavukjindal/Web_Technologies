import java.util.*;


	class Calculator {
	    private int num1; // private variables
	    private int num2;

	     public Calculator(int num1, int num2) { // parameterized constructor
	         this.num1 = num1;
	         this.num2 = num2;
	     }

	 	public int addition() {  // addition of num1 and num2
	 		int ans = num1 + num2; 
			System.out.println("Addition is : " + ans);
			return ans;
		}
		
		public int subtraction() { // subtraction of num1 and num2
			int ans = num1 - num2;
			System.out.println("Subtraction is : " + ans);
			return ans;
		}
		
		public double division() {
			double ans = (double) num1 / num2; // division
			System.out.println("Division is : " +ans);
			return ans;
		}
		
		public int multiply() {
			int ans = num1 * num2; // multiplication
		    System.out.println("Multiplication is : " + ans);
		    return ans;
		}
	 }

	public class Q3 {
		 public static void main(String ar[]) {

			 Scanner sc = new Scanner(System.in);
			 int num1, num2;
			 try {
				 System.out.print("enter num1 for addition: ");
				 num1 = Integer.parseInt(sc.nextLine());
				 System.out.print("enter num2 for addition: ");
				 num2 = Integer.parseInt(sc.nextLine());
				 
				 Calculator obj1 = new Calculator(num1, num2); // declaring and initializing obj1
				 obj1.addition(); // calling addition method
				 
				 System.out.print("enter num1 for subtraction: ");
				 num1 = Integer.parseInt(sc.nextLine());
				 System.out.print("enter num2 for subtraction: ");
				 num2 = Integer.parseInt(sc.nextLine());
				 
				 Calculator obj2 = new Calculator(num1, num2); // declaring and initializing obj2
				 obj2.subtraction(); // calling subtraction method
				 
				 System.out.print("enter num1 for multiplication: ");
				 num1 = Integer.parseInt(sc.nextLine());
				 System.out.print("enter num2 for multiplication: ");
				 num2 = Integer.parseInt(sc.nextLine());
				 
				 Calculator obj3 = new Calculator(num1, num2); // declaring and initializing obj3
				 obj3.multiply(); // calling multiply method
				 
				 System.out.print("enter num1 for division: ");
				 num1 = Integer.parseInt(sc.nextLine());
				 System.out.print("enter num2 for division: ");
				 num2 = Integer.parseInt(sc.nextLine());
				 
				 Calculator obj4 = new Calculator(num1, num2); // declaring and initializing obj4
				 obj4.division(); // calling division method
			 }
			 catch(NumberFormatException e) { // if other than integer input is entered it will catch number format exception
				 System.out.println("Invalid input!! " + e);
			 }
		 }
	}