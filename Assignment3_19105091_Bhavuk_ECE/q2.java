import java.util.*;


public class q2 {
    // counting sort function
    public static void sort(int arr[])
    {
        int n = arr.length;
        int output[] = new int[n];
        int cnt[] = new int[21];
        
        for (int i = 0; i <= 20; ++i)
            cnt[i] = 0;

        for (int i = 0; i < n; ++i)
            cnt[arr[i]]++;

        for (int i = 1; i <= 20; ++i)
            cnt[i] += cnt[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[cnt[arr[i]] - 1] = arr[i];
            cnt[arr[i]]--;
        }
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }


    public static void main(String args[]) {
        int[] arr = {1,0,1,5,5,5,4,3,20,19};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
