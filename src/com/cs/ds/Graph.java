package com.cs.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import java.time.*;

public class Graph {

	static int totalAttributes = 9;
	static int totalGroups = 10;
	static int totalUsers;
	static LinkedList<User> arrayList[];
	static int[][][] threeD2;
	static int[][] anonimity;
	static int[][] highlyTrusted;
	static double[][] dhighlyTrusted;
	static int[] userGroup;
	static int[][] groupMatrix;
	static int[][] authenticity;
	static HashMap<Integer, User> map;
	static Hashtable<Integer, HashSet> scc;

	Graph(int totalUsers) {
		this.totalUsers = totalUsers;
		arrayList = new LinkedList[totalUsers];
		HashMap<Integer, User> map = new HashMap<Integer, User>();
		threeD2 = new int[totalAttributes][totalUsers][totalUsers];
		anonimity = new int[totalUsers][totalUsers];
		authenticity = new int[totalUsers][totalUsers];
		highlyTrusted = new int[totalUsers][totalUsers];
		dhighlyTrusted = new double[totalUsers][totalUsers];
		userGroup = new int[totalUsers];
		groupMatrix = new int[totalUsers][totalGroups];
		Hashtable<Integer, HashSet> scc = new Hashtable<Integer, HashSet>();

		for (int i = 0; i < totalUsers; i++)
			arrayList[i] = new LinkedList<User>();
		System.out.println("*************** WELCOME TO IMS ****************\n\n");
	}

	public static void createGroupMatrix() {

		for (int k = 0; k < totalUsers; k++) {
			userGroup[k] = getRandomNumberInRange(1, totalGroups);
		}
	}

	public static void createNewGroupMatrix() {

		for(int i = 0; i < totalUsers; i++)
			for(int j = 0; j < totalGroups; j++) {
				groupMatrix[i][j] = getRandomNumberInRange(0,10);
				if (groupMatrix[i][j] > 2)
					groupMatrix[i][j] = 0;
				else
					groupMatrix[i][j] = 1;
			}
	}

	public static void printNewGroupMatrix() {
		System.out.println("Following matrix has 10 groups(columns) and 100 users(rows)");
		for(int i = 0; i < totalUsers; i++) {
			for(int j = 0; j < totalGroups; j++) {
				System.out.print(groupMatrix[i][j]+" ");
			}			
			System.out.println();
		}
	}

	public static int isFromSameGroup(int[][] groupMatrix, int source, int dest) {
		int[] commonGroup = new int[]{0,0,0,0,0,0,0,0,0,0};
		int flag = 0;
		for(int j = 0; j < totalGroups; j++)
			commonGroup[j] = groupMatrix[source][j] & groupMatrix[dest][j];

		for(int j = 0; j < totalGroups; j++)
			flag = flag | commonGroup[j];

		//System.out.println("flagflagflagflag" + flag + "\n");
		return flag;
	}
	
	public static void createAuthenticityMatrix() {

		for(int i = 0; i < totalUsers; i++)
			for(int j = 0; j < totalUsers; j++)
				authenticity[i][j] = 1;
		
		lessAuthentic(authenticity);
	}

	public static void lessAuthentic(int[][] authenticity) {

		for(int k = 0; k < 1000; k++) {
			authenticity[getRandomNumberInRange(0, 99)][getRandomNumberInRange(0, 99)] = 0;
		}
	}

	public static void printLessAuthentic() {

		for(int i = 0; i < totalUsers; i++) {
			for(int j = 0; j < totalUsers; j++) {
				System.out.print(authenticity[i][j]+" ");
			}			
			System.out.println();
		}
	}

	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public static void addRandomEdge(int i, int[][][] threeD2, int[][] anonimity) {

		if (i == 0) {
			for (int j = 0; j < totalUsers; j++)
				for (int k = 0; k < totalUsers; k++) {
					threeD2[i][j][k] = 1;
					highlyTrusted[j][k] = 1;
					anonimity[j][k] = getRandomNumberInRange(0, 1);
				}

		} else {
			for (int j = 0; j < totalUsers; j++)
				for (int k = 0; k < totalUsers; k++) {
					threeD2[i][j][k] = getRandomNumberInRange(0, 1);
				}
		}
	}

