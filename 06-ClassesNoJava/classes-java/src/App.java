public class App {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(
            "user1",
            "userPass1",
            "ander1@gmail.com"
        );

        Usuario usuario2 = new Usuario(
            "user2",
            "userPass2",
            "ander2@gmail.com"
        );

        usuario1.ativo = true;
        // System.out.println(usuario1.isAtivo());
        // System.out.println(usuario2.isAtivo());
        // System.out.println(Usuario.getLimiteCaracteres());

        System.out.println(usuario1.username);
        System.out.println(usuario2.username);
        System.out.println(Usuario.CARACTERES_NUM);
    }
}
