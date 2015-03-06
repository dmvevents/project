import java.awt.Image;
import java.sql.Date;
import java.util.LinkedHashMap;


public class Events {

	private String eventID;
	private String name;
	private String venue;
	private String startTime;
	private String endTime;
	private String info;
	private String date;
	private Image photo;
	private LinkedHashMap <String, User> host;
	private LinkedHashMap <String, User> invited;
	private LinkedHashMap <String, User> attended;
            
        //default constructor
        public Events(){
    }
        //constructor to create address with information in it
        public Events (String a, String b, String c, String d, String e, String f, String g, Image h){
        
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
        public String getVenue () {
                return venue;
}
         public String getStartDate () {
                return startTime;
}
         public String getEndDate () {
                return endTime;
}
         public String getInfo () {
                return info;
}
         public String getDate () {
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
        public void setVenue(String venue) {
		this.venue = venue;
	}
        public void setStartDate(String date) {
		this.startTime = date;
	}
        public void setEndDate(String date) {
		this.endTime = date;
	}
        public void setInfo(String info) {
		this.info = info;
	}
        public void setDate(String date) {
		this.date = date;
	}
}
