package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Graphs { // A graph can be defined as group of vertices and edges that are used to connect these vertices. 
	//A graph can be seen as a cyclic tree, where the vertices (Nodes) maintain any complex relationship among them instead of having parent child relationship.
	
	//no unique node such as root, hierarchy is not defined, can form cycle.
		//eg., google maps, facebook frnds.
	
	//Classification of Graphs
//case1:	
	//Directed Graph - node to 1st edge , node to 2nd edge, edge to edge but not reversible like edge to node, 2nd edge to 1st edge etc..
	//Undirected Graph - traversal is possible in both direction

//case 2:
	//Weighted graph - edges have weight
	//Unweighed graph - edges do not have weight
	
//case 3 :
	//Undirected cyclic graph - cyclic traversal is possible from node to edge to node and reverse etc..
	//Undirected Acyclic graph - graph does not have a cyclic structure
	
	//directed cyclic graph - cyclic traversal is possible from node to edge to node but in a directed order and no reverse cycle is possible.
	//directed Acyclic graph - has a cyclic structure but but node can go to 1st edge and node can go to 2nd edge but a cycle between the three is not possible.
	
	public static void main(String[] args) {
		
// Adjacency Matrix Representation  
		
//  Nodes  Edges
//   0 		1
//   0 		3
//   1 		2
//   3 		2
//   3 		4
//   2 		4
		   
//			NEIGHBOURS	
//			0 1 2 3 4 
		
//	N	0   0 0 0 1 0
//	O	1	1 0	1 1 0
//	D	2	0 1	0 1 1   1's represent the node and edge connection in 1's place we put our weighted values.
//	E	3	1 0	0 0	1
//	S	4	0 0	1 1 0
		
	
//	Scanner sc = new Scanner(System.in);
//	
//	int n = sc.nextInt(); //no of nodes		
//	int m = sc.nextInt(); //no of edges		
//	
//	int[][] graph = new int [n+1][n+1];
//	for(int i =0;i<m;i++) {										
//		int u = sc.nextInt();									
//		int v = sc.nextInt();
//		
//		graph[u][v] = 1;
//		graph[v][u] = 1;	
//	}
	
//--------------------------------------------------------------------------------------------------------------------
	
// Adjacency List Representation   //  pair or node and edge are stored in a list
	
//	int x = sc.nextInt(); //no of nodes		
//	int y = sc.nextInt(); //no of edges		
//	
//	List<List<Integer>> graph1 = new ArrayList<>();
//	for(int i =0;i<y;i++) {										
//		graph1.add(new ArrayList<>()); }
//		
//	for(int i =0;i<x;i++) {										
//		int u = sc.nextInt();									
//		int v = sc.nextInt();
//		
//		graph1.get(u).add(v);
//		graph1.get(v).add(u);
//	}
	
//rotten oranges
	
	int arr[][] = {{0,1,1,0},
				   {2,1,0,0},
				   {1,1,2,0},
				   {1,1,1,1}};
	
	System.out.print("Time taken to Rot all Tomatoes is : ");
	System.out.print(RottingOranges(arr));
	System.out.print(" minutes");
	
	
// Number if Island
	
	int arr1[][] = {{1,1,0,0,0},
			        {1,1,0,0,0},
			        {0,0,1,0,0},
			        {0,0,0,1,1}};


	int ans = 0 ;
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1[0].length;j++){
			if(arr1[i][j]==1){
				NoOfIslands(arr1,i,j);
				ans++;
			}
		}
	}
	System.out.print("\nThe Number of Islands is : "+ans);
	
	}
//--------------------------------------------------------------------------------------------------------------------

// Breadth First Search - similar to level order traversal of a tree. Traversal in terms of edge count.
	// neighbors of the node and radial traversal - two edges away
	// a queue to get and print the values and an boolean array to check the visited neighbors
	// neighbors of 0 is 1 and 3..neighbors 2 is 1 and 3 etc..
	// prints first element 0,(1,3),(2,4),(5,6)
	
//	0------3------4  
//	|	   |	  |	 \
//	|	   |	  |   \    
//	|      |      |    \
//	1------2	  5------6
	
//	public static void BFS(List<List<Integer>> graph, int src) {
//		Queue<Integer> q = new LinkedList<>();
//		boolean vist[] = new boolean(graph.size());
//		
//		q.add(src);
//		vis(src)=true;
//		
//		while(q.size>0) {
//			int rem = q.remove();
//			// Processing the removed element
//			System.out.println(rem);
//			
//			//all the neighbors
//			List<Integer> nbrs = graph.get(rem);
//			for(int nbr : nbrs) {
//				if(vist[nbr]==false) {
//					q.add(nbr);
//					vis[nbr]=true;	}
//			}
//		}
//		
//	}

//------------------------------------------------------------------------------------------------------------------
	
// Depth First Search - traverse in an random order. we cannot choose which order to traverse.
	
//	0------3------4  
//	|	   |	  |	 \
//	|	   |	  |   \    
//	|      |      |    \
//	1------2	  5------6
	
