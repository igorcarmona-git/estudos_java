//As interfaces permitem definir contratos que as classes devem cumprir, 
//fornecendo uma maneira de definir métodos que devem ser implementados por todas as classes que as implementam.

//É bem parecido com a classe abstrata. só que a Classe Interface, todos os métodos devem aparecer nas classes filhas.
//Em uma classe abstrata, você pode ter métodos abstratos e métodos concretos, mas em uma interface, todos os métodos são abstratos. (Exemplo na classe Retangulo)

package Aula13_Interfaces;

public interface Forma {
    public double calcularArea();
    public double calcularPerimetro();
    String getNome();

    // Constante
    String UNIDADE_MEDIDA = "cm";
}

