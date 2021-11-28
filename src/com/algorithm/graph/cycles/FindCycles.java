package com.algorithm.graph.cycles;

import java.util.List;
import java.util.Map;

import com.algorithm.graph.Color;
import com.algorithm.graph.Vertex;
import com.algorithm.graph.stronglyconnectedcomponent.StronglyConnectedComponents;

/**
 * @author faraz
 * 
 *         * We can use DFS to find cycles from both directed and undirected
 *         graphs. To find all the vertices that form a cycle, we can run
 *         StronglyConnectedComponents
 *
 */
/**
 * @author faraz
 *
 */
public class FindCycles {
	public static void main(String[] args) {

		// will find a cycle
		Map<Vertex, List<Vertex>> graph = testData0();

		// more testing
		// will find a cycle
		graph = testData1();

		// more testing
		// will find a cycle
		graph = testData2();

		// more testing
		// there is NO cycle
		graph = testData3();

		// more testing
		// there is NO cycle
		graph = testData4();

		DFS(graph);
	}

	private static void DFS(Map<Vertex, List<Vertex>> graph) {
		for (Vertex u : graph.keySet()) {
			u.c = Color.WHITE;
			u.p = null;
		}

		boolean cycle = false;
		for (Vertex u : graph.keySet()) {
			if (u.c == Color.WHITE) {
				if (DFS_VISIT(graph, u)) {
					cycle = true;
					System.out.println("Found a cycle. Cycle is");
					StronglyConnectedComponents
							.stronglyConnectedComponents(graph);
					break;
				}
			}
		}
		if (!cycle) {
			System.out.println("No Cycle Found!");
			StronglyConnectedComponents.stronglyConnectedComponents(graph);
		}

	}

	private static boolean DFS_VISIT(Map<Vertex, List<Vertex>> graph,
			Vertex u) {
		u.c = Color.GRAY;
		for (Vertex v : graph.get(u)) {
			if (v.c == Color.WHITE) {
				v.p = u;
				if (DFS_VISIT(graph, v)) {
					return true;
				}
			}
			if (v.c == Color.GRAY) {
				return true;
			}
		}
		u.c = Color.BLACK;
		return false;
	}

	/**
	 * From the book Cormen's Algorithm 3rd edition
	 */
	private static Map<Vertex, List<Vertex>> testData0() {
		Vertex a = new Vertex("a");
		Vertex b = new Vertex("b");
		Vertex c = new Vertex("c");
		Vertex d = new Vertex("d");
		Vertex e = new Vertex("e");
		Vertex f = new Vertex("f");
		Vertex g = new Vertex("g");
		Vertex h = new Vertex("h");
		Map<Vertex, List<Vertex>> graph = Map.of(a, List.of(b), b,
				List.of(c, e, f), c, List.of(d, g), d, List.of(c, h), e,
				List.of(a, f), f, List.of(g), g, List.of(f, h), h, List.of(h));
		return graph;
	}

	/**
	 * https://www.programiz.com/dsa/strongly-connected-components
	 */
	private static Map<Vertex, List<Vertex>> testData2() {
		Vertex zero = new Vertex("0");
		Vertex one = new Vertex("1");
		Vertex two = new Vertex("2");
		Vertex three = new Vertex("3");
		Vertex four = new Vertex("4");
		Vertex five = new Vertex("5");
		Vertex six = new Vertex("6");
		Vertex seven = new Vertex("7");
		Map<Vertex, List<Vertex>> graph = Map.of(zero, List.of(one), one,
				List.of(two), two, List.of(three, four), three, List.of(zero),
				four, List.of(five), five, List.of(six), six,
				List.of(four, seven), seven, List.of());
		return graph;
	}

	/**
	 * https://www.geeksforgeeks.org/strongly-connected-components/
	 */
	private static Map<Vertex, List<Vertex>> testData1() {
		Vertex zero = new Vertex("0");
		Vertex one = new Vertex("1");
		Vertex two = new Vertex("2");
		Vertex three = new Vertex("3");
		Vertex four = new Vertex("4");
		Map<Vertex, List<Vertex>> graph = Map.of(one, List.of(zero), zero,
				List.of(two, three), two, List.of(one), three, List.of(four),
				four, List.of());
		return graph;
	}

	/**
	 * https://www.algotree.org/algorithms/tree_graph_traversal/depth_first_search/cycle_detection_in_directed_graphs/
	 */
	private static Map<Vertex, List<Vertex>> testData4() {
		Vertex zero = new Vertex("0");
		Vertex one = new Vertex("1");
		Vertex two = new Vertex("2");
		Vertex three = new Vertex("3");
		Vertex four = new Vertex("4");
		return Map.of(zero, List.of(one, two), one, List.of(), two,
				List.of(three), three, List.of(four), four, List.of(one));
	}

	/**
	 * https://www.geeksforgeeks.org/detect-cycle-in-a-graph/
	 */
	private static Map<Vertex, List<Vertex>> testData3() {
		Vertex zero = new Vertex("0");
		Vertex one = new Vertex("1");
		Vertex two = new Vertex("2");
		Vertex three = new Vertex("3");
		return Map.of(zero, List.of(one, two), one, List.of(two), two,
				List.of(three), three, List.of());
	}

}
