package com.cs.ds;

import java.util.HashSet;
import java.util.Hashtable;

public class GetTable {

	public static void main(String[] args) {
		
		//int[][] adj = new int[5][5];
		int[][] highlyTrusted = { 
			//   0  1  2  3  4
				{0, 0, 0, 0, 1},
				{1, 0, 0, 0, 0},
				{0, 1, 0, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0} 
				};
		
		generateHashset(highlyTrusted);

	}
	
	public static void generateHashset(int[][] highlyTrusted) {
		
		Hashtable <Integer, HashSet> trustTable = new Hashtable<>();
		boolean flag = true;
		int count = 0;
		int headNode;
		int temp;
		int totalUsers = 5;
		
		for (int i = 0; i < totalUsers; i++) {
			for (int j = 0; j < totalUsers; j++) {
				if (highlyTrusted[i][j] == 1) {
					HashSet<Integer> trustList = new HashSet<Integer>();

					//trustedCount += 1;
					//master = returnUser(map, i);
					//devotee = returnUser(map, j);
					
					headNode = j;
					temp = headNode;
					trustList.add(j);
					trustList.add(i);
					do {
						for(int k=0; k<totalUsers; k++) {
							if (highlyTrusted[k][temp] == 1) {
								trustList.add(k);
								temp = k;
							}else
								count++;
						}
					}while(count == totalUsers-1);
					
					count  = 0;
					
					trustTable.put(headNode, trustList);
					System.out.println(trustTable);
				}
			}
		}
		
		System.out.println("------------------------------");
		System.out.println(trustTable);	
	}
}
