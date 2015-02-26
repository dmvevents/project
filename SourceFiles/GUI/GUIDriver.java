import java.io.IOException;


public class GUIDriver {
	
	public static void main (String args[]) throws IOException{
		
		System.out.println("Hello");
		
		Landing landing = new Landing();
		landing.setVisible(true);
		
		Register register = new Register();
		register.setVisible(true);
		
		Login login = new Login ();
		login.setVisible(true);
		
		Homepage homepage = new Homepage();
		homepage.setVisible(true);
		
	}

}
