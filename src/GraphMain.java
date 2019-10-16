/**
 * GraphMain.java
 * @version 1.0.0
 * @author Alexandru Mihalache
 * 
 * */

import java.util.Scanner;

public class GraphMain {
  
	/**
	 * GraphMain is  a class where I tested the graph implementation from the Graph class.
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * If you want to be sure that this stage works properly you have to:
		 * -uncomment the line 95 from BST class
		 * -uncomment the line 105 from BST class
		 * -uncomment the line 125 from BST class
		 * -uncomment the line 66 from FileReader class
		 * */
         
        /*The file is input.txt*/
		
		Scanner in=new Scanner(System.in);
		System.out.println("The file to be open:");
		String filename=in.next();
		
		
		BST tree =new BST();
        tree=FileReader.readProfileSet(filename);
        
        /*the file is edgelist.txt*/
        
        System.out.println("The edge list to be open:");
		String filename1=in.next();
        
        
        Graph graph=null;
  
        try {
          graph=new Graph(tree,filename1);      
        }catch(NullPointerException e) {
        	System.out.println("One of the names in the edge list is not in the BST");
        	System.exit(0);
        }
        
        
        /**
         * Now we create an user array with profiles from the file in it.
         * Those profiles will each have their own friend recommendations tree
         * */
        Profile[]users =new Profile[3];
        
        String [] interests= {"football","basketball","poker","programming"};
        String [] interests1={"footbal","poker","programming"};
        String [] interests2={"footbal","basketball","programming"};
        String [] interests3={"footbal","basketball","poker"};
        String [] interests4={"basketball","poker","chess"};
        String [] interests5={"girls"};
        
        /*Creating all the profiles from the files*/
        Profile p=new Profile("Alexandru","Mihalache",28,9,1999,"Swansea","Wales","romanian","email@yahoo.com",interests);
		Profile p1=new Profile("David","Mihalache",28,10,1999,"Swansea","Wales","romanian","Email@yahoo.com",interests1);
		Profile p2=new Profile("Ioan","Mihalache",28,11,1999,"Swansea","Wales","romanian","eMail@yahoo.com",interests2);
		Profile p3=new Profile("Dan","Mihalache",28,12,1999,"Swansea","Wales","romanian","emAil@yahoo.com",interests3);
		Profile p4=new Profile("Iuliana","Mihalache",28,9,2000,"Cardiff","Wales","romanian","emaIl@yahoo.com",null);
		Profile p5=new Profile("Vlad","Mihalache",28,9,2000,"Cardiff","Wales","romanian","emaiL@yahoo.com",interests4);
		Profile p6=new Profile("Gabeno","Mihalache",28,9,2000,"Cardiff","Wales","romanian","EMAIL@yahoo.com",interests5);
		
		/*Adding all the friend relationships from the file*/
		p.addFriend(p1);
		p1.addFriend(p);
		
		p.addFriend(p3);
		p3.addFriend(p);
		
		p.addFriend(p4);
		p4.addFriend(p);
		
		p.addFriend(p2);
		p2.addFriend(p);
        
		p2.addFriend(p5);
        p5.addFriend(p2);
        
        p2.addFriend(p6);
        p6.addFriend(p2);
		
		p3.addFriend(p4);
		p4.addFriend(p3);
		
		/*inserting all the profiles that we want tree recommendations for them.*/
		users[0]=p;
		users[1]=p2;
		users[2]=p3;
		
        BST[]trees=graph.friendRecommendations(users);
	    
        /*Printing the friend recommendations trees*/
        for(int i=0;i<trees.length;i++) {
        	trees[i].printAlphabetical();
        	System.out.println();
        }
        
        
	}
	

}
