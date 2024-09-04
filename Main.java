import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str="abcdef";
        StringBuilder sb=new StringBuilder(str);
        int n=sb.length();
        int start=0;
        int end=n-1;
        while(start<=end){
            char c = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, c);
            start++;
            end--;
        }
        sb.toString();
        System.out.println(sb);
    }
}