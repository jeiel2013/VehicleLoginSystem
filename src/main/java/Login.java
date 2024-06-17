public class Login extends LoginDAO {
    private String usuario;
    private String senha;
    
    Login() {
        this.usuario = "";
        this.senha = "";
    }
    
    public Boolean validarLogin() {
        Boolean result = false;
        
        String senhaBanco = selectMySQL(this.usuario);
        
        if (this.senha.equals(senhaBanco)) {
            result = true;
        }
        
        return result;
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
