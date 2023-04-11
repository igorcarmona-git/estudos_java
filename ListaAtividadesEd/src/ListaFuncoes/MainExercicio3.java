//3. Escreva uma função que receba uma string como entrada e verifique se essa
//string é um palíndromo (ou seja, se pode ser lida da mesma maneira da
//esquerda para a direita e vice-versa). A função deve retornar verdadeiro se for
//um palíndromo e falso se não for.

//Para transformar um vetor em uma string em Java, você pode utilizar a classe Arrays e o método toString. 

// word.length() - 1 --> ultima posição do vetor.
package ListaFuncoes;

import java.util.Arrays;

public class MainExercicio3 {
    public static void main(String[] args) {
        System.out.println("A palavra eh palindroma: " + verificarPalavra("arara"));
    }
    
    public static boolean verificarPalavra(String word){
        char[] palavra = new char[word.length()];
        char[] palavraCompleta = new char[word.length()];
        char[] aux = new char[word.length()];
        
        for (int i = 0; i < word.length(); i++){
            //"charAt(index)" --> retorna o caractere em cada posição da palavra.
            palavra[i] = word.charAt(i);
            aux[i] = palavra[i];
        }
        
        // armazena os valores no vetor a partir das ultimas posicoes
        int cont = 0;
        for (int j = word.length() -1; j >= 0 ; j--){
            palavraCompleta[cont] = aux[j];
            cont += 1;
        }
        
        String frase1 = Arrays.toString(palavraCompleta);
        String frase2 = Arrays.toString(palavra);
        
        System.out.println(frase1);
        System.out.println(frase2);
        // "Arrays.equals" --> Verifica se o array tem o mesmo tamanho e a mesma ordem de caracteres.
        return frase1.equals(frase2);
    }
}
