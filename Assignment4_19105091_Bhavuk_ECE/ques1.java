import java.util.*;

public class ques1 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        Vector vec = new Vector(num);
	        int cap = vec.capacity();
	        String input = sc.nextLine();
	        vec.add(input);
	        while(vec.size() <= cap) {
	            input = sc.nextLine();
	            if(input == "") {
	                break;
	            }
	            vec.add(input);
	        }
	        if(vec.size() != 0) {
	            vec.remove(0);
	        }
	        System.out.println(vec.toString());
	}

}