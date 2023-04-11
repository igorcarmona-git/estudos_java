package ListaEncapsulamento;

public class Ponto2 {
    private int x;
    private int y;
    
    //getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
    //setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    //constructor
    public Ponto2(int x, int y){
        this.x =x;
        this.y = y;
    }
    
    //metodo passando object inteiro como parametro
    public int calcularDistancia(Object ponto2){
        int result = x + y;
        
        return result;
    }
}
