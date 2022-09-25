import java.util.*;


public class Q4{
    public static void main(String[] args){
        double num_of_people = 80000; // initial number of people
        int rate_of_increase = 5; // rate at which population is increasing
        int num_of_years = 0; // current number of years
        // we will increase number if people by 5% till itcrosses 150000 mark.
        while(num_of_people<=150000){
            num_of_people = num_of_people*rate_of_increase/100 + num_of_people;
            num_of_years++;
        }
        // final answer
        System.out.println("Population will exceed 150000 after "+ num_of_years + " years");
    }
}