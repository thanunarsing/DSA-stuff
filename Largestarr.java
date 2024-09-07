import java.util.Arrays;
import java.util.Scanner;

public class Largestarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print(num);
        int arr[] = {1,4,7,3,5};
        int num = arr.length;
        Arrays.sort(arr);
        for(int i =0;i<num;i++){
           System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arr[num-1]);
    }
}
