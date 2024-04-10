package models;

public class Login {
    private String user;
    private String senha;

    public void login(Usuario usuario) {
        if (usuario.getIsLogado()) {
            System.out.println("Usuário já logado no sistema!");
        } else {
            if (usuario.getUserName() == user && usuario.getSenha() == senha) {
                System.out.println("Usuário logado com sucesso!");
                usuario.setIsLogado(true);
            } else {
                System.out.println("Nome ou Senha, inválidos");
            }
        }
    }
}
