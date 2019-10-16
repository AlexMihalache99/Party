/**
 * BSTNode.java
 * @version 1.0.0
 * @author Alexandru Mihalache
 * 
 * */
public class BSTNode {
	
	/**
	 * A BSTNode is a class which contains all the informations of a node. 
	 * 
	 * */
      
	  /**
	   * the profile of the node.
	   * */
	  private Profile data;
	  
	  /**
	   * the left child of the node.
	   * */
	  private BSTNode l;
	  
	  /**
	   * the right child of the node.
	   * */
	  private BSTNode r;
	  
	  /**
	   * Creates a BSTNode object.
	   * 
	   * @param p the profile of the node.
	   * 
	   * */
	  public BSTNode(Profile p) {
		  this.data=p;
	  }
	  
	  /**
	   * 
	   * @return the profile of the node.
	   * */
	  public Profile getProfile() {
		  return this.data;
	  }
	  
	  /**
	   * Resets the left child of the node.
	   * @param l the new left child.
	   * */
	  public void setL(BSTNode l) {
		  this.l=l;
	  }
	  
	  /**
	   * Resets the right child of the node.
	   * @param r the new right child
	   * */
	  public void setR(BSTNode r) {
		  this.r=r;
	  }
	  
	  /**
	   * 
	   * @return the left child of the node.
	   * */
	  public BSTNode getL() {
		  return this.l;
	  }
	  
	  /**
	   * 
	   * @return the right child of the node.
	   * */
	  public BSTNode getR() {
		  return this.r;
	  }
	  
}
