package algorithm;

import java.util.Scanner;

public class GraphFactory {
	public static Graph makeGraph() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("그래프의 노드갯수 : ");
		int V = sc.nextInt();
		Graph g = new Graph(V);
		
		int temp=0;

		System.out.println();
		System.out.println("0번 노드부터 "+(V-1)+"번 노드까지 존재합니다.");
		
		for(int i=0; i<V; i++) {
			for(int j=1; j<V; j++) {
				System.out.println("현재 노드 : "+i+"번 노드 ");
				System.out.print("연결할 노드번호 입력 (-1 : 다음노드로 넘어가기):");
				temp = sc.nextInt();
				if(temp == -1) break;
				g.addEdge(i, temp);				
			}
		}
		System.out.println("그래프 생성 완료.");
		return g;
	}
	
	public static Graph sampleGraph() {
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 2);
		return g;
	}
}
