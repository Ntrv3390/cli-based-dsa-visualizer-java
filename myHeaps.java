import java.util.ArrayList;

public class myHeaps {

    // To add the data in heap as a minHeap
    public static void addMinHeap(ArrayList<Integer> arr, int data) {

        if (arr.size() == 0) {
            arr.add(data);
            return;
        }

        arr.add(data);
        int childIdx = arr.size() - 1;
        int parentIdx = (childIdx - 1) / 2;

        while (arr.get(childIdx) < arr.get(parentIdx)) {
            int temp = arr.get(childIdx);
            arr.set(childIdx, arr.get(parentIdx));
            arr.set(parentIdx, temp);
            childIdx = parentIdx;
            parentIdx = (childIdx - 1) / 2;
        }
    }

    // To traverse the heap;
    public static void traverseHeap(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            System.out.println("Your heap is empty.");
            return;
        }
        System.out.println("The elements in your heap are:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    // To peak the data from minheap;
    public static void peekHeap(ArrayList<Integer> arr) {
        System.out.println("The peek (highest priority) element of your heap is: " + arr.get(0));
    }

    // heapify function to make the heap either in minHeap or maxHeap
    private static void heapify(ArrayList<Integer> arr, int i, int bit, int size) {
        // additional parameter bit for knowing if the heap is minHeap or maxHeap
        // for minHeap bit = 0 for maxHeap bit = 1
        int leftIdx = (2 * i) + 1;
        int rightIdx = (2 * i) + 2;
        int idx = i;

        // for minHeap & removing the data
        if (bit == 0) {
            if (leftIdx < arr.size() && arr.get(leftIdx) < arr.get(idx)) {
                idx = leftIdx;
            }

            if (rightIdx < arr.size() && arr.get(rightIdx) < arr.get(idx)) {
                idx = rightIdx;
            }

            if (idx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(idx));
                arr.set(idx, temp);
                heapify(arr, idx, 0, 0);
            }
        }
        // for maxHeap & sorting the heap
        else
        {
            if (leftIdx < size && arr.get(leftIdx) > arr.get(idx)) {
                idx = leftIdx;
            }

            if (rightIdx < size && arr.get(rightIdx) > arr.get(idx)) {
                idx = rightIdx;
            }

            if (idx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(idx));
                arr.set(idx, temp);
                heapify(arr, idx, 1, size);
            }
        }

    }

    // To remove the data from heap
    public static void removeHeap(ArrayList<Integer> arr) {
        int data = arr.get(0);

        int temp = data;
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);

        arr.remove(arr.get(arr.size() - 1));

        heapify(arr, 0, 0, 0);

        System.out.println("The priority data " + data + " has been removed from your heap successfully.");
    }

    // To sort the data in heap using maxHeap
    public static void heapSort(ArrayList<Integer> arr) {
        for(int i = arr.size()/2; i >= 0; i--)
        {
            heapify(arr, i, 1, arr.size());
        }

        for(int i = arr.size()-1; i > 0; i--)
        {
            int temp = arr.get(0);
            arr.set(0, arr.get(i));
            arr.set(i, temp);
            heapify(arr, 0, 1, i);
        }
        System.out.println("Your heap has been sorted and is now:");
        traverseHeap(arr);
    }

    public static void main(String[] args) {
        System.out.println("You are in Heaps.");
    }
}