import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class mergeTwoArrays {
    public static void main(String args[]) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 3, 8, 9};
//        Map<Integer,Integer> mp=new LinkedHashMap<>();
//        for(int i:arr1){
//            mp.put(i,1);
//        }
//        for(int j:arr2){
//            if(mp.containsKey(j)){
//                mp.put(j,mp.get(j)+1);
//            }
//            else{
//                mp.put(j,1);
//            }
//        }
//        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
//            System.out.print(entry.getKey() +" ");
//        }
        Set<Integer> s=new HashSet<>();
        for(int i:arr1){
            s.add(i);
        }
        for(int j:arr2){
            s.add(j);
        }
        System.out.println(s);
    }
}
