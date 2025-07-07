import java.util.Scanner;

public class RepeticaoMusica {
    public static void main(String[] args) {
        boolean repeat = true;

        while (repeat == true) {
            System.out.println("Tocar a musica");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Devo repetir? (true or false)");
            repeat = scanner.nextBoolean();
        }
    }
}
