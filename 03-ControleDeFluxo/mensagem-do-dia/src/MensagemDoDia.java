import java.util.Scanner;

public class MensagemDoDia {
    public static void main(String[] args) {
        System.out.println("Digite um numero de 1 a 10: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String mensagem;
        if (number >= 1 && number <= 5) {
            mensagem = "Quem avisa amigo é";
        } else if (number >= 6 && number <= 10) {
            mensagem = "Você é oq vc come";
        } else {
            mensagem = "Invalido";
        }

        System.out.println(mensagem);
    }
}
