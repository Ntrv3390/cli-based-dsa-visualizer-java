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

public class myStack {

    // static variables declatation
    static Node head = null;
    static int size = 0;

    // method for traversing a stack
    public static void traverseStack()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // method for adding element at top position
    public static void push(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            traverseStack();
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("Your Stack is now: ");
        traverseStack();
    }

    // method for removing top element
    public static void pop()
    {
        if(head == null)
        {
            System.out.println("Stack is null ");
            traverseStack();
            return;
        }
        if(size == 1)
        {
            System.out.println("Removed data is: " + head.data);
            head = null;
            traverseStack();
            return;
        }
        System.out.println("Removed data is: " + head.data);
        head = head.next;
        size--;
        traverseStack();
    }

    // method for printing element at top position
    public static void peek()
    {
        System.out.println("The data on the top of your Stack is: " + head.data);
    }

    // method for for performing iterative search
    public static void iterativeSearch(int k)
    {
        Node temp = head;
        int i = 0;
        while(temp != null)
        {
            if(temp.data == k)
            {
                System.out.println("The element " + k + " was found in " + i + " index of your Stack");
            }
            i++;
            temp = temp.next;
        }
    }

    // method for for performing recursive search
    public static void recursiveSearch(int k)
    {
        Node temp = head;
        int x = recursiveSearchHelper(temp, k);

        if(x == -1)
        {
            System.out.println("The element " + k + " was not found in your Stack.");
            return;
        }

        System.out.println("The element " + k + " was found in " + x + " index of your Stack");
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
        System.out.println("You're in Stacks.");
    }
}
