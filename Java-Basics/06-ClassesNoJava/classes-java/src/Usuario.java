public class Usuario {
    public String username;
    public String password;
    public String email;
    public boolean ativo;
    public static final int CARACTERES_NUM = 10;

    public Usuario() {
    }

    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public boolean isAtivo() {
        return ativo;
    };

    public static int getLimiteCaracteres() {
        return CARACTERES_NUM;
    }
}
