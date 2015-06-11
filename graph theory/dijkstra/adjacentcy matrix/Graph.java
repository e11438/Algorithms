//package lk.ac.pdn.ce.asithab.co322.graphs;

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
	
	//dijkstra method
	public ArrayList<String> dijkstra(String src,String dest){
		ArrayList<String> path = new ArrayList<String>();
		HashMap<String,finNode> shortPath = new HashMap<String,finNode>();
		//priority queue can't be used because replaces need to be done by comparing elements
		//PriorityQueue<finNode> tempList = new PriorityQueue<finNode>();
		HashMap<String,finNode> tempList = new HashMap<String,finNode>();
		
		String current = src;
		int prevDist=0;
		
		//add src as first shortest path
		shortPath.put(current, new finNode(current,0,current));
		//get neighbors of current vertex 
		List<neighbor> neighbors = adjacencyList.get(current);
		
		//add all those neighbors to tempList just for the first time
		//later we have to check the value and visited or not
		for(int i=0;i<neighbors.size();i++){
			tempList.put(neighbors.get(i).vertex,new finNode(neighbors.get(i).vertex,neighbors.get(i).weight,current));			
		}
		
		
		int d=0;
		while(!current.equals(dest)){
			d++;
			//goes to vertex which has lowest length 
			//here pass a copy of tempList otherwise list will become empty
			finNode next=returnMin(new HashMap<String,finNode>(tempList));
			
			
			//set it as current
			current = next.vertex;
			//remove it form tempList, set it's distance from src and add it to shortPath
			tempList.remove(current);	
			//next.setDist(prevDist);
			shortPath.put(current, next);
			
			
			prevDist=next.dist;
			//System.out.println(current+"-"+prevDist);
			//get neighbors of current vertex 
			neighbors = adjacencyList.get(current);
			
			//=========================================================================
			
			
			//======================================================================
			
			//add all those neighbors to tempList only if it is smaller haven't added to shotPath list
			for(int i=0;i<neighbors.size();i++){
				//consider only if vertex isn't added to shortPath list
				if(!shortPath.containsKey(neighbors.get(i).vertex)){
					//System.out.println(tempList);
					if(tempList.containsKey(neighbors.get(i).vertex)){
						if(tempList.get(neighbors.get(i).vertex).dist>neighbors.get(i).weight+prevDist){
							//System.out.println(tempList.get(neighbors.get(i).vertex).dist+"-"+neighbors.get(i).weight);
							tempList.replace(neighbors.get(i).vertex,new finNode(neighbors.get(i).vertex,neighbors.get(i).weight+prevDist,current));		
						}
					}if(!tempList.containsKey(neighbors.get(i).vertex)){
						//System.out.println("no-"+neighbors.get(i).vertex);
						tempList.put(neighbors.get(i).vertex,new finNode(neighbors.get(i).vertex,neighbors.get(i).weight+prevDist,current));
					}
				}
			}		
		}
	/*	
		System.out.println("===============================");
		Iterator it = shortPath.entrySet().iterator();		
		
		 while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		
		 System.out.println();
		 */
		 String vert = dest;
		 //path.add(dest);
		// System.out.println(dest+"    "+src);
		 while(!vert.equals(src)){
			 path.add(vert);
			 
			 if(shortPath.get(vert)!=null){
				 vert=shortPath.get(vert).from;
			 }
		 }
		return path;
	}
	
	
	public static finNode returnMin(HashMap<String,finNode> n){
		int min=Integer.MAX_VALUE;
		finNode res=null;
		Iterator it = n.entrySet().iterator();		
			
		 while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        if(((finNode)pair.getValue()).dist<min){
		        	min=((finNode)pair.getValue()).dist;
		        	res=(finNode)pair.getValue();
		        }
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		return res;
	}
	
	public static String returnMin(List<neighbor> n,String pre){
		int min=Integer.MAX_VALUE;
		String name="";
		for(int i=0;i<n.size();i++){
			if(n.get(i).weight<min&&!n.get(i).vertex.equals(pre)){
				min=n.get(i).weight;
				name=n.get(i).vertex;
			}
		}
		return name;
	}
	
	private class finNode implements Comparable{
		String vertex;
		int dist;
		String from;
		finNode(String vertex,int dist,String from){
			this.vertex=vertex;
			this.dist=dist;
			this.from=from;
		}
		
		void setDist(int dist){
			this.dist+=dist;
		}
		
		public int compareTo(Object fn) {
			return dist-((finNode)fn).dist;
		}
			
		public String toString(){
			return vertex+": "+dist+"("+from+")";
		}
		
		
	}
}
