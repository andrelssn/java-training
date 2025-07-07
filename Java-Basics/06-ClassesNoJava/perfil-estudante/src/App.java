public class App {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Gerson", 2025, 8.4);
        Estudante estudante2 = new Estudante("Rico", 2025, 4.7);

        estudante1.setAnoParaFormatura(2026);
        System.out.println(estudante1.anoParaFormatura);
        System.out.println(estudante2.anoParaFormatura);
    }
}
