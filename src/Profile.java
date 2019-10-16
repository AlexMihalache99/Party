
/**
 * Profile.java
 * @version 1.0.0
 * @author Alexandru Mihalache
 * 
 * */

import java.util.ArrayList;

/**
 *  Profile is a class which contains all the information of a person.
 * 
 */

public class Profile {
     
	/**
	 * the last name of the person.
	 * */
	private String lastname;
	
	/**
	 * the first name of the person.
	 * */
	private String firstname;
	
	/**
	 * the day of birth of the person.
	 * */
	private int day;
	
	/**
	 * the month of birth of the person.
	 * */
	private int month;
	
	/**
	 * the year of birth of the person.
	 * */
	private int year;
	
	/**
	 * the town of residence of the person.
	 * */
	private String town;
	
	/**
	 * the country of residence of the person.
	 * */
	private String country;
	
	/**
	 * the nationality of the person.
	 * */
	private String nationality;
	
	/**
	 * the email address  of the person.
	 * */
	private String email;
	
	/**
	 * the interest of the person.
	 * */
	private String[] interests;
	
	/**
	 * the friends  of the person.
	 * */
	private ArrayList<Profile> friends = new ArrayList<Profile>();
     
	/**
	 * Creates a Profile object.
	 * 
	 * @param firstname      the first name of the person.
	 * @param lastname       the last name of the person.
	 * @param day            the day of birth of the person.
	 * @param month          the month of birth of the person.
	 * @param year           the year of birth of the person.
	 * @param town           the town of residence of the person.
	 * @param country        the country of residence of the person.
	 * @param nationality    the nationality of the person.
	 * @param email          the email address of the person.
	 * @param interests      the interests of the person.
	 * 
	 * */
	public Profile(String firstname, String lastname, int day, int month, int year, String town, String country,
			String nationality, String email, String[] interests) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.day = day;
		this.month = month;
		this.year = year;
		this.town = town;
		this.country = country;
		this.nationality = nationality;
		this.email = email;
		this.interests = interests;

	}
    
	/**
	 * Resets the town.
	 * @param town   the new town of residence.
	 * 
	 * */
	public void setTown(String town) {
		this.town = town;
	}
    
	/**
	 * Resets the country.
	 * @param country   the new country of residence.
	 * 
	 * */
	public void setCountry(String country) {
		this.country = country;
	}
    
	/**
	 * Resets the nationality.
	 * @param nationality   the new nationality.
	 * 
	 * */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
    
	/**
	 * Resets the interests.
	 * @param interests   the new interests.
	 * 
	 * */
	public void setInterests(String[] interests) {
		this.interests = interests;
	}
    
	/**
	 * Resets the email address.
	 * @param email   the new email address .
	 * 
	 * */
	public void setEmailAdress(String email) {
		this.email = email;
	}
    
	/**
	 * 
	 * @return the town of residence.
	 * */
	public String getTown() {
		return this.town;
	}
    
	/**
	 * 
	 * @return the country of residence.
	 * */
	public String getCountry() {
		return this.country;
	}
    
	/**
	 * 
	 * @return the nationality.
	 * */
	public String getNationality() {
		return this.nationality;
	}
    
	/**
	 * 
	 * @return the interests.
	 * */
	public String[] getInterests() {
		return this.interests;
	}
    
	/**
	 * 
	 * @return the email address.
	 * */
	public String getEmailAdress() {
		return this.email;
	}
    
	
	/**
	 *  The method returns a string suitable for printing.
	 *  
	 * @return the name of the person.
	 * */
	public String getName() {

		String s = this.firstname + " " + this.lastname;
		return s;
	}
    
	/**
	 *  The method returns a string suitable for printing.
	 * 
	 * @return the date of birth.
	 * */
	public String getDateOfBirth() {

		String s = Integer.toString(this.day) + "." + Integer.toString(this.month) + "." + Integer.toString(this.year);
		return s;
	}
    
	/**
	 * the method is adding a friend for a person
	 * @param p the friend to be added 
	 *
	 * */
	public void addFriend(Profile p) {
		this.friends.add(p);
	}
    
	/**
	 * @return the friend at the i-th position or null
	 * 
	 * */
	public Profile getFriend(int i) {
		return this.friends.get(i);
	}
    
	/**
	 * 
	 * @return the number of friends the person has.
	 * */
	public int numOfFriends() {
		return this.friends.size();
	}
	
	/**
	 * The method returns a string suitable for printing.
	 * 
	 * @return string to print out profile.
	 */
	public String toString() {

		String result = "";

		result += "Its name is " + this.getName() + "\n";
		result += "Its date of birth is:" + this.getDateOfBirth() + "\n";
		result += "Its town of residence is " + this.getTown() + "\n";
		result += "Its country of residence is " + this.getCountry() + "\n";
		result += "Its nationality is " + this.getNationality() + "\n";
		result += "Its email is " + this.email + "\n";
		result += "Its interests are {";

		for (int i = 0; i < this.getInterests().length; i++) {

			if (i == this.getInterests().length - 1) {
				result += this.getInterests()[i];
				break;
			}

			result += this.getInterests()[i] + ",";

		}

		result += "}" + "\n";

		result += this.getName() + " has " + this.numOfFriends() + " friends";

		for (int i = 0; i < this.numOfFriends(); i++) {
			result += this.getFriend(i) + "\n";
		}
		result += "\n";

		return result;
	}

}
