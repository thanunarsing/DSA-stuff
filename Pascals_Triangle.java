import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
public class Pascals_Triangle {
    public static Vector<Integer> generateRow(int r){
        Vector<Integer> l=new Vector<>();
        int ans=1;
        l.add(ans);
        for(int i=1;i<r;i++){
            ans=ans*(r-i);
            ans=ans/i;                    // Generating rth row//
            l.add(ans);
        }
        return l;
    }
    public static int generatenum(int r,int c){
        int num=1;
        for(int i=1;i<c;i++){
            num=num*(r-i);                    //function to find a number with at rth row and cth column
            num=num/(i);
        }
        return num;
    }
    public static Vector<Vector<Integer>> pascalTriangle(int r){
        Vector<Vector<Integer>> v=new Vector<>();
        for(int i=1;i<=r;i++){
            Vector<Integer> temp=generateRow(i);
            v.add(temp);                                 // generating pascal triangle list
        }
        return v;
    }
    public static void main(String args[]){
        int r=7;
        int c=3;
        System.out.println(generatenum(r,c));
        System.out.println(generateRow(r));
        System.out.println(pascalTriangle(r));
    }
}
