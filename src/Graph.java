
/**
 * Graph.java
 * @version 1.0.0
 * @author Alexandru Mihalache
 * 
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Graph {

	/**
	 * the BST that encodes a graph.
	 */
	private BST tree;

	/**
	 * Creates a graph.
	 * 
	 * @param tree     the tree that encodes the graph.
	 * @param filename the file that has the edge list of friend relationships.
	 * 
	 * 
	 */
	public Graph(BST tree, String filename) {
		this.tree = tree;
		this.addFriendRelationship(filename);
	}

	/**
	 * A method to check if name is in the BST.
	 * 
	 * @param name the name to be checked.
	 * @param tree the tree that has or not the name.
	 * 
	 * @return the profile of the BST if found or null.
	 * 
	 */
	public Profile profile(String name, BST tree) {

		return tree.checkProfile(name, tree);

	}

	/**
	 * A method to check if two profiles are friends.
	 * 
	 * @param p1 the first profile.
	 * @param p2 the second profile.
	 * 
	 * @return true if they are friends and false if not.
	 * 
	 */
	public boolean checkFriends(Profile p1, Profile p2) {

		for (int i = 0; i < p1.numOfFriends(); i++) {

			if (p1.getFriend(i) == p2) {
				return true;
			}
		}
		return false;
	}

	/**
	 * A method to add the friend relationships between profiles.
	 * 
	 * @param filename the file that contains the edge list.
	 */
	public void addFriendRelationship(String filename) {
		Scanner in = null;

		try {
			in = new Scanner(new File(filename));

		} catch (FileNotFoundException e) {
			System.out.println("Ooooops I can not open the file:" + filename);
			System.exit(0);
		}

		while (in.hasNextLine()) {

			String newline = in.nextLine();
			Scanner line = new Scanner(newline);
			line.useDelimiter(",");

			String name1 = line.next();
			String name2 = line.next();
            
			line.close();
			/**
			 * if either profile is not in the BST throw an error 
			 * if they are in the BST make them friends
			 * 
			 */
			if (profile(name1, tree) == null) {
				throw new NullPointerException();

			} else if (profile(name2, tree) == null) {
				throw new NullPointerException();

			} else {

				Profile p1 = profile(name1, tree);
				Profile p2 = profile(name2, tree);

				p1.addFriend(p2);
				p2.addFriend(p1);

			}

		}

	}

	/**
	 * A method to make friend recommendations between profiles . 
	 * and creates an array of BSTs.
	 * 
	 * @param users[] the profiles to be recommended.
	 * @return an array of BSTs with each friend recommendation graph.
	 * 
	 */
	public BST[] friendRecommendations(Profile[] users) {
        
		BST[] trees = new BST[users.length];
		

		for (int i = 0; i < users.length; i++) {
			BST tree=new BST();
			
			for (int j = 0; j < users[i].numOfFriends(); j++) {

				for (int k = 0; k < users[i].getFriend(j).numOfFriends(); k++) {
                    
                    
					if (users[i] != users[i].getFriend(j).getFriend(k)) {

						if (checkFriends(users[i], users[i].getFriend(j).getFriend(k)) == false) {
						 tree.insertProfile(users[i].getFriend(j).getFriend(k));
						}
					}
				}
			}
			trees[i]=tree;
		}

		return trees;
	}
}
