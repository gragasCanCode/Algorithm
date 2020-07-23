package algorithm;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph{
	private int V;
	LinkedList<Integer> adj[];
	Iterator<Integer> iter;
	private boolean visited[];
	
	public Graph(int v) {
		V = v;
		adj = new LinkedList[V];
		visited = new boolean[V];
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList<>();
			visited[i] = false;
		}
	}
	
	public int getV() {
		return V;
	}
	
	public void setVisitedElement(int v, boolean b) {
		visited[v] = b;
	}
	
	public boolean getVisitedElement(int v) {
		return visited[v];
	}
	
	public void cleanVisited() {
		for(int i=0; i<V; i++) {
			visited[i] = false;
		}
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<V; i++) {
			iter = adj[i].iterator();
			sb.append(i+"->");
			while(iter.hasNext()) {
				sb.append("["+iter.next()+"]");
			}
			sb.append("\n");
		}
		sb.append("-visited-\n[");
		for(int i=0; i<V; i++) {
			sb.append(i+":"+visited[i]);
			if(i != V-1) 
				sb.append(" ,");
		}
		sb.append("]");
		return sb.toString();
	}
}
