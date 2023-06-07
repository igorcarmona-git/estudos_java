package Arvore_Binaria;

public class MainArvore2 {
    public static void main(String[] args) {
        Arvore2 tree = new Arvore2();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();
    }
}
   
