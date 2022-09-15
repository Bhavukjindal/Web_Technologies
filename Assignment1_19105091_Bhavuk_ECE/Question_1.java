import java.util.*;


public class Question_1{
    public static int addit(int num1,int num2){
        return num1+num2;
    }
    public static int subtrac(int num1,int num){
        return num1-num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int add = addit(num1,num2);
        System.out.println("Addition of two number is : " + add);
        int sub = subtrac(num1,num2);
        System.out.println("Subtraction of two number is : "+ sub);
    }
}