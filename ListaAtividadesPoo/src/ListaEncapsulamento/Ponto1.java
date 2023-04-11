package ListaEncapsulamento;

public class Ponto1 {
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
    public Ponto1(int x, int y){
        this.x =x;
        this.y = y;
    }
    
    //metodos
    public int calcularDistancia(Object ponto1){
        int result = x + y;
        
        return result;
    }
}
