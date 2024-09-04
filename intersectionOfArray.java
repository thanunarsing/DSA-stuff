import java.util.*;
public class intersectionOfArray {
    public static void main(String args[]){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 3, 8, 9};

        Set<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }

        for (int j : arr2) {
            if (set.contains(j)) {
                System.out.print(j + " ");
            }
        }
    }
}
