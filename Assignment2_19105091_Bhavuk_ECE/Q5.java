import java.util.*;


public class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int [][]arr = new int[n][4];
        int i  = 0,j = 1;
        while(i<n){
            arr[i][0] = (j);
            arr[i][1] = (j*j);
            arr[i][2] = (j*j*j);
            arr[i][3] = (j*j*j*j);
            i++;
            j++;
        }
        System.out.println("n n^2 n^3 n^4");

        for (i = 0; i < n; i++){
            for (j = 0; j < 4; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}