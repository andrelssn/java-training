import java.util.Scanner;

public class AreaTrianguloSolution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int altura = scanner.nextInt();

        double area = base * altura / 2.0;
        System.out.println(area);
    }
}
