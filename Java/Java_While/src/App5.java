import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = 1;
        while (num <= n){
            System.out.println(num);
            num = (num*2)+1;
        }
    }
}
