import java.util.*;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();

        int quotient = num1/num2;
        int remainder = num1%num2;

        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);

    }
}
