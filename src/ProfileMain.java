/**
 * ProfileMain.java
 * @version 1.0.0
 * @author Alexandru Mihalache
 * 
 * */
public class ProfileMain {
	
	/**
	 * Profile Main is a class where I tested the methods of Profile class.
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/*an interests array for testing*/
		String [] interests= {"cars","football","basketball"};
		
		/*creating Profile variables*/
		Profile p=new Profile("Alexandru","Mihalache",28,9,1999,"Swansea","Wales","Romanian","email@yahoo.com",interests);
		Profile p1=new Profile("Alexandru1","Mihalache1",28,5,1999,"Swansea1","Wales1","Romanian1","Email@yahoo.com",interests);
		Profile p2=new Profile("Alexandru2","Mihalache2",28,6,1999,"Swansea2","Wales2","Romanian2","EMail@yahoo.com",interests);
		Profile p3=new Profile("Alexandru3","Mihalache3",28,7,1999,"Swansea3","Wales3","Romanian3","EMAil@yahoo.com",interests);
		
		System.out.println(p);//printing the p variable
		
		/*changing some fields of the p variable*/
		p.setCountry("Uganda");
		p.setNationality("american");
		p.setTown("LA");
		
		/*checking if they worked properly*/
		System.out.println(p);
		
		/*adding some friends to p*/
		p.addFriend(p1);
		p.addFriend(p2);
		p.addFriend(p3);
		
		/**
		 *checking if it worked by printing the number of friends 
		 *and each friend separately.
		 **/
		
		System.out.println(p.numOfFriends());
		
		for(int i=0;i<p.numOfFriends();i++) {
			
		System.out.println(p.getFriend(i));
		}
	}

}
