package Aula15_2205_CRUD;

import java.util.ArrayList;
import java.util.List;

public class VendaDAO {
    private List<Venda> vendas;
    private ClienteDAO cDAO;
    private ProdutoDAO pDAO;

    public VendaDAO() {
        this.vendas = new ArrayList<>();
    }
    
    public void adicionarVenda(Cliente idCliente, Produto idProduto, int idVenda, String formaPagamento, double valorTotal){
        if (cDAO.buscarCliente(idCliente) != null) {
            if (pDAO.buscarProduto(idProduto) != null) {
                this.vendas.add(new Venda(idCliente, idProduto, idVenda, formaPagamento, valorTotal));
            }
        }
    }
    
   public Venda buscarVenda(Venda idVenda){
       for(Venda v : this.vendas){
           if (v.getIdVenda() == idVenda.getIdVenda()) {
               return v;
           }
       }
       return null;
   }
   
   public void atualizarVenda(Cliente idCliente, Produto idProduto, int idVenda, String formaPagamento, double valorTotal){
       if (cDAO.buscarCliente(idCliente) != null) {
           if (pDAO.buscarProduto(idProduto) != null) {
               for(Venda v : this.vendas){
                   if (v.getIdVenda() == idVenda) {
                       v.setCliente(idCliente);
                       v.setProduto(idProduto);
                       v.setIdVenda(idVenda);
                       v.setFormaPagamento(formaPagamento);
                       v.setValorTotal(valorTotal);
                   }
               }
           }
       }
   }
   
   public void removerVenda(Cliente idCliente, Produto idProduto, int idVenda, String formaPagamento, double valorTotal){
       Venda remocaoVenda = null;
       if (cDAO.buscarCliente(idCliente) != null) {
           if (pDAO.buscarProduto(idProduto) != null) {
               for(Venda v : this.vendas){
                   if (v.getIdVenda() == idVenda) {
                       remocaoVenda = v;
                   }
               }
           }    
        }
       if (remocaoVenda != null) {
           vendas.remove(remocaoVenda);
       }
   }
   
   public String listarVendas(){
       for(Venda v : this.vendas){
           return v.toString();
       }
       return null;
   }
}
