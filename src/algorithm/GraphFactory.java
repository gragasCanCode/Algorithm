package algorithm;

import java.util.Scanner;

public class GraphFactory {
	public static Graph makeGraph() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("�׷����� ��尹�� : ");
		int V = sc.nextInt();
		Graph g = new Graph(V);
		
		int temp=0;

		System.out.println();
		System.out.println("0�� ������ "+(V-1)+"�� ������ �����մϴ�.");
		
		for(int i=0; i<V; i++) {
			for(int j=1; j<V; j++) {
				System.out.println("���� ��� : "+i+"�� ��� ");
				System.out.print("������ ����ȣ �Է� (-1 : �������� �Ѿ��):");
				temp = sc.nextInt();
				if(temp == -1) break;
				g.addEdge(i, temp);				
			}
		}
		System.out.println("�׷��� ���� �Ϸ�.");
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
