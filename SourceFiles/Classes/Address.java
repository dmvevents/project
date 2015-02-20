
import java.sql.Date;


public class Address {
	
	private String addressID;
	private String street;
	private String city;
	private String state;
	private String region;
	private String country;
	private String zipCode;
	private double longitude;
	private double latitude; 
        
        //default constructor
        public Address(){
    }
        //constructor to create address with information in it
        public Address (String a, String b, String c, String d, String e, String f, String g, double h, double i){
        
        addressID = a;
	street = b;
	city = c;
	state = d;
	region = e;
	country = f;
	zipCode = g;
	longitude = h;
	latitude = i;
    }
         
        /**
	 * 
	 * toString
	 */
        
        @Override
        public String toString(){
                return addressID+", "+street+", "+city+", "+state+", "+region+", "+country+", "+zipCode+", "+longitude+", "+latitude;
    }  
    
        /**
	 * 
	 *  getters
	 */
    
        public String getAddressID () {
                return addressID;
}        
        public String getStreet () {
                return street;
}
        public String getCity () {
                return city;
}
        public String getState () {
                return state;
}
        public String getRegion () {
                return region;
}
        public String getCountry () {
                return country;
}
        public String getZIP () {
                return zipCode;
}
        public Double getLong () {
                return longitude;
}
        public Double getLat () {
                return latitude;
}
        
        /**
	 * 
	 * setters
	 */
        
        public void setAddressID(String addressID) {
		this.addressID = addressID;
	}
        public void setStreet(String street) {
		this.street = street;
	}        
        public void setCity(String city) {
		this.city = city;
	}
        public void setState(String state) {
		this.state = state;
	}
        public void setRegion(String region) {
		this.region = region;
	}
        public void setCountry(String country) {
		this.country = country;
	}
        public void setZIP(String zipCode) {
		this.zipCode = zipCode;
	}
        public void setLong(double longitude) {
		this.longitude = longitude;
	}
        public void setLat(double latitude) {
		this.latitude = latitude;
	}
}
