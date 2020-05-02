import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class GraphImplementation implements Graph{

	private boolean [][] adjacency;
	// private ArrayList<ArrayList<Integer>> list;
	private int vertex;
	
	public GraphImplementation(int v){
		adjacency = new boolean [v][v];
		// list = new ArrayList<ArrayList<Integer>>(v);
		// for(int i = 0; i < v; i++){
		// 	list.add(new ArrayList<Integer>());
		// }
		this.vertex = v;
		
	}

	public void addEdge(int v1, int v2) throws Exception{
		if(v1 < vertex && v1 > 0 && v2 < vertex && v2 > 0){
			if(adjacency[v1][v2] == false)
				adjacency[v1][v2] = true;
		}
		else{
			throw new Exception("There was a problem adding an edge.");
		}
	}

	//i had issues figuring out the topological sort so i used the GeeksforFeeks version online as a reference
	// public void topologicalSortUtil(int i, boolean [] visited, List<Integer> top){
	// 	visited[i] = false;
	// 	int num;
	// 	Iterator<Integer> it = list.get(i).iterator(); 
	// 	while (it.hasNext())  
 //        {  
 //            num = it.next();  
 //            if (!visited[num])  
 //                topologicalSortUtil(num, visited, top);  
 //        }  
    
 //        // Push current vertex to stack which stores result  
 //        top.add(new Integer(i));

	// }

	public List<Integer> topologicalSort(){
		List<Integer> top = new ArrayList<Integer>();
	// 	boolean visited [] = new boolean[vertex];
	// 	for(int i = 0; i < vertex; i++){
	// 		visited[i] = false;
	// 	}
	// 	for(int j = 0; j < vertex;j++){
	// 		if(!visited[j])
	// 			topologicalSortUtil(j, visited, top);
	// 	}

	// 	// while(!top.empty()){
	// 	// 	System.out.println(top.pop + " ");
	// 	// }
		return top;
	}

	public List<Integer> neighbors(int v) throws Exception{
		List<Integer> n = new ArrayList<Integer>();
		if(v < 0 || v > vertex)
			throw new Exception("Vertex is out of bounds.");
		for(int i = 0; i < adjacency.length; i++){
			if(adjacency[v][i] == true)
				n.add(i);
		}
		return n;
	}
}