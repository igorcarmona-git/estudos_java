//8. Crie uma classe chamada Ponto com os atributos x e y. Crie métodos para definir
//e obter os valores desses atributos, bem como para calcular a distância entre
//dois pontos. Crie dois objetos do tipo Ponto e calcule a distância entre eles.

package ListaEncapsulamento;

public class MainPonto {
    public static void main(String[] args) {
        Ponto1 p1 = new Ponto1(30, 30);
        Ponto2 p2 = new Ponto2(10, 15);
        
        System.out.println("A distancia entre os pontos: " + (p1.calcularDistancia(p1) - p2.calcularDistancia(p2)));
    }
    
}
