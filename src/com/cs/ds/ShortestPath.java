package com.cs.ds;

//Implementation of Dijkstra's single source shortest path algorithm.  

class ShortestPath{
	
	static final int totalUsers = 100; 
	public static int minDistance(int dist[], Boolean visited[]) 
	{ 
		// at the beginning we will consider maximum possible value as the minimum value
		int min = Integer.MAX_VALUE, min_index = -1; 

		for (int v = 0; v < totalUsers; v++) 
			if (visited[v] == false && dist[v] <= min) { 
				min = dist[v]; 
				min_index = v; 
			} 
		return min_index; 
	} 

	// Function for implementation of Dijkstra's single source shortest path
	public static void dijkstra(int graph[][], int src)
	{ 
		// array to hold the minimum distance
		int dist[] = new int[totalUsers];

		// marking the visited node
		Boolean visited[] = new Boolean[totalUsers]; 
 
		for (int i = 0; i < totalUsers; i++) { 
			dist[i] = Integer.MAX_VALUE; 
			visited[i] = false; 
		}  
		dist[src] = 0; 

		// to get the shortest path of all the vertices 
		for (int count = 0; count < totalUsers - 1; count++) { 
			int u = minDistance(dist, visited);  
			visited[u] = true; 
			for (int v = 0; v < totalUsers; v++)  
				if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) 
					dist[v] = dist[u] + graph[u][v]; 
		} 
		displayShortestPath(dist); 
	}
	
	// print shortest path corresponding to all users 
	public static void displayShortestPath(int dist[]) 
	{ 
		System.out.println("---------Distance from the source---------");
		System.out.println("UserId \t Distance"); 
		for (int i = 0; i < totalUsers; i++) 
			System.out.println(i + " \t " + dist[i]); 
	} 
}

