import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private Connection connection;
     
    private String url;
    private String host; 
    private String porta;
    private String banco;
    private String usuario;
    private String senha;
    
    MySQLConnection() {
        connection = null;
        host = "localhost";
        porta = "3306";
        banco = "avaliacaoJeiel";
        usuario = "root";
        senha = "admin";
        url = "jdbc:mysql://" + host + ":" + porta + "/" + banco;
    }
    
    // Método para obter a conexão com o banco de dados
    public Connection getConexao() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, usuario, senha);
                System.out.println("Conexao com o banco de dados estabelecida com sucesso!");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }  

    // Método para fechar a conexão
    public void desconectar() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexao com o banco de dados fechada com sucesso!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
