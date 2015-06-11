//package lk.ac.pdn.ce.asithab.co322.graphs;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class GraphApp1 {
	private final static String fileName = "data.txt";
	
	public static void main(String[] args) {
		try {
			String[] cities = {"Colombo", "Kandy", "Galle", "NuwaraEliya", "Jaffna", "Trincomalee", "Anuradhapura", "Arugambay", "Pinnawala", "Yala"};
			ArrayList<String> mustPassList = new ArrayList<String>(Arrays.asList(cities));
			
			Graph g = new Graph(fileName);
			System.out.println(g);
			long startTime = System.currentTimeMillis();
			
			
			
			ArrayList<String> tryPath = g.dijkstra("Arugambay", "Trincomalee");
			ArrayList<String> tryPath1 = g.dijkstra("Colombo", "Jaffna");
			System.out.println(tryPath);
			System.out.println(tryPath1);
			// Add your graph search/traversal/application here!
			//=====================================================================
			
			int n=0;
			//list of all unvisited nodes
			ArrayList<String> vertexList=new ArrayList<String>(Arrays.asList(g.vertexarr));
			HashMap<String,ArrayList<String>> passedEdges = new HashMap<String, ArrayList<String>>();
			int sum=0;
			ArrayList<String> passed = new ArrayList<String>();
			
			String current ="Colombo";
			neighbor next =Graph.returnMin(g.adjacencyList.get(current),null,vertexList);
			while(next!=null){
				System.out.println(current);
				vertexList.remove(current);
				if(passedEdges.containsKey(current)){
					if(passedEdges.get(current).contains(next.vertex)){
						sum+=(next.weight*2);
					}
					else{
						sum+=next.weight;
						passedEdges.get(current).add(next.vertex);
					}					
				}
				else{
					sum+=next.weight;
					passedEdges.put(current, new ArrayList<String>(Arrays.asList(new String[]{next.vertex})));
				}
				if(!vertexList.contains(next.vertex)){
					next=null;
					n=0;
					//System.out.println(c);
				}else{
					n=1;
					String prev=current;
					current=next.vertex;
					//System.out.println("next-"+next.vertex);
					next=Graph.returnMin(g.adjacencyList.get(current),prev,vertexList);
					
				}		
				
			}
			
			//part 2.
			//n is not considering
			String nextCity = null;
			while(vertexList.size()>0){
				//System.out.println(vertexList);
				nextCity = vertexList.get(0);
				if(!nextCity.equals(current)){					
					
					ArrayList<String> path =g.dijkstra(current, nextCity);
					//System.out.println(current + " "+nextCity);
					//System.out.println(path);
					for(int i=path.size()-1;i>=0;i--){
						String nextName=path.get(i);
						System.out.println(nextName);
						 next= returnN(g.adjacencyList.get(current),nextName);
						 
						 //===========================================
						 //check whether already traversed in this edge
						 if(passedEdges.containsKey(current)){
								if(passedEdges.get(current).contains(next.vertex)){
									sum+=(next.weight*2);
								}
								else{
									sum+=next.weight;
									passedEdges.get(current).add(next.vertex);
								}					
							}
							else{
								sum+=next.weight;
								passedEdges.put(current, new ArrayList<String>(Arrays.asList(new String[]{next.vertex})));
							}
						 //=====================================
						 
						 current=nextName;	
						 vertexList.remove(current);
					}
				}else{
					vertexList.remove(0);	
				}	
			}
			//System.out.println(vertexList);
			//part three
			
			ArrayList<String> path =g.dijkstra(current, "Colombo");
			//System.out.println(current + " "+nextCity);
			//System.out.println(path);
			for(int i=path.size()-1;i>=0;i--){
				String nextName=path.get(i);
				System.out.println(nextName);
				 next= returnN(g.adjacencyList.get(current),nextName);
				 
				 //===========================================
				 //check whether already traversed in this edge
				 if(passedEdges.containsKey(current)){
						if(passedEdges.get(current).contains(next.vertex)){
							sum+=(next.weight*2);
						}
						else{
							sum+=next.weight;
							passedEdges.get(current).add(next.vertex);
						}					
					}
					else{
						sum+=next.weight;
						passedEdges.put(current, new ArrayList<String>(Arrays.asList(new String[]{next.vertex})));
					}
				 //=====================================
				 
				 current=nextName;	
				 
			}
			//System.out.println(current);
			System.out.println(sum);
			//=========================================================================
			
			//initialGraph.printPath("Colombo");
			
			long endTime = System.currentTimeMillis();
			
			// Calculate & Print the time taken by the algorithm/application
			long duration = (endTime - startTime); 
			System.out.print("The execution of this program took: ");
			System.out.println(String.format("%d min, %d sec", 
				    TimeUnit.MILLISECONDS.toMinutes(duration),
				    TimeUnit.MILLISECONDS.toSeconds(duration) - 
				    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration))
				));
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static neighbor returnN(List<neighbor> n ,String name){
		neighbor res = null;
		for(int i=0;i<n.size();i++){
			if(n.get(i).vertex.equals(name))
				return n.get(i);
		}
		return res;
	}
}
