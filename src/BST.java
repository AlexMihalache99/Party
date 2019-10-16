/**
 * BST.java
 * @version 1.0.0
 * @author Alexandru Mihalache
 * 
 * */


import java.util.Stack;

public class BST {
	
	/**
	 * A BST is a class which contains the tree informations.
	 * 
	 * */
	
	 /**
	  * 
	  * the root of the tree.
	  * */
     private  BSTNode root;
      
     
     /**
      * Creates a null root of a tree.
      * 
      * */
      public BST() {
    	this.root=null;
      }
      
      
      /**
       * Compares two strings to know which one is bigger.
       * 
       * @param string1 the first string to be compared.
       * @param string2 the second string to be compared.
       * @return >0 if string1>string2, <0 if string1<string2, 0 if string1=string2.
       * */
      private static int comparison(String string1, String string2) 
      { 
          /**
           * We need to take the minimum length of the two strings
           * i.e. let's say we are comparing abcd and fghjikl
           * as the length of abcd is 4 and the length of fghjkl is 6
           * the 5th character of fghjkl can not be compare with 
           * any character of abcd
           * 
           * */
          int length1 = string1.length(); 
          int length2 = string2.length(); 
          int lengthmin = Math.min(length1, length2); 
          
          /**
           * Comparing every character one by one
           * if one of them is different then 
           * return >0 if string1_ch is bigger
           * return <0 if string2_ch is bigger 
           * */
          for (int i = 0; i < lengthmin; i++) { 
              int string1_ch = (int)string1.charAt(i); 
              int string2_ch = (int)string2.charAt(i); 
    
              if (string1_ch != string2_ch) { 
                  return string1_ch - string2_ch; 
              } 
          } 
          
          /**for special cases like comparing
           * Alex and Alexandru
           * */
          if (length1 != length2) { 
              return length1 - length2; 
          } 
             
            /*if the strings are equals*/
              return 0; 
           
      } 
    
      /**
       * A recursive method to add a node in the tree.
       * 
       * @param root the root of the tree.
       * @param node the node to be inserted.
       * 
       * */
      private void recursive(BSTNode root, BSTNode node) {
    	  
    	  if(comparison(root.getProfile().getName(),node.getProfile().getName())>0) {
    		  
    		  if(root.getL()==null) {
    			  root.setL(node);
    			  //System.out.println(node.getProfile());
    		  }else {
    			  recursive(root.getL(),node);
    		  }		  
    	  }
    	  
          if(comparison(root.getProfile().getName(),node.getProfile().getName())<0) {
    		  
    		  if(root.getR()==null) {
    			  root.setR(node);
    			//System.out.println(node.getProfile());
    		  }else {
    			  recursive(root.getR(),node);
    		  }
    	  }
    	  
    	  
      }
      
      /**
       * Inserting a node in the tree using a recursive method.
       * 
       * @param p the profile to be inserted
       * 
       * */
      public void insertProfile (Profile p) {
    	  
    	  BSTNode node=new BSTNode(p);
    	  
    	  if(this.root==null) {
    		  root=node;
    		 //System.out.println(node.getProfile());
    		  root.setL(null);
    		  root.setR(null);
    	  }else {
    		  recursive(this.root,node);
    	  }
      }
          
      /**
       * A method to print the nodes in alphabetical order using a stack.
       * 
       * */
      public void printAlphabetical() {
    	  
    	  if (this.root == null) 
              return ; 
    
          
          Stack<BSTNode> stack = new Stack<BSTNode>(); 
          BSTNode currentnode = this.root; 
    
         /**
          * the loop is working while we still have nodes to add
          * either from the stack or from the tree.
          * 
          * */
          while (currentnode != null || stack.size() > 0){
        	  
        	  /*we add all the left children into the stack*/
              while (currentnode !=  null) { 
                  stack.push(currentnode); 
                  currentnode = currentnode.getL(); 
              } 
              
              /**
               * current node takes the top of the stack.
               * and the top of the stack is removed.
               * */
              currentnode = stack.pop(); 
              
              System.out.println(currentnode.getProfile().getName() + " "); 
              
              /**
               * current node now has the right children.
               * */
              currentnode = currentnode.getR(); 
          } 
    	  
    	  
      }
        
      /**
       * A method to check if a name is in the BST.
       * 
       * @param name the name to be checked.
       * @param tree the BST.
       * 
       * @return if found the profile from the BST or null.
       * */
        public Profile checkProfile(String name,BST tree) {
    	  
          
          Stack<BSTNode> stack = new Stack<BSTNode>(); 
          BSTNode currentnode = this.root; 
    
         /**
          * the loop is working while we still have nodes to add
          * either from the stack or from the tree.
          * 
          * */
          while (currentnode != null || stack.size() > 0){
        	  
        	  /*we add all the left children into the stack*/
              while (currentnode !=  null) { 
                  stack.push(currentnode); 
                  currentnode = currentnode.getL(); 
              } 
              
              /**
               * current node takes the top of the stack.
               * and the top of the stack is removed.
               * */
              currentnode = stack.pop(); 
              
              if(currentnode.getProfile().getName().equals(name)) {
            	  return currentnode.getProfile();
              }
              
              /**
               * current node now has the right children.
               * */
              currentnode = currentnode.getR(); 
          } 
          return null;
    	  
    	  
      }
      
          
           
}
