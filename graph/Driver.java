package graph;

public class Driver {

  public static void main(String[] args) {
    // Create a new graph object
    Graph<String> graph = new Graph<>();

    // Add some vertices to the graph
    graph.addVertex("A");
    graph.addVertex("B");
    graph.addVertex("C");
    graph.addVertex("D");

    // Add some edges to the graph
    graph.addEdge("A", "B");
    graph.addEdge("A", "C");
    graph.addEdge("B", "D");
    graph.addEdge("C", "D");

    // Print the graph
    System.out.println("Graph:");
    graph.printGraph();
  }
}
