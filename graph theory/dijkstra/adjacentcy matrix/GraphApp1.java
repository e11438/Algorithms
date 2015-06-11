//package lk.ac.pdn.ce.asithab.co322.graphs;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class GraphApp1 {
	private final static String fileName = "sample.txt";
	
	public static void main(String[] args) {
		try {
			Graph initialGraph = new Graph(fileName);
			System.out.println(initialGraph);
			long startTime = System.currentTimeMillis();
			
			// Add your graph search/traversal/application here!
			ArrayList<String> path=initialGraph.dijkstra("A", "G");
		
			System.out.println(path);
			
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
}
