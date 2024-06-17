import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {
    
    public String selectMySQL(String usuario) {
        MySQLConnection mysql = new MySQLConnection();
        Connection connection = mysql.getConexao();
        String result = "";
        if (connection != null) {
            try {
                String query = "SELECT SENHA FROM USUARIO WHERE USUARIO='" + usuario + "'";
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();
                
                if (resultSet.next()) {                   
                    result = resultSet.getString("SENHA");                   
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                mysql.desconectar();
            }
        }
        return result;
    }
}
