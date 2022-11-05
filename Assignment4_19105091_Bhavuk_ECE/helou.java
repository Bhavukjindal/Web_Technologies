import java.util.Scanner;

public class helou{
    public static void main(String[] args){
        
        double primes [];

        primes = new double[10];

        for(int i = 0; i < 9; ++i)
        {
            System.out.println(primes[i]);
        }

    //    long[] prime = new int[13];

    int[] ques = new int [30];
    System.out.println(ques[20]);

   // Scanner scn = new Scanner(System.in);
//    int n = scn.nextInt();

    //int[] ans = new int[n];

    int[] even = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

    int [] value = even;
    int temp = 1;

    for(int i = 0; i < 10; ++i)
    {
        value[i] = temp;
        temp += 2;
    }

    for(int i = 0; i < 10; ++i)
    {
        System.out.println(even[i]);
    }
    

    int[] hello = new int [5];
    //hello = {1, 2, 3, 4, 5};

    int[][] array2D = new int[4][4];

    for(int i = 0; i < 4; ++i)
    {
        int temporary = i;

        for(int j = 0; j < 4; ++j)
        {
            array2D[i][j] = temporary;
            temporary += 2;
        }
    }

    for(int i = 0; i < 4; ++i)
    {

        for(int j = 0; j < 4; ++j)
        {
            System.out.print(array2D[i][j] + " ");
        }

        System.out.println();
    }





    
    }
}