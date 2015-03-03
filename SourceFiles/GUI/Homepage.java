import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;


@SuppressWarnings("serial")
public class Homepage extends JFrame {
	
	Image userPic;
	JLabel userName;
	JLabel userBday;
	JTable userEvents;
        
        private final JButton createEvent = new JButton(new AbstractAction("Create Event") {
        @Override
        public void actionPerformed( ActionEvent e ) {
           CreateEvent creatEvent = new CreateEvent();
           creatEvent.setLocationRelativeTo(null);
           creatEvent.setVisible(true);
        }
    });
       
                
        
        
	JButton editSettings;
	JPanel homepage;
	
	public Homepage(){
		
		new JFrame("Frame");
		setTitle("Homepage");
		setSize(300, 300);
		createPanel();
		
	}
	
	public void createPanel(){
		
		//Create Panel Instance
		homepage = new JPanel (new GridBagLayout());
		
		//Set Constraints
		GridBagConstraints gbc = new GridBagConstraints();
		
		//Add image to Panel 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
            try {
                userPic = ImageIO.read(new File ("face.jpeg"));
            } catch (IOException ex) {
                Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
            }
		homepage.add(new JLabel(new ImageIcon(userPic)));
		
		
		//Add user info panel 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth=2;
		
		//Panel to hold user information 
		JPanel labelHolder = new JPanel (new GridLayout(2,1));
		userName = new JLabel ("userName");
		userBday = new JLabel ("userBDay");
		labelHolder.add(userName);
		labelHolder.add(userBday);
		homepage.add(labelHolder,gbc);
		
	
		
		/*
		 * Test Data for JTable 
		 * 
		 */
		
		String [] columnData = {"Event Name","User", "Date","Venue"};
		String [][] dummyData = {
				{"Event1", "Anton", "00/00/00", "DC"},
				{"Event2", "Eric", "00/00/00", "DC"},
				{"Event3", "Jay", "00/00/00", "DC"},
				{"Event1", "Sallie", "00/00/00", "DC"}
				};
		
		
		userEvents = new JTable (dummyData,columnData);
		
		//Add user info panel 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=4;
		homepage.add(userEvents.getTableHeader(),gbc);
		
		//Add user info panel 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=4;
		homepage.add(userEvents,gbc);
		
		//Add buttons
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		homepage.add(createEvent,gbc);
		
		gbc.gridx=2;
		gbc.gridy=3;
		gbc.gridwidth=2;
		editSettings = new JButton ("Edit Settings");
		homepage.add(editSettings,gbc);
		
		add(homepage);
		
	}

}
