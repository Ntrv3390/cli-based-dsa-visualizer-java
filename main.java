import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.println("Enter your choice.\n Press 1 to visualize arrays.\n");
        s = sc.nextInt();
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
                    int x = 1;
                    while(x != 0)
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
                        x = sc.nextInt();
                    }
                    System.out.println("Thank you for visualizaing arrays!");
                    break;
        }
    }
}