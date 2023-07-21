import java.util.*;

public class myGraphs {

    // creating a scanner object for taking input
    static Scanner sc = new Scanner(System.in);

    // creating an edge class to store all the information
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt)
        {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // initialization of static varialbles
    static int n;
    static ArrayList<Edge>[] graph;
    static int bit = 0;

    // constructor for main class
    public myGraphs()
    {
        System.out.print("Enter number of vertices of your graph: ");
        n = sc.nextInt();
    }

    // method for inserting a value in graph
    public static void insert() {
        if(bit == 0)
        {
            graph = new ArrayList[5];
            for(int i = 0; i < graph.length; i++)
            {
                graph[i] = new ArrayList<>();
            }
            bit = 1;
        }
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Enter no of edges you want to add for your " + i + "th vertex: ");
            int curr = sc.nextInt();
            for (int j = 0; j < curr; j++) {
                System.out.print("Enter the destination from " + i + "th node: ");
                int dest = sc.nextInt();
                Edge e = new Edge(i, dest, 1);
                graph[i].add(e);
            }
        }
    }

    // method for traversing the graph using breadth first search (bfs)
    public static void bfs()
    {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty())
        {
            int curr = q.remove();
            if(!visited[curr])
            {
                System.out.print(curr + " ");
                visited[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++)
                {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
            System.out.println();
        }
    }

    // method for traversing the graph using depth first search (dfs)
    public static void dfs(int curr, boolean[] visited)
    {
        System.out.print(curr + " ");
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest])
            {
                dfs(e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("You are in Graphs.");
    }
}