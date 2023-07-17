import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.println("Enter your choice.\nPress 1 to visualize arrays.\nPress 2 to visualize LinkedList.\nPress 3 to visualize Stack.\nPress 4 to visualize Queue.\n");
        s = sc.nextInt();
        int a = 1;
        while(a != 0){
                switch(s)
                {
                case 1: System.out.println("Welcome to Arrays Visualization.");
                        System.out.print("Enter number of elements of arrays: ");
                        int n = sc.nextInt();
                        myArrays.createArray(n);
                        System.out.println("Great your array of size " + n + " is created");
                        System.out.println("Now add " + n + " elements in your array");
                        myArrays.addElementsArray();
                        System.out.println("Great all elements have been added in your array.");
                        int xArr = 1;
                        while(xArr != 0)
                        {
                                System.out.println("Now what would you like to do with your array?\nPress 1 to traverse.\nPress 2 to search.\nPress 3 to sort.");
                                int y = sc.nextInt();
                                switch(y)
                                {
                                case 1: System.out.println("Welcome to traversal of arrays.");
                                        System.out.println("Your array is: ");
                                        myArrays.traverseArray();
                                        System.out.println("Thank you for traversing!");
                                        break;

                                case 2: System.out.println("Welcome to searching in arrays.\nPress 1 to search using linear search.\nPress 2 to search using binary search");
                                        int se = sc.nextInt();
                                        System.out.print("Enter an element to search in your array: ");
                                        int arrKey = sc.nextInt();
                                        switch(se){
                                                case 1: myArrays.linearSearch(arrKey);
                                                        break;

                                                case 2: myArrays.binarySearch(0, n-1,arrKey);
                                                        break;

                                                default: System.out.println("Default case is linear search.");
                                                        myArrays.linearSearch(arrKey);
                                                        break;  
                                        }
                                        break;
                                
                                case 3: System.out.println("Welcome to sorting in arrays.\nPress 1 to sort using Merge Sort.\nPress 2 to sort using Quick Sort.");
                                        int so = sc.nextInt();
                                        switch(so){
                                                case 1: System.out.println("Welcome to Merge Sort.\nYour sorted array is: ");
                                                        myArrays.mergeSortArray(0, n-1);
                                                        myArrays.traverseArray();
                                                        break;

                                                case 2: System.out.println("Welcome to Quick Sort.\nYour sorted array is: ");
                                                        myArrays.quickSortArray(0 , n-1);
                                                        myArrays.traverseArray();
                                                        break;
                                                
                                                default: System.out.println("Default case in merge sort.");
                                                        System.out.println("Welcome to Merge Sort.\nYour sorted array is: ");
                                                        myArrays.mergeSortArray(0, n-1);
                                                        myArrays.traverseArray();
                                                        break;
                                        }
                                        break;

                                default: System.out.println("Default is traversal.");
                                         System.out.println("Your array is: ");
                                         myArrays.traverseArray();
                                         System.out.println("Thank you for traversing!");
                                         break;

                                }
                                System.out.print("If you wish to leave enter 0 or enter any number to continue: ");
                                xArr = sc.nextInt();
                        }
                        System.out.println("Thank you for visualizaing arrays!");
                        break;

                        case 2: System.out.println("Welcome to LinkedLists Visualization.");
                                int xLL = 1;
                                while(xLL != 0)
                                {
                                        System.out.println("What would you like to do with your linkedList?\nPress 1 to traverse the Linked List.\nPress 2 to add element tot the first position.\nPress 3 to add element to the last position.\nPress 4 to add element in a middle position.\nPress 5 to remove element from first position.\nPress 6 to remove element from last position.\nPress 7 to remove an element from random index of your linked list.\nPress 8 to perform iterative search on your linked list.\nPress 9 to perform recursive search on your linked list.\n");
                                        int yLL = sc.nextInt();
                                        switch(yLL)
                                        {
                                                case 1: myLL.traverseLL();
                                                        break;

                                                case 2: System.out.println("Enter a data to add at first position in the linked list.");
                                                        int data1 = sc.nextInt();
                                                        myLL.addFirstLL(data1);
                                                        break;

                                                case 3: System.out.println("Enter a data to add at last position in the linked list.");
                                                        int data2 = sc.nextInt();
                                                        myLL.addLastLL(data2);
                                                        break;

                                                case 4: System.out.print("Enter a data to add in middle of the linked list: ");
                                                        int data3 = sc.nextInt();
                                                        System.out.print("Enter the index at which you want to add the data: ");
                                                        int idx = sc.nextInt();
                                                        myLL.addMiddleLL(data3, idx);
                                                        break;

                                                case 5: myLL.removeFirstLL();
                                                        break;

                                                case 6: myLL.removeLastLL();
                                                        break;
                                                
                                                case 7: System.out.print("Enter the index of which you want to remove the element: ");
                                                        int kre = sc.nextInt();
                                                        myLL.removeMiddleLL(kre);
                                                        break;

                                                case 8: System.out.print("Enter a key to perform search iteratively: ");
                                                        int ki = sc.nextInt();
                                                        myLL.iterativeSearch(ki);
                                                        break; 

                                                case 9: System.out.print("Enter a key to perform search recursively: ");
                                                        int kr = sc.nextInt();
                                                        myLL.recursiveSearch(kr);
                                                        break;                

                                                default: System.out.println("Default is traversing the linkedlist.");
                                                         myLL.traverseLL();
                                                         break;
                                        }
                                        System.out.print("If you wish to leave enter 0 or enter any number to continue: ");
                                        xLL = sc.nextInt();
                                }
                                break;
                        
                        case 3: System.out.println("Welcome to Stacks Visualization");
                                int xS = 1;
                                while(xS != 0)
                                {
                                        System.out.println("What would you like to do with your stack?\nPress 1 to traverse it.\nPress 2 to add an element in the stack.\nPress 3 to remove element from stack.\nPress 4 to get the top most data from the stack.\nPress 5 to search an element iteratively.\nPress 6 to search an element recursively.\n");
                                        int yS = sc.nextInt();
                                        switch(yS)
                                        {
                                                case 1: myStack.traverseStack();
                                                        break;

                                                case 2: System.out.println("Enter a data to add in your stack.");
                                                        int data1 = sc.nextInt();
                                                        myStack.push(data1);
                                                        break;

                                                case 3: myStack.pop();
                                                        System.out.println("Data removed successfully");
                                                        break;

                                                case 4: myStack.peek();
                                                        break;

                                                case 5: System.out.print("Enter a key to perform search iteratively: ");
                                                        int ki = sc.nextInt();
                                                        myStack.iterativeSearch(ki);
                                                        break; 

                                                case 6: System.out.print("Enter a key to perform search recursively: ");
                                                        int kr = sc.nextInt();
                                                        myStack.recursiveSearch(kr);
                                                        break;                

                                                default: System.out.println("Default is traversing the stack.");
                                                         myStack.traverseStack();
                                                         break;
                                        }
                                }
                                break;
                        
                        case 4: System.out.println("Welcome to Queues Visualization");
                                int xQ = 1;
                                while(xQ != 0)
                                {
                                        System.out.println("What would you like to do with your queue?\nPress 1 to traverse it.\nPress 2 to add an element in the queue.\nPress 3 to remove element from queue.\nPress 4 to search an element iteratively.\nPress 5 to search an element recursively.\n");
                                        int yQ = sc.nextInt();
                                        switch(yQ)
                                        {
                                                case 1: myQueue.traverseQueue();
                                                        break;

                                                case 2: System.out.println("Enter a data to add in your queue.");
                                                        int data1 = sc.nextInt();
                                                        myQueue.enqueue(data1);
                                                        break;

                                                case 3: myQueue.dequeue();
                                                        System.out.println("Data removed successfully");
                                                        break;

                                                case 4: System.out.print("Enter a key to perform search iteratively: ");
                                                        int ki = sc.nextInt();
                                                        myQueue.iterativeSearch(ki);
                                                        break; 

                                                case 5: System.out.print("Enter a key to perform search recursively: ");
                                                        int kr = sc.nextInt();
                                                        myQueue.recursiveSearch(kr);
                                                        break;                

                                                default: System.out.println("Default is traversing the queue.");
                                                         myQueue.traverseQueue();
                                                         break;
                                        }
                                }
                                break;

                        default: System.out.println("Please enter a correct number corresponding to the paricular data structure");
                                 break;         
                }
                System.out.println("To exit enter 0 else enter any number to continue.");
        }        
    }
}