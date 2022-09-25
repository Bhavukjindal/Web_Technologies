import java.util.*;


public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score: ");
        double num1 = sc.nextDouble();
        // if score is b/w 80 and 90, increase score by 5
        if(num1>=80 && num1<=90){
            num1 = num1 + 5;
        }
        System.out.println("New Score is : "+ num1);
    }
}