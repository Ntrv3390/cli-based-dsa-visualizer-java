public class myTries {
    
    // Node class
    static class Node {
        Node[] children = new Node[26];
        boolean endOfWord = false;

        public Node()
        {
            for(int i = 0; i < children.length; i++)
            {
                children[i] = null;
            }
        }
    }
        // initialization of empty root node
        static Node root = new Node();

        // method for inserting a trie
        public static void insert(String word)
        {
            Node curr = root;

            for(int i = 0; i < word.length(); i++)
            {
                int idx = word.charAt(i) - 'a';
                if(curr.children[idx] == null)
                {
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];
            }
            curr.endOfWord = true;
        }

        // method for searching in a trie
        public static void search(String key)
        {
            Node curr = root;

            for(int i = 0; i < key.length(); i++)
            {
                int idx = key.charAt(i) - 'a';
                if(curr.children[idx] == null)
                {
                    System.out.println("The word " + key + " doesn't exists in your trie.");
                    return;
                }
                curr = curr.children[idx];
            }
            if(curr.endOfWord == true)
            {
                System.out.println("The word " + key + " exists in your trie.");
            }
            else
            {
                System.out.println("The word " + key + " doesn't exists in your trie.");
            }
        }

    public static void main(String[] args) {
        System.out.println("You are in tries.");
    }
}