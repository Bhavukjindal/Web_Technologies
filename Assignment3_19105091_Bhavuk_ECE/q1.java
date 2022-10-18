import java.util.*;


public class q1{
    public static int stringCompare(String string1 , String string2) {
        for(int i =0 ; i<string1.length() && i<string2.length(); i++) {
            if((int)string1.charAt(i) == (int)string2.charAt(i)) {
                continue;
            }
            else {
                return (int)string1.charAt(i)  - (int)string2.charAt(i);
            }
        }
        
        if(string1.length() != string2.length()) {
            return string1.length() - string2.length();
        }
        else 
            return 0;
    }
//     definition of stringCompare function
//     if s1 > s2, it returns positive number  
//     if s1 < s2, it returns negative number  
//     if s1 == s2, it returns 0  
        
    public static void main(String args[]) {
        String s1 = "Bhavuk";
        String s2 = "Jindal";
        System.out.println(stringCompare(s1 , s2));
    }
}