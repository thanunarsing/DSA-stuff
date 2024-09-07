import java.util.*;
class Solution {
    public static int maxSubArray(int[] num) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
            max=Math.max(max, sum);
            if(sum<0){
                sum=0;
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int num[] = {-2,1,-3,8,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));
    }
}


