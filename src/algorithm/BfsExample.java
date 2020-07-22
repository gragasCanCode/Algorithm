package algorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsExample {
	static int Ne;
	static int Nv;
	static int[][] ad;
	static boolean[] visit;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Ne = scan.nextInt();
		System.out.println("Nv : ");
		Nv = scan.nextInt();
		
		ad = new int[Nv+1][Nv+1];
		visit = new boolean[Nv+1];
		
		for(int i=0; i< Nv; i++) {
			System.out.println("t1, t2 : ");
			int t1, t2;
			// 0 < t1 and t2 < Nv
			t1 = scan.nextInt();
			t2 = scan.nextInt();
			
			ad[t1][t2] = ad[t2][t1] = 1;
		}
		bfs(1);
		
	}
	
	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		HashMap<Integer, Boolean> hash = new HashMap<>();
		
		q.offer(i);
		while(!q.isEmpty()) {
			System.out.println(q);
			int temp = q.poll();
			visit[temp] = true;
			System.out.println(temp);
			
			for(int j=1; j<= Nv; j++) {
				if(ad[temp][j] == 1 && visit[j] == false) {
					if(!hash.containsKey(j)) {
						q.offer(j);
					}
				}
			}
			hash.put(temp, true);
		}
		
		System.out.println(hash);
	}
}
