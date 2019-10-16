/**
 * FileReaderMain.java
 * @version 1.0.0
 * @author Alexandru Mihalache
 * 
 * */

import java.util.Scanner;

public class FileReaderMain {

	/**
	 * FileReaderMain is a class where I tested the FileReader methods.
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
		
        FileReader.readProfileSet(filename);
         
	}

}
