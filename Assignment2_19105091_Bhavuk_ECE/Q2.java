public class Q2 {
        // class and file name can be changed to MinOfThree 
        public static void main(String[] args) {
        //three numbers
        int a = 20;
        int b = 10;
        int c = 30;
         
        int smallest;
         
        //find the smallest
        if(a<b) {
            // check if a is smallest or c
            if(c<a) {
                smallest = c;
            } else {
                smallest = a;
            }
        } else {
            // check if b is smallst or c
            if(b<c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }
         
        System.out.println(smallest + " is the smallest.");
    }
}
