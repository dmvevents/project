
public class Product {

    private int productID;
    private String name;
    private int price;
    private String priority;


    //default constructor

    public Product(){
    }

    public Product (int a, String b, int c, String d){

        productID = a;
        name = b;
        price = c;
        priority = d;
    }

    //toString Method

   @Override
   public String toString(){

        return productID + ", " +name+ ", " + price + ", " + priority;
   } 

   //Getter Methods

     public int getProductID () {

        return productID;
     }        

    public String getName () {

        return name;
    }

    public int getPrice () {

        return price;
    }

    public String getPriority() {

        return priority; 
    }

    //Setter Methods

    public void setProductID(int venueID) {

        this.productID = venueID;
    }


    public void setName(String name) {

        this.name = name;

    }

    public void setPrice(int price) {

        this.price = price;

    }

    public void setPriority(String priority) {

        this.priority = priority;

    }

}
