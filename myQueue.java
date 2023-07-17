class Node {
    int data;
    Node next;

    // constructor for node class
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}

public class myQueue {

    // static variables declatation
    static Node head = null;
    static Node tail = null;
    static int size = 0;

    // method for traversing a queue
    public static void traverseQueue()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // method for adding element at last position
    public static void enqueue(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            traverseQueue();
            return;
        }
        newNode.next = head;
        tail = newNode;
        size++;
        System.out.println("Your Queue is now: ");
        traverseQueue();
    }

    // method for removing first element
    public static void dequeue()
    {
        if(head == null)
        {
            System.out.println("Queue is null ");
            traverseQueue();
            return;
        }
        if(size == 1)
        {
            System.out.println("Removed data is: " + head.data);
            head = tail = null;
            traverseQueue();
            return;
        }
        System.out.println("Removed data is: " + head.data);
        head = head.next;
        size--;
        traverseQueue();
    }

    // method for for performing iterative search
    public static void iterativeSearch(int k)
    {
        Node temp = tail;
        int i = 0;
        while(temp != null)
        {
            if(temp.data == k)
            {
                System.out.println("The element " + k + " was found in " + i + " index of your Queue");
            }
            i++;
            temp = temp.next;
        }
    }

    // method for for performing recursive search
    public static void recursiveSearch(int k)
    {
        Node temp = tail;
        int x = recursiveSearchHelper(temp, k);

        if(x == -1)
        {
            System.out.println("The element " + k + " was not found in your Queue.");
            return;
        }

        System.out.println("The element " + k + " was found in " + x + " index of your Queue");
    }

    public static int recursiveSearchHelper(Node temp, int k)
    {
        if(temp == null)
        {
            return -1;
        }

        int idx = recursiveSearchHelper(temp.next, k);

        if(temp.data == k)
        {
            idx = 0;
        }

        if(idx == -1)
        {
            return -1;
        }

        return idx+1;
    }


    public static void main(String[] args) {
        System.out.println("You're in Queues.");
    }
}
