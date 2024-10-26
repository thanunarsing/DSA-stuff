import java.sql.SQLOutput;
import java.util.Scanner;
public class practice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("No.of pizzas:");
        int pizzas= sc.nextInt();
        System.out.println("No.of puffs:");
        int puffs= sc.nextInt();
        System.out.println("No.of cooldrinks:");
        int coolDrinks= sc.nextInt();
        int piza=Math.abs(pizzas)*100;
        int pufs=Math.abs(puffs)*20;
        int drinks=Math.abs(coolDrinks)*10;

        int total_price=piza+pufs+drinks;
        System.out.println("Total price="+total_price);
    }
}
