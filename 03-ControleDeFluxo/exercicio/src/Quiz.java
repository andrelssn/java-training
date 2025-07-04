import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String a = "1) Max Verstappen";
        String b = "2) Lewis Hamilton";
        String c = "3) Charles Leclerc";
        String space = " ";
        int resCorrect = 2;
        int res;


        System.out.println("Quem tem 7 titulos?");
        System.out.println(a + space + b + space + c);

        Scanner scanner = new Scanner(System.in);
        res = scanner.nextInt();

        if (res == resCorrect) {
            System.out.println("Correto!");
        } else {
            System.out.println("Errado.");
        }
    }
}
