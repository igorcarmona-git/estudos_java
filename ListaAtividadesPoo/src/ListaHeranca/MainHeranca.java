package ListaHeranca;

public class MainHeranca {
    public static void main(String[] args) {
        Professor joao = new Professor("Joao", 25, 1.78, 75);
        joao.setEspecialization("Tecnologia");
        
        System.out.println("O professor: " + joao.getNome() + " | Especializado em: " + joao.getEspecialization());
        
        Gato gato = new Gato("Fiuky", "Ciamez", 8);
        gato.setCorPelo("Preto");
        System.out.println("O professor tem gato de nome: " + gato.getNome() + " | Cor: " + gato.getCorPelo() + " | Tipo: " + gato.getTipo());
        
        Cachorro dog = new Cachorro("Chuchu", "Grande", 12);
        dog.setRaca("Pitbull");
        System.out.println("O professor tem cachorro de nome: " + dog.getNome() + " | Raca: " + dog.getRaca() + " | Idade: " + dog.getIdade());
        
    }
}