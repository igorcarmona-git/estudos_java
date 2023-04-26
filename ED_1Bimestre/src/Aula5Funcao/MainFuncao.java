package Aula5Funcao;

public class MainFuncao {
    public static void main(String[] args) {
        int resultado = soma(10,5);
        
        System.out.println(resultado);
    }
    
    static public int soma(int x, int y){
        int result = x + y;
        
        return result;
    }
    
}

