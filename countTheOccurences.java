import java.util.LinkedHashMap;
import java.util.Map;

public class countTheOccurences {
    public static void main(String args[]){
        Map<Integer,Integer>mp=new LinkedHashMap<>();
        int[] arr={1,2,3,3,4,5,5,6,6,6,7,6,8,8,8};
        for(int num:arr){
            if(mp.containsKey(num)){
                mp.put(num, mp.get(num)+1);
            }
            else{
                mp.put(num,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " Count: " + entry.getValue());
        }
    }
}
