package Arvore_Binaria;

//      O tipo genérico TIPO é utilizado na classe Elemento. Isso significa que a classe Elemento pode ser instanciada com qualquer tipo de dado fornecido pelo programador.

//      Ao declarar a classe Elemento<TIPO>, o <TIPO> indica um parâmetro genérico que pode ser substituído por qualquer tipo válido em tempo de compilação. 
//      Por exemplo, a classe Elemento<String> criará uma instância de Elemento com o tipo String, enquanto Elemento<Integer> criará uma instância com o tipo Integer.

//      O uso de tipos genéricos permite a reutilização do código, fornecendo flexibilidade para trabalhar com diferentes tipos de dados sem a necessidade de criar classes separadas para cada tipo.

public class Elemento<TIPO> {
    private TIPO valor;
    private Elemento<TIPO> esquerda;
    private Elemento<TIPO> direita;

    public Elemento(TIPO novoValor) {
        this.valor = novoValor;
        this.esquerda = null;
        this.direita = null;
    }

    public TIPO getValor() {
        return valor;
    }
    
    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public Elemento<TIPO> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento<TIPO> esquerda) {
        this.esquerda = esquerda;
    }

    public Elemento<TIPO> getDireita() {
        return direita;
    }

    public void setDireita(Elemento<TIPO> direita) {
        this.direita = direita;
    }
    
}
