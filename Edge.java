/**
 * Edge for a Edge-Weighted Graph
 * Based on Algorithms, 4th Ed by Robert Sedgewick | Kevin Wayne
 */
public class Edge implements Comparable<Edge> {
    int v;      //The first node on the edge
    int w;     //The second node on the edge
    double weight;  //The weight of the edge

    Edge(int v, int second, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    //double weight() {}

    //int either()

    //int other()

    //int compareTo(Edge toCompare) {}

    //String toString() {}
}
