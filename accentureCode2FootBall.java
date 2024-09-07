import java.util.Scanner;

public class accentureCode2FootBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int teamA = 0;
        int teamB = 0;
        for (int i = 0; i < n; i++) {
            String team = scanner.nextLine().trim();
            if (team.equals("TeamA")) {
                teamA++;
            } else if (team.equals("TeamB")) {
                teamB++;
            }
        }
        if (teamA> teamB) {
            System.out.println("TeamA");
        } else if (teamB > teamA) {
            System.out.println("TeamB");
        } else {
            System.out.println("Draw");
        }
        scanner.close();
    }
}
