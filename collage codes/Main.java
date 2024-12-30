
class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}
class BST {
    Node root;

    BST() {
        root = null;
    }

    
    void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left);

        
        System.out.print(node.value + " ");

        
        inOrderTraversal(node.right);
    }


    void inOrder() {
        inOrderTraversal(root);
    }

    
    void insert(int value) {
        root = insertRec(root, value);
    }

    
    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);}

        return root;
    }
}


public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("In-order traversal of the BST:");
        bst.inOrder();
    }
}
