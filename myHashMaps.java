import java.util.*;

// HashMap class takes generic parameters: K - key & V - Value
public class myHashMaps<K, V> {

        // Node class
        private class Node {
            K key;
            V value;

            public Node(K key, V value)
            {
                this.key = key;
                this.value = value;
            }
        }

        // variables and array of linkedlist initialization & instantiation
        private int n = 0;
        private int N;
        private LinkedList<Node>[] buckets;

        // hashmap class constructor
        @SuppressWarnings("unchecked")
        public myHashMaps()
        {
            this.N = 4;
            this.buckets = new LinkedList[N];

            for(int i = 0; i < buckets.length; i++)
            {
                buckets[i] = new LinkedList<>();
            }
        }

        // hash function to encrypt the data
        private int hashFunction(K key)
        {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        // function to search for a key in linkedlist
        private int searchLL(K key, int bi)
        {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for(int i = 0; i < ll.size(); i++)
            {
                if(ll.get(i).key == key)
                {
                    return di;
                }
                di++;
            }
            return -1;
        }

        // function for rehashing the array
        @SuppressWarnings("unchecked")
        private void rehash()
        {
            LinkedList<Node>[] temp = buckets;
            buckets = new LinkedList[N*2];
            N = N * 2;

            for(int i = 0; i < buckets.length; i++)
            {
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0; i < temp.length; i++)
            {
                LinkedList<Node> ll = temp[i];
                for(int j = 0; j < ll.size(); j++)
                {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        // function for adding element in hashmap
        public void put(K key, V value)
        {
            int bIdx = hashFunction(key);
            int dIdx = searchLL(key, bIdx);

            if(dIdx != -1)
            {
                Node node = buckets[bIdx].get(dIdx);
                node.value = value;
            }
            else
            {
                buckets[bIdx].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;

            if(lambda > 2.0)
            {
                rehash();
            }
        }

        // function to search for a key in hashmap
        public void containsKey(K key)
        {
            int bIdx = hashFunction(key);
            int dIdx = searchLL(key, bIdx);

            if(dIdx != -1)
            {
                System.out.println("Your key " + key + " is present in your hashmap.");
            }
            else
            {
                System.out.println("Your key " + key + " is not present in your hashmap.");
            }
        }

        // function to remove a key from hashmap
        public void remove(K key)
        {
            int bIdx = hashFunction(key);
            int dIdx = searchLL(key, bIdx);

            if(dIdx == -1)
            {
                System.out.println("Your key " + key + " is not present in your hashmap so cannot be removed.");
                return;
            }

            LinkedList<Node> ll = buckets[bIdx];
            Node node = ll.remove();
            n--;
            System.out.println("Node with key value= " + node.key + "has been removed successfully from your hashmap.");
        }

        // function to get a value of key in hashmap
        public void get(K key)
        {
            int bIdx = hashFunction(key);
            int dIdx = searchLL(key, bIdx);

            if(dIdx == -1)
            {
                System.out.println("Your key " + key + " is not present in your hashmap so cannot find it's value.");
                return;
            }

            LinkedList<Node> ll = buckets[bIdx];
            System.out.println("Node with key value= " + ll.get(dIdx).value + "has been removed successfully from your hashmap.");
        }

        // function for traversing the hashmap
        public ArrayList<K> keySet()
        {
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0; i < buckets.length; i++)
            {
                LinkedList<Node> ll = buckets[i];

                for(Node node:ll)
                {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public void traverseHashMap()
        {
            ArrayList<K> keys = keySet();
            for(K key:keys)
            {
                System.out.println(key);
            }
        }

        // function to check whether hashmap is empty or not
        public void isEmpty()
        {
            if(n == 0)
            {
                System.out.println("Your hashmap is empty.");
                return;
            }
            System.out.println("Your hashmap is not empty.");
        }
        public static void main(String[] args) {
        System.out.println("You are in HashMaps");
    }
}
    
    