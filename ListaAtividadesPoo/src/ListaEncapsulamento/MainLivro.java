//7. Crie uma classe chamada Livro com os atributos titulo, autor e ano. Crie métodos
//para definir e obter os valores desses atributos, bem como para exibir uma
//mensagem informando os detalhes do livro. Crie um objeto do tipo Livro e exiba
//suas informações.

package ListaEncapsulamento;

public class MainLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O canto da Sereia", "Igor Carmona", 2023);
        Livro livro2 = new Livro("Sexta feira 13", "Pedrinho", 2021);
        
        //printa na tela os detalhes do livro
        livro1.detalhesLivro();
        livro2.detalhesLivro();
    }
    
}
