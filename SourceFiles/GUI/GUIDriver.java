import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class GUIDriver {  
    public static Boolean login = false;
    
	public static void main (String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		
		System.out.println("Hello");
                UIManager.setLookAndFeel(
	        UIManager.getCrossPlatformLookAndFeelClassName());
                
                Landing landing =new Landing();
                landing.setLocationRelativeTo(null);
		landing.setVisible(true);
        
        } 
}
