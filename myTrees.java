import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class myTrees {
    // static array to make a static tree using preorder
    static int[] arrTrees = { 5, 4, 6, 7, 8, -1, 5, 2, -1, -1, 9, -1, -1, -1, -1, -1, -1 };

    // static variables instantiation & initialization
    static int idx = -1;
    static Node root;

    // method to create tress using preorder
    public static Node createTrees() {
        idx++;
        if (arrTrees[idx] == -1) {
            return null;
        }
        root = new Node(arrTrees[idx]);
        root.left = createTrees();
        root.right = createTrees();

        return root;
    }

    // preorder traversal of trees
    public static void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // inorder traversal of trees
    public static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // postorder traversal of trees
    public static void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // levelorder traversal of trees
    public static void levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data);
                if(currNode.left != null)
                {
                    q.add(currNode.left);
                }
                
                if(currNode.left != null)
                {
                    q.add(currNode.right);
                }     
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("You're in trees.");
        Node node = createTrees();
        preorder(node);
        inorder(node);
        postorder(node);
        levelorder(node);
    }
}