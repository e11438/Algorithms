package graph;

import java.io.*;
import java.util.*;

public class Graph {

	private Map<String, List<neighbor>> adjacencyList;
	String[] vertex;
	// Constructor for Graph - Builds the Graph from File
	public Graph(String fileName) throws FileNotFoundException {
		adjacencyList = new HashMap<String, List<neighbor>>();
		buildGraphFromFile(fileName);
	}
	
	// inner class to represent the neighbors (with weights) in the adjacency lists
	private class neighbor{
		String vertex;
		int weight;
		
		neighbor(String vertex, int weight){
			this.vertex = vertex;
			this.weight = weight;
		}
		
		public String toString(){
			return vertex + "(" + weight + ")";
		}
	}
	
	// Check whether the given vertex is in the graph.
	// Add it if it is not (in the graph).
	public void addVertex(String vertex){
		if (!adjacencyList.containsKey(vertex)) {
			List<neighbor> edges = new ArrayList<neighbor>();
			this.adjacencyList.put(vertex, edges);
		}
	}
	
	// connects vertex1 to vertex2 & vice versa
	public void addUndirectedEdge(String vertex1, String vertex2, int weight) {
		addEdge(vertex1, vertex2, weight);
		addEdge(vertex2, vertex1, weight);
	}

	// Connect vertex1 to vertex2. If vertex1 already exists in AdjacencyList 
	// return edges-list & add vertex1 to it. If not, create new ArrayList & 
	// add vertex2. Then add all to AdjList
	private void addEdge(String vertex1, String vertex2, int weight) {
		List<neighbor> edges;
		if (adjacencyList.containsKey(vertex1)) {
			edges = adjacencyList.get(vertex1);
			neighbor n = new neighbor(vertex2,weight);
			edges.add(n);
		} else { // if vertex is NOT in the list, add  it to the list
			// FIXME: Check with the vertex list & give error message if necessary!
			edges = new ArrayList<neighbor>();
			neighbor n = new neighbor(vertex2,weight);
			edges.add(n);
			this.adjacencyList.put(vertex1, edges);
		}
	}

	// Returns true if the graph is empty; false otherwise
	public boolean isEmpty() {
		return adjacencyList.isEmpty();
	}

	// Returns the size of the graph
	public int size() {
		return adjacencyList.keySet().size();
	}

	// Returns true is vertex1 points to vertex2 vice versa.
	public boolean isConnected(String vertex1, String vertex2) {
		List<neighbor> edges = getEdges(vertex1);
		return edges.contains(vertex2);
	}

	// Returns all edges of each vertex.
	public List<neighbor> getEdges(String vertex1) {
		if (adjacencyList.containsKey(vertex1)) {
			throw new RuntimeException(vertex1 + " not present in the graph.");
		}
		
		List<neighbor> edges = adjacencyList.get(vertex1);
		return edges;
	}

	// Reads a text file and build the Graph DS 
	// 	Line one contains all vertices (separated by Spaces)
	// 	Following lines contain edges (one edge per line) with weight
	// 	Sample File Content:
	// 		A B C 
	//		A B 54
	//		B C 39
	//		C A 43
	private void buildGraphFromFile(String fileName) throws FileNotFoundException {
		try {
			File file = new File(fileName);
			InputStreamReader streamReader = new InputStreamReader(new FileInputStream(file));
			BufferedReader br = new BufferedReader(streamReader);
			String line = br.readLine();

			// Read Line 1, extract the vertices and add it to the graph
			if (line != null) {
				String[] vertexList = line.split(" ");
				vertex = new String[vertexList.length];
				for (int i = 0; i < vertex.length; ++i) {
					vertex[i] = vertexList[i];
				}

				// Read rest of the lines, extract data on each line
				// and add each edge into the Graph DS
				while ((line = br.readLine()) != null) {
					String[] tokens = line.split(" ");
					String vertex1 = tokens[0];
					String vertex2 = tokens[1];
					int weight = Integer.parseInt(tokens[2]);
					addUndirectedEdge(vertex1, vertex2, weight);
				}
			}
			br.close();

		// catch exceptions & errors
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e);
			e.printStackTrace();
		}
	}

	// String representation
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Iterator<String> vertices = adjacencyList.keySet().iterator();
		while (vertices.hasNext()) {
			String vertex = vertices.next();
			List<neighbor> edges = adjacencyList.get(vertex);
			builder.append(vertex);
			builder.append(": ");
			builder.append(edges);
			builder.append('\n');
		}
		return builder.toString();
	}

	
	public ArrayList<String> breadthFirst(String start){
		ArrayList<String> path =new ArrayList<String>();
		Queue<String> unvisited = new LinkedList<String>();
		String current =start;
		path.add(current);
		
		List<neighbor> neighbors = adjacencyList.get(current);
		for(int i=0;i<neighbors.size();i++){
			path.add(neighbors.get(i).vertex);				
			unvisited.add(neighbors.get(i).vertex);				
		}
		
		while(!unvisited.isEmpty()){
			current = unvisited.poll();
			neighbors = adjacencyList.get(current);	
			for(int i=0;i<neighbors.size();i++){
				if(!path.contains(neighbors.get(i).vertex)){
					path.add(neighbors.get(i).vertex);
					unvisited.add(neighbors.get(i).vertex);	
				}
			}
		}
		
		return path;
	}
	public ArrayList<String> depthFirst(String start){
		ArrayList<String> path = new ArrayList<String>();
		Stack<String> unvisited = new Stack<String>();
		
		String current=start;
		
		List<neighbor> neighbors = adjacencyList.get(current);
		unvisited.push(current);
		path.add(current);
		
		while(!unvisited.isEmpty()){
			current = unvisited.peek();
			System.out.println(current);
			neighbors = adjacencyList.get(current);
			neighbor n=nextTurn(path,neighbors);
			if(n!=null){
				path.add(n.vertex);
				unvisited.push(n.vertex);				
			}else{
				if(!unvisited.isEmpty())
				unvisited.pop();
			}			
		}
		
		
		return path;
	}
	public static neighbor nextTurn(ArrayList<String> path,List<neighbor> n){
		neighbor res =null;
		for(int i=0;i<n.size();i++){
			if(!path.contains(n.get(i).vertex)){
				return n.get(i);
			}
		}
		
		return res;
	}
}
