public class Cadastro extends CadastroDAO {
    private String usuario;
    private String senha;
    
    Cadastro() {
        this.usuario = "";
        this.senha = "";
    }
    
    public void cadastrar() {
        insertMySQL(usuario, senha);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
