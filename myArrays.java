import java.util.Scanner;

public class myArrays {

    // creating a scanner object for taking input
    static Scanner sc = new Scanner(System.in);

    // instantiating a static array
    static int[] arr;

    // method for creating an array of size n
    public static void createArray(int n)
    {
        arr = new int[n];
    }

    // method for adding elements in array
    public static void addElementsArray()
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    // method for traversal of array
    public static void traverseArray()
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Element " + arr[i] + " is at index " + i);
        }
    }

    // method for linear search in array
    public static void linearSearch(int k)
    {
        int bit = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == k)
            {
                System.out.println("The element " + k + " was found on index " + i + " in your array.");
                bit = 1;
                break;
            }
        }
        if(bit == 0)
        {
            System.out.println("The element " + k + " was not found in your array.");
        }
    }

    // method for binary search in array
    public static void binarySearch(int si, int ei, int k)
    {
        if(si >= ei)
        {
            System.out.println("The element " + k + " was not found in your array.");
            return;
        }
        int mid = si + (ei-si)/2;
        if(arr[mid] == k)
        {
            System.out.println("The element " + k + " was found on index " + mid + " in your array.");
            return;
        }
        binarySearch(si, mid-1, k);
        binarySearch(mid+1, ei, k);
    }

    // method for sorting an array using merge sort
    public static void mergeSortArray(int si, int ei)
    {
        if(si >= ei)
        {
            return;
        }

        int mid = si + (ei - si)/2;
        mergeSortArray(si, mid);
        mergeSortArray(mid+1, ei);
        mergeArray(si, mid, ei);
    }

    public static void mergeArray(int si, int mid, int ei)
    {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei)
        {
            if(arr[i] <= arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= ei)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(k = 0, i = si; k < temp.length; k++, i++)
        {
            arr[i] = temp[k];
        }
    }

    // method for sorting an array using quick sort
    public static void quickSortArray(int si, int ei)
    {
        if(si >= ei)
        {
            return;
        }

        int pIdx = partitionArray(si, ei);
        quickSortArray(si, pIdx-1);
        quickSortArray(pIdx+1, ei);
    }

    public static int partitionArray(int si, int ei)
    {
        int i = si-1;
        int pivot = arr[ei];

        for(int j = si; j < ei; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
         i++;
         int temp = pivot;
         arr[ei] = arr[i];
         arr[i] = temp;
        return i;
    }

    // main method for class myArrays
    public static void main(String[] args)
    {
        System.out.println("You're in Arrays");
    }

}

