# A CLI Based Data Structures & Algorithms Visualizer

Hi, welcome to dsa visualizer. In this project you can find all the
major data structures such as arrays, linkedlists, trees, heaps, graphs,
tries, and hashmaps.

# Visualizing Arrays

A file name myArrays.java contains the algorithms for adding, traversing,
sorting, & searching.

Searching Array:

-- Searching is done in two ways:
   1: Using Linear Search
   2: Using Binary Search

Sorting Array:

-- Sorting is done in two ways:
   1: Using Merge Sort
   2: Using Quick Sort

# Visualizing LinkedLists

A file name myLL.java contains the algorithms for adding, traversing & searching
in a LinkedList.

Adding Node in LinkedList:

-- Adding is done in three ways
   1: Adding node at beginning
   2: Adding node at last
   3: Adding node at a given index

Removing Node from LinkedList:

-- Removing is done in three ways
   1: Removing node from beginning
   2: Removing node from last
   3: Removing node from a given index

Searching LinkedList:

-- Searching is done in two ways:
   1: Using Iterative Search
   2: Using Recursive Search

# Visualizing Stacks

A file name myStack.java contains the algorithms for adding, traversing & searching
in a Stack.

Adding Node in Stack:

-- Node is always added at the top of the stack.

Removing Node from Stack:

-- Node is always removed from the top of the stack.

-- Stack follows LIFO (Last In First Out) Structure.

Searching Stack:

-- Searching is done in two ways:
   1: Using Iterative Search
   2: Using Recursive Search

# Visualizing Queues

A file name myQueue.java contains the algorithms for adding, traversing & searching
in a Queue.

Adding Node in Queue:

-- Node is always added at the front of the queue.

Removing Node from Queue:

-- Node is always removed from the rear of the queue.

-- Queue follows FIFO (First In First Out) Structure.

Searching Queue:

-- Searching is done in two ways:
   1: Using Iterative Search
   2: Using Recursive Search

# Visualizing Trees

A file name myTrees.java contains the algorithms for adding, traversing and counting the
nodes and data of the nodes in a tree. 

Adding Node in Trees:

-- Node is first added to the root node and then the left and right child.

Traversing The Tree

-- Traversing is done in four ways:
   1: Using Preorder (recursive)
   2: Using Inorder (recursive)
   3: Using Postorder (recursive)
   4: Using Levelorder (iterative)

# Visualizing Heaps

A file name myHeaps.java contains the algorithms for adding, traversing, removing and sorting the
heap. 

Heaps are also referred as priority queues. As the queue follows the FIFO Structure, in heaps
the data with high priority gets removed first.

Adding Data in Heaps:

-- Data is always added in heap (considering minHeap) such that its left child & right child
are always greater than its parent.

Removing Data from Heaps:

-- Data is always removed from heap (considering minHeap) which is the smallest element present.

Sorting The Heap

-- Sorting is done in by converting the heap into a maxHeap and then sorting the data.

# Visualizing HashMaps

A file name myHashMaps.java contains the algorithms for adding, traversing, and removing  
the data from hashmaps. 

HashMaps are stored in an array of LinkedList and all the operations of adding, removing
or searching is done in O(1) time complexity.

Types Of HashMaps:

-- HashMaps are of three types:
   1: Regular HashMap - (Displays the data in random manner irrespective of in a which they were added.)
   2: Linked HashMap - (Displays the data in manner in a which they were added.)
   3: TreeMap - (Displays the data in sorted manner.) (Here time complexity becomes O(logn) due to sorting.)

Adding Data in HashMaps:

-- Data is added as a node in LinkedList and that linkedlist is stored in an array (i.e Array Of LinkedLists).

Hashing Function

-- Hashing Function is used to convert the raw text into cipher text (i.e. encrypt the data).

Rehash Function

-- Rehashing is done when the lambda (= no of nodes/size of array) is greater than a value k where k is constant.
   When the labda value becomes greater than k, we make the size of array double in order to simplify the 
   complexity of insertion, deletion, etc. This is not done on regular basis but is done once a year or two.

# Visualizing Tries

A file name myTries.java contains the algorithms for adding, & searching
in a trie.

Adding Node in Trie:

-- Trie is a data strucutre in which the prefix remains same. If we add a string in trie and if the prefix
   of that word is already present then we just add the suffix of the word and not the whole.

Searching Trie:

-- Searching is done in a similar fashion as adding a node.

# Visualizing Graphs

A file name myGraphs.java contains the algorithms for adding, & travesing
the graphs.

Adding Data in Graph:

-- In graph we visualize it as a pair of set of nodes and vertices. Any two node can be connected by an edge
   to make a graph. Here in this project graphs are made using adjacency list i.e. Array of ArrayList.

Traversing Graphs:

-- Traversing is done in two ways:
   1: Using Breadth First Search(BFS) - (iterative)
   2: Using Depth First Search(DFS) - (recursive)


# Thank you for visualizing!