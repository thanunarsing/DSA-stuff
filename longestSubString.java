import java.util.LinkedHashMap;
import java.util.Map;

public class longestSubString {
    public static int stringLength(String str){
        int l=0;
        int r=0;
        int length=0;
        Map<Character,Integer> mp=new LinkedHashMap<>();
        int n=str.length();
        if(n==0){
            return -1;
        }
        while(r<n){
            if(mp.containsKey(str.charAt(r))){
                l=Math.max(mp.get(str.charAt(r))+1,l);
            }
            mp.put(str.charAt(r), r);
            length=Math.max(length,r-l+1);
            r++;
        }
        return length;
    }
    public static void main(String args[]){
        String str="takeyoufarword";
        System.out.println(stringLength(str));
    }
}
