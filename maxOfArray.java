import java.util.Arrays;

public class maxOfArray {
    public static void main(String args[]){
        int n=5;
        int[] arr= {1,4,7,3,2};
//        int max=arr[0];
//        for(int i=1;i<n;i++){
//            if(max<arr[i]){
//                max=arr[i];
//            }
//        }
        Arrays.sort(arr);
        //System.out.println("largest element in the given array is "+ max);
        System.out.println(arr[n-1]);
    }
}
