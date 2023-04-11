package aula4;

public class MainCarro {
    public static void main(String[] args) {
//        Crie uma classe chamada Carro com os atributos marca, modelo e ano. Crie;
//        métodos para definir e obter os valores desses atributos. Crie um objeto do tipo
//        Carro e exiba seus valores.
        
        CarroAula4 camaro = new CarroAula4();
        
        camaro.setMarca("Fiat");
        camaro.setModelo("Camaro");
        camaro.setAno(2020);
        
        System.out.println(" A marca do veiculo: " + camaro.getMarca());
        System.out.println(" O modelo do veiculo: " + camaro.getModelo());
        System.out.println(" O ano do veiculo: " + camaro.getAno());
    }
    
}
