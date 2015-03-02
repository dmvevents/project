import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class GUIDriver {  
    public static Boolean login = false;
    
	public static void main (String args[]) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		
		System.out.println("Hello");
                UIManager.setLookAndFeel(
	        UIManager.getCrossPlatformLookAndFeelClassName());
                Landing landing =new Landing();
                landing.setLocationRelativeTo(null);
		landing.setVisible(true);
		
                Homepage homepage = new Homepage();
                homepage.setLocationRelativeTo(null);
                homepage.setVisible(true);
                
		CreateEvent creatEvent = new CreateEvent();
		creatEvent.setLocationRelativeTo(null);
                creatEvent.setVisible(true);
		
		EventPage event = new EventPage();
		event.setLocationRelativeTo(null);
                event.setVisible(true);
        }

}
