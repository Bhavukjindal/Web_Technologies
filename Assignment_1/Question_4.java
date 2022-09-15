import java.util.*;

public class Question_4 {
    public static void Swap_using_temp(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The First number is: " + num1);
        System.out.println("The Second number is: " + num2);
    }
    public static void Swap_without_using_temp(int num1,int num2){
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("The First number is: " + num1);
        System.out.println("The Second number is: " + num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter 1 to swap using temporary var and 0 to swap without using temporary var: ");
        

        int c = sc.nextInt();
        if(c==1){
            Swap_using_temp(num1, num2);
        }else if(c==0){
            Swap_without_using_temp(num1, num2);
        }else{
            System.out.println("Enetered value of c is not 0/1");
        }
    }
}
