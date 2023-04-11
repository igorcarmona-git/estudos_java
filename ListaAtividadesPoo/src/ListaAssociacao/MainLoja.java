//5. Crie uma classe Loja que possua uma associação com a classe Produto. A classe
//Produto deve possuir os atributos nome e preco. Crie também um método na
//classe Loja chamado vender que recebe um parâmetro do tipo Produto e exibe
//a mensagem "Vendendo produto..."

package ListaAssociacao;

public class MainLoja {
    public static void main(String[] args) {
        Loja loja = new Loja();
        Produto produto = new Produto("Torta", 5.50);
        
        loja.setProduto(produto);
        
        System.out.println(loja.vender(produto) + loja.getProduto().getNome()); //associacao
        System.out.println("Valor: " + loja.getProduto().getPreco()); //associacao
    }
    
}
