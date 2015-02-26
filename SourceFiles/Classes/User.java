import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.Date;
import java.util.LinkedHashMap;


public class User {
	/**
	 * User Fields 
	 */
	private String userID;
	private String email;
	private String fName;
	private String lName;
	private Date dOB;
	private Gender gender;
	private String password;
	private Image Photo;
	private LinkedHashMap <String,Events> events; 
	private LinkedHashMap <String,Wishlist> wishlist; 
	private Color bgColor;
	private Font font;
	
        //default constructor
        public User(){
    }
        //constructor to create address with information in it
        public User (String a, String b, String c, String d, Date e, Gender f, String g, Image h, Color i, Font j){
        
        userID = a;
	email = b;
	fName = c;
	lName = d;
	dOB = e;
	gender = f;
	password = g;
	Photo = h;
	bgColor = i;
	font = j;
    }
        
        /**
	 * 
	 * toString
	 */
        
        @Override
        public String toString(){
            return userID+"("+email+") "+fName+lName+", "+dOB+", "+gender+", "+password;
    }
	/**
	 * 
	 * Get Methods 
	 */
	public String getUserID() {
		return userID;
	}
	public String getEmail() {
		return email;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public Date getdOB() {
		return dOB;
	}
	public Gender getGender() {
		return gender;
	}
	public String getPassword() {
		return password;
	}
	public Image getPhoto() {
		return Photo;
	}
	public LinkedHashMap<String, Events> getEvents() {
		return events;
	}
	public LinkedHashMap<String, Wishlist> getWishlist() {
		return wishlist;
	}
	public Color getBgColor() {
		return bgColor;
	}
	public Font getFont() {
		return font;
	}
	
	/**
	 * 
	 * Set Methods
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhoto(Image photo) {
		Photo = photo;
	}
	public void setEvents(LinkedHashMap<String, Events> events) {
		this.events = events;
	}
	public void setWishlist(LinkedHashMap<String, Wishlist> wishlist) {
		this.wishlist = wishlist;
	}
	public void setBgColor(Color bgColor) {
		this.bgColor = bgColor;
	}
	public void setFont(Font font) {
		this.font = font;
	}
}
