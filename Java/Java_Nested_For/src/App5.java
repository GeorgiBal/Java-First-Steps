import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.print("+ ");
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("- ");
        }
        System.out.println("+");

        for (int i = 1; i <= n-2; i++) {
            System.out.print("| ");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print("- ");
            }
            System.out.println("|");
        }

        System.out.print("+ ");
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("- ");
        }
        System.out.println("+");
    }
}
