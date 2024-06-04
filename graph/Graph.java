package graph;


import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


/**
 * This class implements a generic graph data structure. It allows storing vertices of any type `T`
 * and connecting them with directed edges.
 *
 * @param <T> The type of data stored in the graph vertices.
 */
public class Graph<T> {

  /**
   * An internal HashMap to store the graph. Keys are the vertices, and values are Lists containing
   * the neighboring vertices for each vertex.
   */
  private final Map<T, List<T>> grph = new HashMap<>();

  /**
   * Adds a new vertex to the graph. If a vertex with the same value already exists, it does nothing.
   *
   * @param vertex The vertex to be added to the graph.
   */
  public void addVertex(T vertex) {
    if (!grph.containsKey(vertex)) {
      grph.put(vertex, new LinkedList<T>());
    }
  }

  /**
   * Adds a directed edge from the source vertex to the destination vertex.
   * If the source or destination vertex doesn't exist in the graph, it will be added automatically.
   *
   * @param source The source vertex of the edge.
   * @param destination The destination vertex of the edge.
   */
  public void addEdge(T source, T destination) {
    if (!grph.containsKey(source)) {
      addVertex(source);
    }
    if (!grph.containsKey(destination)) {
      addVertex(destination);
    }
    grph.get(source).add(destination);
  }

  /**
   * Prints the graph representation. It iterates through each vertex and its connected neighbors,
   * printing them in a formatted way.
   */
  public void printGraph() {
    for (Map.Entry<T, List<T>> entry : grph.entrySet()) {
      System.out.print(entry.getKey() + ":");
      for (T neighbor : entry.getValue()) {
        System.out.print("|" + neighbor + "|");
      }
      System.out.println();
    }
  }
}
