public class Veiculo extends VeiculoDAO {
    private int id;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String placa;
    private String cor;
    private String tipo;
    
    Veiculo() {
        this.id = 0;
        this.marca = "";
        this.modelo = "";
        this.anoFabricacao = 0;
        this.placa = "";
        this.cor = "";
        this.tipo = "";
    }
    
    public void cadastrar() {
        insertMySQL(marca, modelo, anoFabricacao, placa, cor, tipo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
