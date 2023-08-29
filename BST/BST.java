package bst;

public class BST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data=data;
        }
    }

    public static Node insert(Node root, int val) {
        if(root==null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        
        return root;
    }

    public static void inorder (Node root) {
        if(root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root,int val) {
        if(root==null) return false;
        if(root.data==val) {
            return true;
        }
        if(root.data>val) {
            return search(root.left, val);
        } else return search(root.right, val);
    }

    public static Node delete(Node root, int val) {
        if(root.data > val) 
        {
            root.left = delete(root.left, val);
        } else if (root.data<val) {
            root.right= delete(root.right, val);
        }
        else {
            // Searching done, now process delete

            if(root.left == null && root.right==null) {
                return null;
            }
            if(root.left == null) {
                return root.right;
            } else if(root.right==null) {
                return root.left;
            }

            // class 3
            Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);

        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;

    }

    public static void main(String[] args) {
        int values[] = {1,2,3,4,5,6,7,8,9};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        // BST a = new BST();
        inorder(root);
        boolean res =   search(root, 4);
        System.out.println("\nData found "+res);

    }
}