	public static void getAllUserIds() {

		System.out.println("List of all UserIds in the System: \n");

		for(int i = 0; i < 100; i++) {
			System.out.println("UserID: " + i);
		}
	}

	public static void getAllGroupIds() {

		System.out.println("\nList of all GroupIds in the System: \n");

		for(int i = 0; i < 10; i++) {
			System.out.println("GroupID: " + i);
		}
	}

	public static void printGraph(int attribute) {

		System.out.println("Graph: (Adjacency Matrix) for attribute " + attribute);

		for (int i = 0; i < totalUsers; i++) {
			for (int j = 0; j < totalUsers; j++) {
				System.out.print(threeD2[attribute][i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < totalUsers; i++) {
			System.out.print("Vertex " + i + " is connected to:");
			for (int j = 0; j < totalUsers; j++) {
				if (threeD2[attribute][i][j] == 1) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}

	public static void printAnonimity() {

		System.out.println("Adjacency Matrix for Anonimity Graph: \n");

		for (int i = 0; i < totalUsers; i++) {
			for (int j = 0; j < totalUsers; j++) {
				System.out.print(anonimity[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printUserGroup() {

		System.out.println("Users and their respective groups: \n");

		for (int j = 0; j < totalUsers; j++)
			System.out.println("User"+j+" ---> "+"Group"+userGroup[j]);
	}

	public static void createHighlyTrustedUsers() {

		for (int i = 0; i < totalUsers; i++)
			for (int j = 0; j < totalUsers; j++)
				for (int k = 0; k < 5; k++) {
					highlyTrusted[i][j] = highlyTrusted[i][j] & threeD2[k][i][j];
				}
	}

	public static void printHighlyTrustedMatrix() {
		for (int i = 0; i < totalUsers; i++) {
			for (int j = 0; j < totalUsers; j++) {
				System.out.print(highlyTrusted[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void getHighlyTrustedUsers(HashMap<Integer, User> map) {

		int trustedCount = 0;
		User master = new User();
		User devotee = new User();

		for (int i = 0; i < totalUsers; i++) {
			for (int j = 0; j < totalUsers; j++) {
				if (highlyTrusted[i][j] == 1) {

					trustedCount += 1;
					master = returnUser(map, i);
					devotee = returnUser(map, j);
					System.out.println("Highly trusted pairs number = " + trustedCount);
					System.out.println(
							"User with userID: " + devotee.getUserId() + " " + devotee.first_name + " considers "
									+ master.getUserId() + ": " + master.getFirst_name() +" as a highly trusted User");
				}
			}
		}
	}
	
	public static void weighHighlyTrustedMatrix() {
		int INF = Integer.MAX_VALUE;
		for (int i = 0; i < totalUsers; i++) {
			for (int j = 0; j < totalUsers; j++) {
				if(highlyTrusted[i][j] == 1)
					highlyTrusted[i][j] = getRandomNumberInRange(1, 10);
				else
					highlyTrusted[i][j] = INF;
				//System.out.print(highlyTrusted[i][j]+" ");
			}
			//System.out.println();
		}
	}
	
	public static void releaseWeighHighlyTrustedMatrix() {
		int INF = Integer.MAX_VALUE;
		for (int i = 0; i < totalUsers; i++) {
			for (int j = 0; j < totalUsers; j++) {
				if(highlyTrusted[i][j] != INF)
					highlyTrusted[i][j] = 1;
				else
					highlyTrusted[i][j] = 0;
				//System.out.print(highlyTrusted[i][j]+" ");
			}
			//System.out.println();
		}
	}
	
	public static void createDhighlyTrustedMatrix() {
		for (int i = 0; i < totalUsers; i++) {
			for (int j = 0; j < totalUsers; j++) {
				dhighlyTrusted[i][j] = highlyTrusted[i][j];
			}
		}
	}
	
	public static void printDhighlyTrustedMatrix() {
		for (int i = 0; i < totalUsers; i++) {
			for (int j = 0; j < totalUsers; j++) {
				System.out.print(dhighlyTrusted[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void generateHashset(int[][] highlyTrusted) {

		Hashtable <Integer, HashSet> trustTable = new Hashtable<>();
		boolean flag = true;
		int count = 0;
		int headNode;
		int temp;
		//int totalUsers = 5;

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
					//System.out.println(trustTable);
				}
			}
		}
		scc = (Hashtable<Integer, HashSet>) trustTable.clone();
		//System.out.println("------------------------------");
		//System.out.println(trustTable);	
	}
	
	public static void generateHashset(int[][] highlyTrusted, HashMap map) {

		Hashtable <Integer, HashSet> trustTable = new Hashtable<>();
		boolean flag = true;
		int count = 0;
		int headNode;
		int temp;
		//int totalUsers = 5;

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
					//System.out.println(trustTable);
				}
			}
		}
		scc = (Hashtable<Integer, HashSet>) trustTable.clone();
		System.out.println("------------------------------");
		System.out.println(trustTable);	
	}

	
	/*public static void generateHashset(int[][] highlyTrusted, HashMap<?, ?> map) {

		HashSet<Integer> trustList = new HashSet<Integer>();
		//ArrayList<Integer> trustList = new ArrayList<>();
		Hashtable <Integer, HashSet> trustTable = new Hashtable<>();
		boolean flag = true;
		int trustedCount = 0;
		User master = new User();
		User devotee = new User();
		int count = 0;
		int headNode;

		for (int i = 0; i < totalUsers; i++) {
			for (int j = 0; j < totalUsers; j++) {
				if (highlyTrusted[i][j] == 1) {

					//trustedCount += 1;
					//master = returnUser(map, i);
					//devotee = returnUser(map, j);

					headNode = j;

					trustList.add(j);
					trustList.add(i);
					do {
						for(int k=0; k<totalUsers; k++) {
							if (highlyTrusted[k][j] == 1) {
								trustList.add(k);
								j = k;
								if(k == (totalUsers-1))
									flag = false;
							}else
								count++;
						}
					}while(count == totalUsers-1);

					trustTable.put(headNode, trustList);
					trustList.clear();
				}
			}
		}

		System.out.println("------------------------------");
		System.out.println(trustTable);

	}*/

	public static void printUserPrevileges(int user) {

		System.out.println("Graph: (Adjacency Matrix) for you from attribute 0 to 8: \n\n");

		for (int i = 0; i < totalAttributes; i++) {
			System.out.println("For attribute " + i);
			for (int j = 0; j < totalUsers; j++) {
				System.out.print(threeD2[i][user][j] + " ");
			}
			System.out.println("\n");
		}
	}

	public static void BFS(int attr, int source) {
		breadthFirstSearch(threeD2, attr, source);
	}

	public static void BFS(int source) {
		breadthFirstSearchForTrust(highlyTrusted, source);
	}

	public static void DFS(int attr, int source) {
		depthFirstSearch(threeD2, attr, source);
	}

	public static void DFS(int source) {
		depthFirstSearchForTrust(highlyTrusted, source);
	}

	public static void breadthFirstSearch(int[][][] matrix, int attr, int source) {
		boolean[] visited = new boolean[100];
		visited[source - 1] = true;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(source);
		System.out.println("The breadth first order is: ");
		while (!queue.isEmpty()) {
			System.out.print(queue.peek() + " ");
			int x = queue.poll();
			for (int i = 0; i < 100; i++) {
				if (matrix[attr][x - 1][i] == 1 && visited[i] == false) {
					queue.add(i + 1);
					visited[i] = true;
				}
			}
		}
	}

	public static void breadthFirstSearchForTrust(int[][] highlyTrusted, int source) {
		boolean[] visited = new boolean[100];
		visited[source - 1] = true;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(source);
		System.out.println("The breadth first order is: ");
		while (!queue.isEmpty()) {
			System.out.print(queue.peek() + " ");
			int x = queue.poll();
			for (int i = 0; i < 100; i++) {
				if (highlyTrusted[x - 1][i] == 1 && visited[i] == false) {
					queue.add(i + 1);
					visited[i] = true;
				}
			}
		}
	}

	public static void depthFirstSearch(int[][][] matrix, int attr, int source) {
		boolean[] visited = new boolean[100];
		visited[source - 1] = true;
		Stack<Integer> stack = new Stack<>();
		stack.push(source);
		int i, x;
		System.out.println("The depth first order is");
		System.out.print(source + " ");
		while (!stack.isEmpty()) {
			x = stack.pop();
			for (i = 0; i < 100; i++) {
				if (matrix[attr][x - 1][i] == 1 && visited[i] == false) {
					stack.push(x);
					visited[i] = true;
					System.out.print(i + 1 + " ");
					x = i + 1;
					i = -1;
				}
			}
		}
	}

	public static void depthFirstSearchForTrust(int[][] highlyTrusted, int source) {
		boolean[] visited = new boolean[100];
		visited[source - 1] = true;
		Stack<Integer> stack = new Stack<>();
		stack.push(source);
		int i, x;
		System.out.println("The depth first order is");
		System.out.print(source + " ");
		while (!stack.isEmpty()) {
			x = stack.pop();
			for (i = 0; i < 100; i++) {
				if (highlyTrusted[x - 1][i] == 1 && visited[i] == false) {
					stack.push(x);
					visited[i] = true;
					System.out.print(i + 1 + " ");
					x = i + 1;
					i = -1;
				}
			}
		}
		System.out.println();
	}

	public static void parity(HashMap<Integer, User> map) {

		int count1s = 0;

		for (int i = 0; i < totalAttributes; i++)
			for (int j = 0; j < 100; j++)
				for (int k = 0; k < 100; k++)
					if (threeD2[i][j][k] == 1)
						count1s += 1;

		System.out.println("Current Count of no. of 1s: "+count1s);
		if (count1s%2 == 0)
			setParity(map, 0);
		else
			setParity(map, 1);
	}

	public static void setParity(HashMap<Integer, User> map, int parity) {

		User temp = new User();
		for (int i = 0; i < 100; i++) {
			temp = returnUser(map, i);
			temp.setParity(parity);
			temp.setLatestUpdate(Instant.now().toEpochMilli());
		}
	}

	public static void updateEdge(HashMap map, int i, int j, int k) {
		updatedEdge(map, threeD2, i, j, k);
	}

	public static void updatedEdge(HashMap map, int[][][] threeD2, int i, int j, int k) {
		threeD2[i][j][k] = (threeD2 [i][j][k] == 0)?1:0;
		User temp = new User();
		Vector v = new Vector(i, j ,k);
		for (int p = 0; p < 100; p++) {
			temp = returnUser(map, i);
			temp.setV(v);
			}
	}

	public static User returnUser(HashMap<Integer, User> map, int i) {

		User user = null;

		if (map.containsKey(i))
			user = (User) map.get(i);
		return user;
	}

	public static User seeUserProfile(int userProf) {

		User user = userProfile(map, userProf);
		return user;
	}

	public static User userProfile(HashMap<Integer, User> map, int userProf) {
		User user = null;
		if (map.containsKey(userProf)) {
			user = map.get(userProf);
		}
		return user;
	}

	public static void searchnew(HashMap<Integer, User> map, User source, User dest) {
		int choice;
		System.out.println("*********************************");
		if (authenticity[source.getUserId()][dest.getUserId()] == 1) {
			if (highlyTrusted[source.getUserId()][dest.getUserId()] == 1) {
				choice = 0;
			} else if (anonimity[source.userId][dest.userId] == 1) {
				choice = 1;
			} else if (isFromSameGroup(groupMatrix, source.getUserId(), dest.getUserId()) == 1) {
				choice = 2;
			} else {
				choice = 3;
			}
			System.out.println("THIS IS AN AUTHENTIC OUTPUT");
		}else {
			choice = getRandomNumberInRange(0, 3);
			System.out.println("THIS IS NOT AN AUTHENTIC OUTPUT");
		}
		
		switch (choice) {
		case 0:
			System.out.println("Target User considers you as a trustworthy user\n");
			System.out.println(dest.toString());
			break;
		case 1:
			System.out.println("Target User doesn't want to reveal it's identity (anonymous)\n");
			System.out.println(dest.toStringAnonymity());
			break;
		case 2:
			System.out.println("Target User belongs to your group\n");
			System.out.println(dest.toStringGroup());
			break;
		case 3:
			System.out.println("No group matching");
			for (int i = 0; i < totalAttributes; i++)
				callForSwitch(dest, i);
			}
	}


	public static void search(HashMap<Integer, User> map, int i, User source, User dest) {

		User newUser = null;

		if (threeD2[i][source.getUserId()][dest.getUserId()] == 1) {
			newUser = returnUser(map, dest.getUserId());
			callForSwitch(newUser, i);
		} else {
			System.out.println("*******************\n");
		}

	}

	public static void search(HashMap<Integer, User> map, User source, User dest) {

		User newUser = null;

		for (int j = 0; j < 9; j++) {
			if(threeD2[j][source.getUserId()][dest.getUserId()] != 0) { 
				newUser = returnUser(map, dest.getUserId());
				callForSwitch(dest, j);
			} else {
				System.out.println("*********************\n"); }
		}  
	}

	public static void checkScc(HashMap map, int s, int t) {
		checkedScc(map, scc, s, t);
	}
	
	public static void myScc(HashMap map, Hashtable scc, int s) {
		HashSet <Integer> tempSet = new HashSet<Integer>();
		if (scc.containsKey(s)) {
			tempSet = (HashSet<Integer>) scc.get(s);
			System.out.println(tempSet);
		}else
			System.out.println("No Strongly Connected Components Available");
	}

	public static void checkedScc(HashMap map, Hashtable scc, int s, int t) {

		//User source = returnUser(map, s);
		User target = returnUser(map, t);
		HashSet <Integer> tempSet = new HashSet<Integer>();
		if (scc.containsKey(s)) {
			tempSet = (HashSet<Integer>) scc.get(s);

			if(tempSet.contains(t))
				System.out.println(target);
			else
				System.out.println("Sorry User with UserId "+t+" is not among the strongly connected components");
		}else
			System.out.println("Sorry User with UserId "+s+" has no strongly connected component");
	}

	/*
	 * int userId; String first_name; String last_name; int age; char gender; String
	 * language; String snsLoginId; String email; String role;
	 */

	public static void callForSwitch(User newUser, int j) {

		switch (j) {
		case 0:
			System.out.println("UserId: " + newUser.getUserId());
			break;
		case 1:
			System.out.println("First Name: " + newUser.getFirst_name());
			break;
		case 2:
			System.out.println("Last Name: " + newUser.getLast_name());
			break;
		case 3:
			System.out.println("Age: " + newUser.getAge());
			break;
		case 4:
			System.out.println("Gender: " + newUser.getGender());
			break;
		case 5:
			System.out.println("Language: " + newUser.getLanguage());
			break;
		case 6:
			System.out.println("SNS: " + newUser.getSnsLoginId());
			break;
		case 7:
			System.out.println("Email: " + newUser.getEmail());
			break;
		case 8:
			System.out.println("Services: " + newUser.getServices());
			break;
		default:
			System.out.println("************Default of the switch *************");
			break;
		}
	}
}