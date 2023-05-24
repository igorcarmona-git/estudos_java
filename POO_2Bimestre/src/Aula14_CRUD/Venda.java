package Aula14_CRUD;

public class Venda {
    private int id;
    private Cliente cliente;
    private Produto produto;
    private String data;
    private String valor;
    
    //getters
    public int getId() {
        return id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Produto getProduto() {
        return produto;
    }
    public String getData() {
        return data;
    }
    public String getValor() {
        return valor;
    }
    
    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", cliente=" + cliente + ", produto=" + produto + ", data=" + data + ", valor=" + valor + '}';
    }
    
}
