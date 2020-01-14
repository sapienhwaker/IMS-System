package com.cs.ds; 

// Implementation of Kruskal's Algorithm to find the minimum spanning tree
class MinimumSpanningTree
{ 

	static int totalUsers = 100; 
	static int[] group = new int[100]; 
	static int INFINITY = Integer.MAX_VALUE; 

	//Find set of vertex i 
	static int find(int i) 
	{ 
		while (group[i] != i) 
			i = group[i]; 
		return i; 
	} 

	//grouping the users together
	static void grouping(int i, int j) 
	{ 
		int a = find(i); 
		int b = find(j); 
		group[a] = b; 
	} 

	//Finds MST using Kruskal's algorithm 
	static void kruskalMST(int cost[][]) 
	{ 
		// at the beginning the cost will be 0
		int mincost = 0;

		for (int i = 0; i < totalUsers; i++) 
			group[i] = i; 

		// adding the least costs 
		int edge_count = 1; 
		while (edge_count < totalUsers) 
		{ 
			int min = INFINITY, a = -1, b = -1; 
			for (int i = 0; i < totalUsers; i++) 
			{ 
				for (int j = 0; j < totalUsers; j++) 
				{ 
					if (find(i) != find(j) && cost[i][j] < min) 
					{ 
						min = cost[i][j]; 
						a = i; 
						b = j; 
					} 
				} 
			} 

			grouping(a, b); 
			System.out.printf("Edge %d:(%d, %d) cost:%d \n", 
					edge_count++, a, b, min); 
			mincost += min; 
		} 
		System.out.printf("\n Minimum cost= %d \n", mincost); 
	} 
} 
