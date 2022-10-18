import java.util.*;

public class q3 {
    public static void main(String args[]) {
        String[] s = {"Get" , "Set" , "Go" , "Race"};
        /// two loops to sort the strings
        for(int i =0; i<s.length; i++) {
            for(int j =i+1 ; j< s.length; j++) {
                if(s[i].compareTo(s[j]) > 0) { // inbuilt function to compare two strings
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }
}