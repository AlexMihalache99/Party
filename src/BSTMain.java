/**
 * BSTMain.java
 * @version 1.0.0
 * @author Alexandru Mihalache
 * 
 * */
public class BSTMain {
/**
 * BSTMain is a class where I tested the insert operation of profiles in the BST.
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
                /**
		 * If you want to be sure that this stage works properly you have to:
		 * -uncomment the line 95 from BST class
		 * -uncomment the line 105 from BST class
		 * -uncomment the line 125 from BST class
		 */

                /*an interests array for testing*/
		String [] interests= {"cars","football","basketball"};
      
		BST tree=new BST();
		
		
		/*inserting node in the tree*/
		tree.insertProfile(new Profile("Alexandru","Mihalache",28,9,1999,"Swansea","Wales","Romanian","email@yahoo.com",interests));
		tree.insertProfile(new Profile("Alexandru1","Mihalache1",28,5,1999,"Swansea1","Wales1","Romanian1","Email@yahoo.com",interests));
		tree.insertProfile(new Profile("Alexandru2","Mihalache2",28,6,1999,"Swansea2","Wales2","Romanian2","EMail@yahoo.com",interests));
		tree.insertProfile(new Profile("Alexandru3","Mihalache3",28,7,1999,"Swansea3","Wales3","Romanian3","EMAil@yahoo.com",interests));
		tree.insertProfile(new Profile("Alcxandru","Mihalache",28,7,1999,"Swansea3","Wales3","Romanian3","EMAil@yahoo.com",interests));
		
		
	}

}
