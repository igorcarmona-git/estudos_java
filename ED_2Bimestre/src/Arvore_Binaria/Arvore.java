package Arvore_Binaria;
                                    //  "extends Comparable" --> Estou dizendo que ele é um tipo comparável, minha classe TIPO se extende, passa a ter o método compareTo();
// compareTo() --> retorna um valores:
//                                 0 --> é igual
//                                 1 --> é maior
//                                -1 --> é menor

public class Arvore<TIPO extends Comparable> {
    private Elemento<TIPO> raiz;
    
    public Arvore(){
        this.raiz = null;
    }
    
    public void adicionar(TIPO valor){
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
        
        if (raiz == null) {
            this.raiz = novoElemento;
        } else{
            Elemento<TIPO> atual = this.raiz;
            while(true){
                if(novoElemento.getValor().compareTo(atual.getValor()) == -1){
                    if(atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novoElemento);
                        break; //sai do laço ao setar novo valor
                    }
                }
                else{ //se for maior ou igual
                    if(atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novoElemento);
                        break;
                    }
                } 
            }
        }
    }
}
