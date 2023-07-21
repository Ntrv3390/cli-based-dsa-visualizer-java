import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.println("Enter your choice.\nPress 1 to visualize arrays.\nPress 2 to visualize LinkedList.\nPress 3 to visualize Stack.\nPress 4 to visualize Queue.\nPress 5 to visualize Trees.\nPress 6 to visualize Heaps (Priority Queues).\nPress 7 to visualize HashMaps.\nPress 8 to visualize Tries.\nPress 9 to visualize Graphs.\n");
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
                                System.out.println("Thank you for visualizing LinkedLists");
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
                                        System.out.print("If you wish to leave enter 0 or enter any number to continue: ");
                                        xS = sc.nextInt();
                                }
                                System.out.println("Thank you for visualizing Stacks");
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
                                        System.out.print("If you wish to leave enter 0 or enter any number to continue: ");
                                        xQ = sc.nextInt();
                                }
                                System.out.println("Thank you for visualizing Queues");
                                break;

                        case 5: System.out.println("Welcome to Tress Visualization");
                                int xT = 1;
                                Node node = myTrees.createTrees();
                                System.out.println("Hurray!! Your tress has been created.");
                                while(xT != 0)
                                {
                                        System.out.println("What would you like to do with your tree?\nPress 1 to traverse it using preorder.\nPress 2 to traverse it using inorder.\nPress 3 to traverse it using postorder.\nPress 4 to traverse it using level order.\nPress 5 to count nodes of your tree.\nPress 6 to calculate the sum of the data of all nodes of your tree.\n");
                                        int yT = sc.nextInt();
                                        switch(yT)
                                        {
                                                case 1: System.out.println("Preorder traversal of your tree is: ");
                                                        myTrees.preorder(node);
                                                        break;

                                                case 2: System.out.println("Inorder traversal of your tree is: ");
                                                        myTrees.inorder(node);
                                                        break;

                                                case 3: System.out.println("Postorder traversal of your tree is: ");
                                                        myTrees.postorder(node);
                                                        break;

                                                case 4: System.out.println("Levelorder traversal of your tree is: ");
                                                        myTrees.levelorder(node);
                                                        break; 

                                                case 5: System.out.println("No of nodes present in your tree is: " + myTrees.countNodes(node));
                                                        break;
                                                
                                                case 6: System.out.println("Sum of the data of all nodes of your tress is: " + myTrees.countData(node));
                                                        break;

                                                default: System.out.println("Default is traversing the tree using inorder.");
                                                         myTrees.preorder(node);
                                                                break;
                                        }
                                        System.out.print("If you wish to leave enter 0 or enter any number to continue: ");
                                        xT = sc.nextInt();
                                }
                                System.out.println("Thank you for visualizing trees");
                                break;
                        
                        case 6: System.out.println("Welcome to Heaps Visualization");
                                int xH = 1;
                                ArrayList<Integer> arr = new ArrayList<>();
                                while(xH != 0)
                                {
                                        System.out.println("What would you like to do with your heap?\nEnter 1 to add new data in your heap.\nEnter 2 to print the peek element of your heap.\nEnter 3 to traverse your heap.\nEnter 4 to remove the priority element for your heap.\nEnter 5 to sort your heap using heap sort.\n");
                                        int yH = sc.nextInt();
                                        switch(yH)
                                        {
                                                case 1: System.out.print("Enter number of elements to add in your heap: ");
                                                        int heapData = sc.nextInt();
                                                        System.out.println("Enter " + heapData + " elements to add");
                                                        
                                                        int i = 0;
                                                        while(i < heapData)
                                                        {
                                                              System.out.print("Enter " + (i+1) + "th data in the heap: ");  
                                                              int data = sc.nextInt();  
                                                              myHeaps.addMinHeap(arr, data);
                                                              i++;
                                                        }
                                                        System.out.println("All elements added to your heap.");
                                                        break;

                                                case 2: myHeaps.peekHeap(arr);
                                                        break;

                                                case 3: myHeaps.traverseHeap(arr);
                                                        break;

                                                case 4: myHeaps.removeHeap(arr);
                                                        break;

                                                case 5: myHeaps.heapSort(arr);
                                                        break;

                                                default: System.out.println("Default is adding a data in the heap.");
                                                         System.out.print("Enter number of elements to add in your heap: ");
                                                         int heapData1 = sc.nextInt();
                                                         System.out.println("Enter " + heapData1 + " elements to add");
                                                         int j = 0;
                                                         while(j < heapData1)
                                                         {
                                                              System.out.println("Enter " + (j+1) + "th data in the heap");  
                                                              int data = sc.nextInt();  
                                                              myHeaps.addMinHeap(arr, data);
                                                              j++;
                                                         }
                                                         System.out.println("All elements added to your heap.");
                                                         break;
                                        }
                                        System.out.print("If you wish to leave enter 0 or enter any number to continue: ");
                                        xH = sc.nextInt();
                                }
                                System.out.println("Thank you for visualizing heaps");
                                break;

                        case 7: System.out.println("Welcome to HashMaps Visualization");
                                int xHa = 1;
                                myHashMaps<Integer, Integer> hm = new myHashMaps<>();
                                while(xHa != 0)
                                {
                                        System.out.println("What would you like to do with your hashmap?\nEnter 1 to add elements in your hashmap.\nEnter 2 to search if key exists or not.\nEnter 3 to remove a key from hashmap.\nEnter 4 to get a key's value from hashmap.\nEnter 5 to traverse the hashmap.\n");
                                        int yHa = sc.nextInt();
                                        switch(yHa)
                                        {
                                                case 1: System.out.print("Enter number of elements to add in your hashmap: ");
                                                        int keyData = sc.nextInt();
                                                        System.out.println("Enter " + keyData + " elements to add");
                                                        
                                                        int i = 0;
                                                        while(i < keyData)
                                                        {
                                                              System.out.print("Enter " + (i+1) + "th key in the hashmap: ");  
                                                              int key = sc.nextInt(); 
                                                              System.out.print("Enter " + (i+1) + "th data in the hashmap: ");  
                                                              int value = sc.nextInt();  
                                                              hm.put(key, value);
                                                              i++;
                                                        }
                                                        System.out.println("All elements added to your hashmap.");
                                                        break;

                                                case 2: System.out.print("Enter a key value to search: ");
                                                        int key1 = sc.nextInt();
                                                        hm.containsKey(key1);
                                                        break;

                                                case 3: System.out.print("Enter a key value to remove: ");
                                                        int key2 = sc.nextInt();
                                                        hm.remove(key2);
                                                        break;

                                                case 4: System.out.print("Enter a key value to get it's value: ");
                                                        int key3 = sc.nextInt();
                                                        hm.get(key3);
                                                        break;

                                                case 5: hm.traverseHashMap();
                                                        break;

                                                default: System.out.println("Default is adding a data in the hashmap.");
                                                         System.out.print("Enter number of elements to add in your hashmap: ");
                                                         int keyData1 = sc.nextInt();
                                                         System.out.println("Enter " + keyData1 + " elements to add");
                                                        
                                                         int j = 0;
                                                         while(j < keyData1)
                                                         {
                                                              System.out.print("Enter " + (j+1) + "th key in the hashmap: ");  
                                                              int key = sc.nextInt(); 
                                                              System.out.print("Enter " + (j+1) + "th data in the hashmap: ");  
                                                              int value = sc.nextInt();  
                                                              hm.put(key, value);
                                                              j++;
                                                         }
                                                         System.out.println("All elements added to your hashmap.");
                                                         break;
                                        }
                                        System.out.print("If you wish to leave enter 0 or enter any number to continue: ");
                                        xHa = sc.nextInt();
                                }
                                System.out.println("Thank you for visualizing hashmaps");
                                break;
                                
                        case 8: System.out.println("Welcome to Tries Visualization");
                                int xTr = 1;
                                while(xTr != 0)
                                {
                                        System.out.println("What would you like to do with your tries?\nEnter 1 to add strings in your trie.\nEnter 2 to search if a string exists or not in your trie.\n");
                                        int yTr = sc.nextInt();
                                        switch(yTr)
                                        {
                                                case 1: System.out.print("Enter number of strings to add in your trie: ");
                                                        int nS = sc.nextInt();
                                                        System.out.println("Enter " + nS + " strings to add");
                                                        
                                                        int i = 0;
                                                        sc.nextLine();
                                                        while(i < nS)
                                                        {
                                                              System.out.print("Enter " + (i+1) + "th string in the trie: ");  
                                                              String key = sc.nextLine(); 
                                                              myTries.insert(key);
                                                              i++;
                                                        }
                                                        System.out.println("All strings added to your trie.");
                                                        break;

                                                case 2: System.out.print("Enter a key value to search a word: ");
                                                        sc.nextLine();
                                                        String key1 = sc.nextLine();
                                                        myTries.search(key1);
                                                        break;


                                                default: System.out.print("Enter number of strings to add in your trie: ");
                                                        int nS1 = sc.nextInt();
                                                        System.out.println("Enter " + nS1 + " strings to add");
                                                        
                                                        int j = 0;
                                                        while(j < nS1)
                                                        {
                                                              System.out.print("Enter " + (j+1) + "th string in the trie: ");  
                                                              String key = sc.nextLine(); 
                                                              myTries.insert(key);
                                                              j++;
                                                        }
                                                        System.out.println("All strings added to your trie.");
                                                        break;
                                        }
                                        System.out.print("If you wish to leave enter 0 or enter any number to continue: ");
                                        xTr = sc.nextInt();
                                }
                                System.out.println("Thank you for visualizing Tries.");
                                break;

                        case 9: System.out.println("Welcome to Graphs Visualization");
                                int xG = 1;
                                while(xG != 0)
                                {
                                        System.out.println("What would you like to do with your graph?\nEnter 1 to insert edges in the graph.\nEnter 2 to traverse the graph using breadth first search(bfs).\nEnter 3 to traverse the graph using depth first search(dfs).\n");
                                        int yG = sc.nextInt();
                                        switch(yG)
                                        {
                                                case 1: System.out.println("You can enter maximum of 5 edges.");
                                                        myGraphs.insert();
                                                        break;

                                                case 2: myGraphs.bfs();
                                                        break;

                                                case 3: myGraphs.dfs(0, new boolean[10]);
                                                        System.out.println();
                                                        break;

                                                default: System.out.println("Default is to insert data in the graph.");
                                                         myGraphs.insert();
                                                         break;
                                        }
                                        System.out.print("If you wish to leave enter 0 or enter any number to continue: ");
                                        xG = sc.nextInt();
                                }
                                System.out.println("Thank you for visualizing Graphs.");
                                break;

                        default: System.out.println("Please enter a correct number corresponding to the paricular data structure");
                                 break;         
                }
                System.out.println("To exit enter 0 else enter any number to continue.");
        }        
    }
}