// stating from 0 we can traverse to 1 we have two neighbor options(0 or 1) since 1 is visited we traverse to 2 
// then from 2 to either (1 or 3) 1 is visited so we traverse to 3 then to 4 and so on.. [1,2,3,4,5,6]
// we have another perception to traverse which is from 0 to 3 
// from 3 we can either traverse to (0 or 4) since 0 is visited we traverse to 4 then from 4 to either (3 or 5)
// since 3 is visited we traverse to 5 then from 5 we have two options (4 or 6) since 4 is visited we traverse to 6
// similarly in 6 we have (5 or 4) both 5 and 4 is visited so we recursively traverse to either one of them 
// until we get an unvisited node. so the order of traversal would be - [0,3,4,5,6,2,1]
	
	
	public static void DFS(ArrayList<ArrayList<Integer>> graph, int src, boolean[] vis) {

		System.out.print(src);
		vis[src]=true;
	
		
		//all the neighbors
		ArrayList<Integer> nbrs = graph.get(src);
		for(int nbr : nbrs) {
			if(vis[nbr]==false) {
				DFS(graph,nbr,vis);
		}
	}
}
	
//--------------------------------------------------------------------------------------------------------------------
	
// Rotten oranges - 2 represent rotten oranges
// the neighbors(1) of the rotten oranges(2) rot within 1 minute 
	
//						 1st minute			 2nd minute			 3rd minute
		
//		0 1 2 3 			0 1 2 3 			0 1 2 3 			0 1 2 3 

//	0   0 1 1 0 		0   0 1 1 0 		0   0 2 1 0 		0   0 2 2 0
//	1	2 1	0 0  --->	1	2 2	0 0  --->	1	2 2	0 0  --->	1	2 2	0 0
//	2	1 1	2 0    		2	2 2	2 0 		2	2 2	2 0 		2	2 2	2 0
//	3	1 1	1 1			3	1 1	2 1			3	2 2	2 2			3	2 2	2 2	
	
// [ (1,0:0), (2,2:0), (2,0:1), (1,1:1), (2,1:1), (3,2:1), 
//   (3,0:2), (0,1:2), (3,1:2), (3,3:2), 
//	 (0,2:3) ] 
	
//	returns  time = 3 - no oranges left. if there is any oranges left ie(1) without rotting(2) the return -1.
	
public static int RottingOranges(int[][] arr) {
	LinkedList<int[]> queue = new LinkedList<>();
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++){
			if(arr[i][j]==2){
			int temp[] = {i,j,0};
			queue.addLast(temp);
		}
	}
}
	int ans = 0;
	while(queue.size()>0) {
		int rem [] = queue.removeFirst();
		int r = rem[0];
		int c = rem[1];
		int time = rem[2];
		ans = time;
		
	if(r+1<arr.length && arr[r+1][c]==1) {
		int temp [] = {r+1,c,time+1};
		queue.addLast(temp);
		arr[r+1][c]=2;
	}
	
	if(c-1>=0 && arr[r][c-1]==1) {
		int temp [] = {r,c-1,time+1};
		queue.addLast(temp);
		arr[r][c-1]=2;
	}
	
	if(r-1>=0 && arr[r-1][c]==1) {
		int temp [] = {r-1,c,time+1};
		queue.addLast(temp);
		arr[r-1][c]=2;
	}
	
	if(c+1<arr[0].length && arr[r][c+1]==1) {
		int temp [] = {r,c+1,time+1};
		queue.addLast(temp);
		arr[r][c+1]=2;
	}
	
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++){
			if(arr[i][j]==1){
				System.out.print("All Oranges are not Rotten!");
				return -1;
			}
		}
	}
	return ans;
	
}

//--------------------------------------------------------------------------------------------------------------------

//No of Islands - we use a 2D binary grid which has only 0's and 1's

//	1 1 0 0 0
//	1 1 0 0 0
//  0 0 1 0 0
//  0 0 0 1 1

// we use DFS to traverse and check for all the 1's until it is surrounded 0 's and trace the 1's as 1 island
// in this eg we have 4 connected 1's so we have 1 island, then we have 1 separate island and the 2 connected islands
// so the answer would be 3 islands.


public static void NoOfIslands(int[][] arr1,int i, int j) {
//	if(i<0 || i>=arr1.length || j<0 || j>=arr1.length || arr1[i][j]==0) {
//		return;
//	}
	arr1[i][j]=0;
	
	if(i+1<arr1.length && arr1[i+1][j] == 1) {
	NoOfIslands(arr1,i+1,j);}
	
	if(j+1<arr1[0].length && arr1[i][j+1] == 1) {
	NoOfIslands(arr1,i,j+1);}
	
	if(i-1>=0 && arr1[i-1][j] == 1) {
	NoOfIslands(arr1,i-1,j);}
	
	if(j-1>=0 && arr1[i][j-1] == 1) {
	NoOfIslands(arr1,i,j-1);}
	


}


}
