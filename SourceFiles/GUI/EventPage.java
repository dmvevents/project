import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;


@SuppressWarnings("serial")
public class EventPage extends JFrame {
	
	Image userPic;
	JLabel eventName;
	JLabel eventDate;
	JTextPane eventInfo;
	JButton updateEvent;
	JButton editSettings;
	JPanel event;
	
	public EventPage() throws IOException{
		
		new JFrame();
		setTitle("Event Page");
		setSize(300, 300);
		createPanel();
		pack();
		
	}
	
	public void createPanel() throws IOException {
		
		//Create Panel Instance
		event = new JPanel (new GridBagLayout());
		
		//Set Constraints
		GridBagConstraints gbc = new GridBagConstraints();
		
		//Add image to Panel 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		userPic = ImageIO.read(new File ("face.jpeg"));
		event.add(new JLabel(new ImageIcon(userPic)));
		
		
		//Add user info panel 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth=2;
		
		//Panel to hold user information 
		JPanel labelHolder = new JPanel (new GridLayout(2,1));
		eventName = new JLabel ("Event Name: ");
		eventDate = new JLabel ("Event Data: ");
		labelHolder.add(eventName);
		labelHolder.add(eventDate);
		event.add(labelHolder,gbc);
		
	
		
		/*
		 * Test Data for JTable 
		 * 
		 */
		
		
		eventInfo = new JTextPane ();
		
		//Add user info panel 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=4;
		event.add(eventInfo,gbc);
		
		
		
		//Add buttons
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		updateEvent = new JButton ("Update Event");
		event.add(updateEvent,gbc);
		
		gbc.gridx=2;
		gbc.gridy=2;
		gbc.gridwidth=2;
		editSettings = new JButton ("Edit Settings");
		event.add(editSettings,gbc);
		
		add(event);
		
	}
	
	public JButton getUpdateEvent() {
		return updateEvent;
	}

	public JButton getEditSettings() {
		return editSettings;
	}

}
