public class palindromeCheck {
    public static void main(String args[]){
        String str="abcdecba";
        StringBuilder sb=new StringBuilder(str);
        int n=sb.length();
        int start=0;
        int end=n-1;
        while(start<=end){
            if(sb.charAt(start)!=sb.charAt(end)) {
                System.out.println("Not a palindrome");
                return;
            }
            else{
                start++;
                end--;
            }
        }
        System.out.println("it's a palindrome");
    }
}
