import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) throws Exception {
        int hours;
        double price = 30.6;

        System.out.println("Let's calculate your salary!");
        System.out.println("Please, set your total of hours worked:");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        System.out.println("Your amount is: " + calculate(hours, price));
    }

    public static double calculate(int hours, double price) {
        double sum = hours * price;

        return sum;
    }
}
