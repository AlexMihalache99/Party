/**
 * BSTNodeMain.java
 * @version 1.0.0
 * @author Alexandru Mihalache
 * 
 * */
public class BSTNodeMain {
 
	/**
	 * BSTNodeMain is a class where I tested the BSTNode methods.
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*an interests array for testing*/
		String [] interests= {"cars","football","basketball"};
		
		 /*creating some BSTNode variables*/
		 BSTNode node=new BSTNode(new Profile("Alexandru","Mihalache",28,9,1999,"Swansea","Wales","Romanian","email@yahoo.com",interests));
		 BSTNode node1=new BSTNode(new Profile("Alexandru1","Mihalache1",28,5,1999,"Swansea1","Wales1","Romanian1","Email@yahoo.com",interests));
		 BSTNode node2=new BSTNode(new Profile("Alexandru2","Mihalache2",28,6,1999,"Swansea2","Wales2","Romanian2","EMail@yahoo.com",interests));
		 
		 /*printing the profile of a node*/
		 System.out.println(node.getProfile());
		 
		 /*setting the left and right child of the node*/
		 node.setL(node1);
		 node.setR(node2);
		 
		 /*checking if they are correctly placed*/
		 System.out.println(node.getL().getProfile());
		 System.out.println(node.getR().getProfile());
		 

	}

}
