public class App {
    public static void main(String[] args) {
        System.out.println("Antes do alarme");
        alarmeHoraDoLance();
        System.out.println("Depois do alarme");

        double media = calcularMedia(7.0, 7.0, 9.0);
        System.out.println(media);

        if(media >= 7.0) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }

        System.out.println(potenciacao(2, 2)); // 2 elevado a 2
    }

    public static void alarmeHoraDoLance() {
        System.out.println("Hora do lanche");
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3.0;

        return media;
    }

    public static double potenciacao(int base, int potencia) {
        return Math.pow(base, potencia);
    }
}
