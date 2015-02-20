import java.awt.Image;
import java.sql.Date;
import java.util.LinkedHashMap;


public class Events {

	private String eventID;
	private String name;
	private Venue venue;
	private Date startTime;
	private Date endTime;
	private String info;
	private Date date;
	private Image photo;
	private LinkedHashMap <String, User> host;
	private LinkedHashMap <String, User> invited;
	private LinkedHashMap <String, User> attended;
            
        //default constructor
        public Events(){
    }
        //constructor to create address with information in it
        public Events (String a, String b, Venue c, Date d, Date e, String f, Date g, Image h){
        
        eventID = a;
	name = b;
	venue = c;
	startTime = d;
	endTime = e;
	info = f;
	date = g;
	photo = h;
    }
        
        /**
	 * 
	 * toString
	 */
        
        @Override
        public String toString(){
                return eventID+", "+name+", "+venue+", "+startTime+", "+endTime+", "+info+", "+date;
    } 
    
        /**
	 * 
	 *  getters
	 */
    
        public String getEventID () {
                return eventID;
}        
        public String getName () {
                return name;
}
        public Venue getVenue () {
                return venue;
}
         public Date getStartDate () {
                return startTime;
}
         public Date getEndDate () {
                return endTime;
}
         public String getInfo () {
                return info;
}
         public Date getDate () {
                return date;
}
       
        /**
	 * 
	 * setters
	 */
        
        public void setEventID(String eventID) {
		this.eventID = eventID;
	}
        public void setName(String name) {
		this.name = name;
	}        
        public void setVenue(Venue venue) {
		this.venue = venue;
	}
        public void setStartDate(Date date) {
		this.startTime = date;
	}
        public void setEndDate(Date date) {
		this.endTime = date;
	}
        public void setInfo(String info) {
		this.info = info;
	}
        public void setDate(Date date) {
		this.date = date;
	}
}
