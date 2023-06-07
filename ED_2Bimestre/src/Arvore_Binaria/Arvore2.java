package Arvore_Binaria;

public class Arvore2 {
    Elemento2 cabeca;

    public Arvore2() {
        cabeca = null;
    }

    void insert(int data) {
        cabeca = insertRec(cabeca, data);
    }

    Elemento2 insertRec(Elemento2 root, int data) {
        if (root == null) {
            root = new Elemento2(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    void inorder() {
        inorderRec(cabeca);
    }

    void inorderRec(Elemento2 root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }    
}
