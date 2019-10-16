/**
 *  FileReader.java
 *  @version 1.0.0
 *  @author Alexandru Mihalache
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
	 
	/**
	 * FileReader is a class which reads a Profile.
	 * 
	 * */
	
	/**
	 * A method to read all the fields of a profile from a line.
	 * @param in The scanner of the file.
	 * @return the profile constructed.
	 * */
	public static Profile profile(Scanner in) {
		
		Profile p=null;
		
		String firstname=in.next();
		String lastname=in.next();
		int day=in.nextInt();
		int month=in.nextInt();
		int year=in.nextInt();
		String town=in.next();
		String country=in.next();
		String nationality=in.next();
		String email=in.next();
		in.useDelimiter(";");
		in.skip(",");//because we changed the delimiter we need to skip the previous one
	    
		
	    ArrayList<String> interests1  = new ArrayList<String>();
	    while(in.hasNext()) {
	    	
		  	interests1.add(in.next());
		  	
		}
	    String[] interests=interests1.toArray(new String[interests1.size()]);
	    
	    
		p=new Profile(firstname,lastname,day,month,year,town,country,nationality,email,interests);
		return p;
		
	}
	
	/**
	 * This method is inserting profiles one by one in the tree. 
	 * 
	 * @param in  the scanner of the file.
	 * @return the constructed tree.
	 * */
	private static BST readProfileSet(Scanner in) {
		BST tree =new BST();
		while (in.hasNextLine()) {
			
			String newline = in.nextLine();
			//System.out.println(newline);	
			Scanner line = new Scanner(newline);
			line.useDelimiter(",");
		    tree.insertProfile(profile(line));
			
		}
		return tree;
	}
	
	
	/**
	 * This method opens a file and returns a tree.
	 * if it does not exists it throws an error.
	 * 
	 * @param filename the name of the file.
	 * @return the binary search tree.
	 * */
	public static BST readProfileSet (String filename) {
		
		Scanner in = null;

		try {

			in = new Scanner(new File(filename));

		} catch (FileNotFoundException e) {
			System.out.println("oooops I can not open the file:" + filename);
			System.exit(0);
		}
		
		return FileReader.readProfileSet(in);
	}

}
