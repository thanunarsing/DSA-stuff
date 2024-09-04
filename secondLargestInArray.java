public class secondLargestInArray {
    public static int secondLargestNum(int[] arr){
        if(arr.length<2){
            System.out.println("no second largest element");
            return -1;
        }
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>firstLargest){
                secondLargest=firstLargest;
                firstLargest=num;
            }
            else if(num>secondLargest && num<firstLargest){
                secondLargest=num;
            }
        }
        return secondLargest;
    }
    public static void main(String args[]){
        int[] arr={5,10,10};
        int result=secondLargestNum(arr);
        System.out.println(result);
    }
}
