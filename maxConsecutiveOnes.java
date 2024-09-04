public class maxConsecutiveOnes {
    public static int maxOnes(String str,int k){
        int l=0;
        int r=0;
        int length=0;
        int n=str.length();
        int zeroCount=0;
        while(r<n){
            if(str.charAt(r)=='0'){
                zeroCount++;
            }
            if(zeroCount>k){
                while(zeroCount>k){
                    if(str.charAt(l)=='0'){
                        zeroCount--;
                    }
                    l++;
                }
            }
            if(zeroCount<=k){
                length=Math.max(length,r-l+1);
                r++;
            }
        }
        return length;
    }
    public static void main(String args[]){
        String str="111110";
        int k=2;
        System.out.println(maxOnes(str,k));
    }
}
