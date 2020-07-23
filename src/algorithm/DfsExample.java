package algorithm;

import java.util.Iterator;

public class DfsExample{
	private int startV = 0;
	private Graph g;
	StringBuilder sb;
	
	public DfsExample (Graph g) {
		this.g = g;
		sb = new StringBuilder();
	}
	public DfsExample (Graph g, int n) {
		this.g = g;
		this.setStartv(n);
		sb = new StringBuilder();
	}
	
	public String doSearch() {
		doSearch(startV);
		return sb.toString();
	}
	
	public void doSearch(int v) {
		g.setVisitedElement(v, true);
		sb.append("["+v+"]");

		Iterator<Integer> iter;
		iter = g.adj[v].iterator();
	
		while(iter.hasNext()) {
			int n = iter.next();
			if(!g.getVisitedElement(n)) {
				doSearch(n);
			}
		}
	}
	
	public void setStartv(int n) {
		startV = n;
	}
}
