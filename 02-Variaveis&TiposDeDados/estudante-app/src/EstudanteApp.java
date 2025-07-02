import java.util.Scanner;

public class EstudanteApp {
    public static void main(String[] args) {
        int idade = 18;
        char inicialDoNome = 'A';
        char inicialDoSobrenome ='S';
        double media = 8.7;
        boolean aprovado = true;
        String nome = "Andre";
        String sobrenome = "Santos";

        System.out.println(idade);
        System.out.println(inicialDoNome);
        System.out.println(inicialDoSobrenome);
        System.out.println(aprovado);
        System.out.println(nome + " " + sobrenome);
        // System.out.println(sobrenome);

        // manipulação de string nome.charAt(index)
        // tamanho string nome.length();

        // System.out.println(nome.charAt(nome.length() - 1));
        System.out.println(nome.equals(nome)); // verifica se é igual

        Scanner scanner = new Scanner(System.in);
        media = scanner.nextDouble();

        System.out.println(media);
    }
}
