class Node {
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}

public class myLL {

    static Node head = null;
    static Node tail = null;
    static int size = 0;

    public static void traverseLL()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void addFirstLL(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            traverseLL();
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("Your LinkedList is now:");
        traverseLL();
    }

    public static void addLastLL(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            traverseLL();
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
        System.out.println("Your LinkedList is now:");
        traverseLL();
    }

    public static void addMiddleLL(int data, int i)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            traverseLL();
            return;
        }
        int j = 0;
        Node prev = head;
        while(j < i-1)
        {
            j++;
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
        System.out.println("Your LinkedList is now:");
        traverseLL();
    }

    public static void removeFirstLL()
    {
        if(head == null)
        {
            System.out.println("LinkedList is null");
        }
        if(size == 1)
        {
            head = tail = null;
        }
        head = head.next;
        size--;
        traverseLL();
    }

    public static void removeLastLL()
    {
        if(head == null)
        {
            System.out.println("LinkedList is null");
        }
        if(size == 1)
        {
            head = tail = null;
        }
        Node temp = head;
        while(temp.next != tail)
        {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        traverseLL();
    }

    public static void removeMiddleLL(int i)
    {
        if(size < i)
        {
            System.out.println("You have entered an index that doesn't exist in your linked list");
            return;
        }
        if(head == null)
        {
            System.out.println("LinkedList is null");
        }
        if(size == 1)
        {
            head = tail = null;
        }
        Node temp = head;
        int y = 0;
        while(y < size-i)
        {
            y++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        traverseLL();
    }

    public static void iterativeSearch(int k)
    {
        Node temp = head;
        int i = 0;
        while(temp != null)
        {
            if(temp.data == k)
            {
                System.out.println("The element " + k + " was found in " + i + " index of your LinkedList");
            }
            i++;
            temp = temp.next;
        }
    }

    public static void recursiveSearch(int k)
    {
        Node temp = head;
        int x = recursiveSearchHelper(temp, k);

        if(x == -1)
        {
            System.out.println("The element " + k + " was not found in your linked list.");
            return;
        }

        System.out.println("The element " + k + " was found in " + x + " index of your LinkedList");
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
        System.out.println("You're in LinkedLists");
    }
}
