package Aula15_2205_CRUD;

public class Venda {
    private Cliente cliente;
    private Produto produto;
    private int idVenda;
    private String formaPagamento;
    private double valorTotal;
    
    //getters
    public Cliente getCliente() {
        return cliente;
    }
    public Produto getProduto() {
        return produto;
    }
    public int getIdVenda() {
        return idVenda;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    
    //setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    //construtor
    public Venda(Cliente cliente, Produto produto, int idVenda, String formaPagamento, double valorTotal) {
        this.cliente = cliente;
        this.produto = produto;
        this.idVenda = idVenda;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Venda{" + "cliente=" + cliente + ", produto=" + produto + ", idVenda=" + idVenda + ", formaPagamento=" + formaPagamento + ", valorTotal=" + valorTotal + '}';
    }
    
}
