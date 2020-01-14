package com.cs.ds;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class PrivacyGraph {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String args[]) {

		int totalUsers = 100;
		Graph graph = new Graph(totalUsers);

		User user0 = new User(0,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmail.com","user");
		User user1 = new User(1,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmail.com","user");
		User user2 = new User(2,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmail.com","user");
		User user3 = new User(3,"Sachin","Tamate",28,'F',"Urdu","sachind","sachind@gmail.com","user");
		User user4 = new User(4,"Neha","Batate",29,'M',"Japanese","neham","neham@gmail.com","user");
		User user5 = new User(5,"Pandit","Lande",30,'F',"Hibru","paidinf","paidinf@gmail.com","user");
		User user6 = new User(6,"Naresh","Ande",31,'M',"Chinese","nareshdf","nareshdf@gmail.com","user");
		User user7 = new User(7,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user8 = new User(8,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user9 = new User(9,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user10 = new User(10,"Sachin","Tamate",28,'M',"Urdu","sachind","sachind@gmai.com","user");
		User user11 = new User(11,"Neha","Batate",29,'M',"Japanese","neham","neham@gmai.com","user");
		User user12 = new User(12,"Pandit","Lande",30,'F',"Hibru","paidinf","paidinf@gmai.com","user");
		User user13 = new User(13,"Naresh","Ande",31,'M',"Chinese","nareshdf","nareshdf@gmai.com","user");
		User user14 = new User(14,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user15 = new User(15,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user16 = new User(16,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user17 = new User(17,"Sachin","Tamate",28,'M',"Urdu","sachind","sachind@gmai.com","user");
		User user18 = new User(18,"Neha","Batate",29,'M',"Japanese","neham","neham@gmai.com","user");
		User user19 = new User(19,"Pandit","Lande",30,'F',"Hibru","paidinf","paidinf@gmai.com","user");
		User user20 = new User(20,"Naresh","Ande",31,'M',"Chinese","nareshdf","nareshdf@gmai.com","user");
		User user21 = new User(21,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user22 = new User(22,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user23 = new User(23,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user24 = new User(24,"Sachin","Tamate",28,'M',"Urdu","sachind","sachind@gmai.com","user");
		User user25 = new User(25,"Neha","Batate",29,'M',"Japanese","neham","neham@gmai.com","user");
		User user26 = new User(26,"Pandit","Lande",30,'F',"Hibru","paidinf","paidinf@gmai.com","user");
		User user27 = new User(27,"Naresh","Ande",31,'M',"Chinese","nareshdf","nareshdf@gmai.com","user");
		User user28 = new User(28,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user29 = new User(29,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user30 = new User(30,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user31 = new User(31,"Sachin","Tamate",28,'M',"Urdu","sachind","sachind@gmai.com","user");
		User user32 = new User(32,"Neha","Batate",29,'M',"Japanese","neham","neham@gmai.com","user");
		User user33 = new User(33,"Pandit","Lande",30,'F',"Hibru","paidinf","paidinf@gmai.com","user");
		User user34 = new User(34,"Naresh","Ande",31,'M',"Chinese","nareshdf","nareshdf@gmai.com","user");
		User user35 = new User(35,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user36 = new User(36,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user37 = new User(37,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user38 = new User(38,"Sachin","Tamate",28,'M',"Urdu","sachind","sachind@gmai.com","user");
		User user39 = new User(39,"Neha","Batate",29,'M',"Japanese","neham","neham@gmai.com","user");
		User user40 = new User(40,"Pandit","Lande",30,'F',"Hibru","paidinf","paidinf@gmai.com","user");
		User user41 = new User(41,"Naresh","Ande",31,'M',"Chinese","nareshdf","nareshdf@gmai.com","user");
		User user42 = new User(42,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user43 = new User(43,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user44 = new User(44,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user45 = new User(45,"Sachin","Tamate",28,'M',"Urdu","sachind","sachind@gmai.com","user");
		User user46 = new User(46,"Neha","Batate",29,'M',"Japanese","neham","neham@gmai.com","user");
		User user47 = new User(47,"Pandit","Lande",30,'F',"Hibru","paidinf","paidinf@gmai.com","user");
		User user48 = new User(48,"Naresh","Ande",31,'M',"Chinese","nareshdf","nareshdf@gmai.com","user");
		User user49 = new User(49,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user50 = new User(50,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user51 = new User(51,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user52 = new User(52,"Sachin","Tamate",28,'M',"Urdu","sachind","sachind@gmai.com","user");
		User user53 = new User(53,"Neha","Batate",29,'M',"Japanese","neham","neham@gmai.com","user");
		User user54 = new User(54,"Pandit","Lande",30,'F',"Hibru","paidinf","paidinf@gmai.com","user");
		User user55 = new User(55,"Naresh","Ande",31,'M',"Chinese","nareshdf","nareshdf@gmai.com","user");
		User user56 = new User(56,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user57 = new User(57,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user58 = new User(58,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user59 = new User(59,"Sachin","Tamate",28,'M',"Urdu","sachind","sachind@gmai.com","user");
		User user60 = new User(60,"Neha","Batate",29,'M',"Japanese","neham","neham@gmai.com","user");
		User user61 = new User(61,"Pandit","Lande",30,'F',"Hibru","paidinf","paidinf@gmai.com","user");
		User user62 = new User(62,"Naresh","Ande",31,'M',"Chinese","nareshdf","nareshdf@gmai.com","user");
		User user63 = new User(63,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user64 = new User(64,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user65 = new User(65,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user66 = new User(66,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user67 = new User(67,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user68 = new User(68,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user69 = new User(69,"Sachin","Tamate",28,'M',"Urdu","sachind","sachind@gmai.com","user");
		User user70 = new User(70,"Neha","Batate",29,'M',"Japanese","neham","neham@gmai.com","user");
		User user71 = new User(71,"Pandit","Lande",30,'F',"Hibru","paidinf","paidinf@gmai.com","user");
		User user72 = new User(72,"Naresh","Ande",31,'M',"Chinese","nareshdf","nareshdf@gmai.com","user");
		User user73 = new User(73,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user74 = new User(74,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user75 = new User(75,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user76 = new User(76,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user77 = new User(77,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user78 = new User(78,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user79 = new User(79,"Sachin","Tamate",28,'M',"Urdu","sachind","sachind@gmai.com","user");
		User user80 = new User(80,"Neha","Batate",29,'M',"Japanese","neham","neham@gmai.com","user");
		User user81 = new User(81,"Pandit","Lande",30,'F',"Hibru","paidinf","paidinf@gmai.com","user");
		User user82 = new User(82,"Naresh","Ande",31,'M',"Chinese","nareshdf","nareshdf@gmai.com","user");
		User user83 = new User(83,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user84 = new User(84,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user85 = new User(85,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user86 = new User(86,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user87 = new User(87,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user88 = new User(88,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user89 = new User(89,"Sachin","Tamate",28,'M',"Urdu","sachind","sachind@gmai.com","user");
		User user90 = new User(90,"Neha","Batate",29,'M',"Japanese","neham","neham@gmai.com","user");
		User user91 = new User(91,"Pandit","Lande",30,'F',"Hibru","paidinf","paidinf@gmai.com","user");
		User user92 = new User(92,"Naresh","Ande",31,'M',"Chinese","nareshdf","nareshdf@gmai.com","user");
		User user93 = new User(93,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user94 = new User(94,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user95 = new User(95,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user96 = new User(96,"Prasad","Hajare",25,'M',"Marathi","hajarepd","hajarepd@gmai.com","user");
		User user97 = new User(97,"Swapnil","Jadhav",26,'F',"English","swapnild","swapnild@gmai.com","user");
		User user98 = new User(98,"Ankush","Gajare",27,'M',"Hindi","ankushd","ankushd@gmai.com","user");
		User user99 = new User(99,"Sachin","Tamate",28,'M',"Urdu","sachind","sachind@gmai.com","user");
		//User user100 = new User(4,"Neha","Batate",29,'M',"Japanese","neham","neham@gmai.com","user");

		HashMap<Integer, User> map = new HashMap<Integer, User>();
		//LinkedList<User> list = new LinkedList<User>();

		map.put(0, user0);
		map.put(1, user1);
		map.put(2, user2);
		map.put(3, user3);
		map.put(4, user4);
		map.put(5, user5);
		map.put(6, user6);
		map.put(7, user7);
		map.put(8, user8);
		map.put(9, user9);
		map.put(10, user10);
		map.put(11, user11);
		map.put(12, user12);
		map.put(13, user13);
		map.put(14, user14);
		map.put(15, user15);
		map.put(16, user16);
		map.put(17, user17);
		map.put(18, user18);
		map.put(19, user19);
		map.put(20, user20);
		map.put(21, user21);
		map.put(22, user22);
		map.put(23, user23);
		map.put(24, user24);
		map.put(25, user25);
		map.put(26, user26);
		map.put(27, user27);
		map.put(28, user28);
		map.put(29, user29);
		map.put(30, user30);
		map.put(31, user31);
		map.put(32, user32);
		map.put(33, user33);
		map.put(34, user34);
		map.put(35, user35);
		map.put(36, user36);
		map.put(37, user37);
		map.put(38, user38);
		map.put(39, user39);
		map.put(40, user40);
		map.put(41, user41);
		map.put(42, user42);
		map.put(43, user43);
		map.put(44, user44);
		map.put(45, user45);
		map.put(46, user46);
		map.put(47, user47);
		map.put(48, user48);
		map.put(49, user49);
		map.put(50, user50);
		map.put(51, user51);
		map.put(52, user52);
		map.put(53, user53);
		map.put(54, user54);
		map.put(55, user55);
		map.put(56, user56);
		map.put(57, user57);
		map.put(58, user58);
		map.put(59, user59);
		map.put(60, user60);
		map.put(61, user61);
		map.put(62, user62);
		map.put(63, user63);
		map.put(64, user64);
		map.put(65, user65);
		map.put(66, user66);
		map.put(67, user67);
		map.put(68, user68);
		map.put(69, user69);
		map.put(70, user70);
		map.put(71, user71);
		map.put(72, user72);
		map.put(73, user73);
		map.put(74, user74);
		map.put(75, user75);
		map.put(76, user76);
		map.put(77, user77);
		map.put(78, user78);
		map.put(79, user79);
		map.put(80, user80);
		map.put(81, user81);
		map.put(82, user82);
		map.put(83, user83);
		map.put(84, user84);
		map.put(85, user85);
		map.put(86, user86);
		map.put(87, user87);
		map.put(88, user88);
		map.put(89, user89);
		map.put(90, user90);
		map.put(91, user91);
		map.put(92, user92);
		map.put(93, user93);
		map.put(94, user94);
		map.put(95, user95);
		map.put(96, user96);
		map.put(97, user97);
		map.put(98, user98);
		map.put(99, user99);

		for (int i = 0; i < 9; i++) {
			Graph.addRandomEdge(i, Graph.threeD2, Graph.anonimity);	
		}
		Graph.createNewGroupMatrix();
		Graph.createHighlyTrustedUsers();
		Graph.createAuthenticityMatrix();
		//Graph.generateHashset(Graph.highlyTrusted);

		//String lowerAdmin = "admin";
		//String lowerUser = "user";
		Scanner sc = new Scanner(System.in);

		System.out.print("Please provide your identity admin/user: ");
		String role = sc.nextLine();

		while (true) {
			if ((role.toLowerCase().equals("admin"))) {
				System.out.print(
						"Please select any of the below options:\n" 
								+ "1. Privacy graph for a specific attribute\n"
								+ "2. BFS for specific Attribute\n" 
								+ "3. DFS for specific Attribute\n"
								+ "4. User and Group Relations\n" 
								+ "5. Highly Trustworthy Users Matrix\n"
								+ "6. User Profile\n" 
								+ "7. Strongly trusted Components\n" 
								+ "8. Shortest trust path\n"
								+ "9. Minimum Spanning tree\n"
								+ "10. Update an edge in the privacy matrix\n" 
								+ "11. EXIT\n\n" + "Your Choice: ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("\nPlease enter an attribute for which you want to see the public"
							+ " privacy relationship (only 0 to 9): ");
					int att = sc.nextInt();
					Graph.printGraph(att);
					break;
				case 2:
					System.out.print("Enter attribute and then starting user to see BFS (eg. 5[0-9] 5[1-100]): ");
					Graph.BFS(sc.nextInt(), sc.nextInt());
					break;
				case 3:
					System.out.print("Enter attribute and then starting user to see DFS (eg. 5[0-9] 5[1-100]): ");
					Graph.DFS(sc.nextInt(), sc.nextInt());
					break;
				case 4:
					System.out.print("User and Group Relationship Matrix: \n");
					Graph.printNewGroupMatrix();
					break;
				case 5:
					System.out.println("Trustworthy Relationship Matrix for each pair of Users: \n");
					Graph.printHighlyTrustedMatrix();
					break;
				case 6:
					System.out.print("Please enter the user ID for which you want to see the Profile details (only 0 to 99): ");
					User u = Graph.userProfile(map,sc.nextInt());
					System.out.println(u);
					break;
				case 7:
					System.out.println("Strongly connected components: ");
					Graph.generateHashset(Graph.highlyTrusted, map);
					break;
				case 8:
					System.out.println("Please enter the node from which you want to see "
							+ "the shortest distance to rest of the nodes (only 0 to 99): ");
					System.out.println("Shortest trust path: ");
					ShortestPath.dijkstra(Graph.highlyTrusted, sc.nextInt());
					break;
				case 9:
					System.out.println("Minimum Spanning tree: \n");
					Graph.weighHighlyTrustedMatrix();
					MinimumSpanningTree.kruskalMST(Graph.highlyTrusted);
					Graph.releaseWeighHighlyTrustedMatrix();
					break;
				case 10:
					Graph.parity(map);
					System.out.print("Parity value before update: ");
					System.out.println(user1.getParity() + "\nThe last update happened at: " + user1.getLatestUpdate());
					System.out.print("\nPlease enter three space seperated value to update the "
							+ "edge in privay matrix (attribute no, user1, user2) eg. 5 5 5 : ");
					Graph.updateEdge(map, sc.nextInt(), sc.nextInt(), sc.nextInt());
					Graph.parity(map);
					System.out.print("Parity value after update: ");
					System.out.println(user1.getParity() + "\nThe last update happened at: " + user1.getLatestUpdate());
					//case 11:
					//System.out.println("Exiting the program...");
					//System.exit(1);
				default:
					System.out.println("--- Please enter the valid input");
					break;
				}
			} else if ((role.toLowerCase().equals("user"))) {
				System.out.println("Please enter your userId: ");
				int myUser = sc.nextInt();
				System.out.print(
						"Please select any of the below options:\n" 
								+ "1. Check my own profile\n"
								+ "2. Check my own privileges\n" 
								+ "3. Enquire about another user\n"
								+ "4. Show group matrix\n"
								+ "5. Show authenticity matrix\n"
								+ "6. Check for strongly connected component\n"
								+ "7. EXIT\n\n" + "Your Choice: ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					User u = Graph.userProfile(map, myUser);
					System.out.println(u);
					break;
				case 2:
					System.out.print("Your previleges: ");
					Graph.printUserPrevileges(myUser);
					break;
				case 3:
					User s = Graph.userProfile(map, myUser);
					System.out.print("Please enter the UserID of another user: ");
					User t = Graph.userProfile(map, sc.nextInt());
					Graph.searchnew(map, s, t);
					break;
				case 4:
					Graph.printNewGroupMatrix();
					break;
				case 5:
					Graph.printLessAuthentic();
					break;
				case 6:
					//System.out.print("Please enter the userID: ");
					Graph.generateHashset(Graph.highlyTrusted);
					Graph.myScc(map, Graph.scc, myUser);
					break;
				default:
					System.out.print("--- Please enter the valid input \n");
					break;
				}
			} else {
				System.out.println("\n INVALID INPUT \n");
				System.exit(0);
			} 
		}

	}

}
