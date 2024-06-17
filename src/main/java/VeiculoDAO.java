import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDAO {
    
    public void insertMySQL(String marca, String modelo, int anoFabricacao, String placa, String cor, String tipo) {
        MySQLConnection mysql = new MySQLConnection();
        Connection connection = mysql.getConexao();
        if (connection != null) {
            try {
                String campos = "MARCA, MODELO, ANOFABRICACAO, PLACA, COR, TIPO";
                String valores = "?, ?, ?, ?, ?, ?";
                String sql = "INSERT INTO veiculo ("+ campos +") VALUES (" + valores + ")";
                
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, marca);
                statement.setString(2, modelo);
                statement.setInt(3, anoFabricacao);
                statement.setString(4, placa);
                statement.setString(5, cor);
                statement.setString(6, tipo);
                
                int qtdeCad = statement.executeUpdate();
                if (qtdeCad > 0) {
                    System.out.println("Registro inserido com sucesso!");
                } else {
                    System.out.println("Erro ao inserir registro.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                mysql.desconectar();
            }
        }
    }
    
    public List<Veiculo> selectMySQL() {
        MySQLConnection mysql = new MySQLConnection();
        Connection connection = mysql.getConexao();
        List<Veiculo> veiculos = new ArrayList<>();
        if (connection != null) {
            try {
                String query = "SELECT * FROM veiculo";
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();
                
                while (resultSet.next()) {
                    Veiculo veiculo = new Veiculo();
                    veiculo.setId(resultSet.getInt("IDVEICULO"));
                    veiculo.setMarca(resultSet.getString("MARCA"));
                    veiculo.setModelo(resultSet.getString("MODELO"));
                    veiculo.setAnoFabricacao(resultSet.getInt("ANOFABRICACAO"));
                    veiculo.setPlaca(resultSet.getString("PLACA"));
                    veiculo.setCor(resultSet.getString("COR"));
                    veiculo.setTipo(resultSet.getString("TIPO"));
                    veiculos.add(veiculo);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                mysql.desconectar();
            }
        }
        return veiculos;
    }
     
    public void deleteMySQL(String id) {
        MySQLConnection mysql = new MySQLConnection();
        Connection connection = mysql.getConexao();
        if (connection != null) {
            try {
                String query = "DELETE FROM veiculo WHERE IDVEICULO=" + id;
                PreparedStatement statement = connection.prepareStatement(query);
				int qtdeCad = statement.executeUpdate();
                if (qtdeCad > 0) {
                    System.out.println("Registro excluído com sucesso!");
                } else {
                    System.out.println("Erro ao excluir registro.");
		}
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                mysql.desconectar();
            }
        }
    }
}
