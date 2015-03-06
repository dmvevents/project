import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


@SuppressWarnings("serial")
public class Homepage extends JFrame {
	
	private Image userPic;
	private JLabel userName;
	private JLabel userBday;


	private JTable userEvents;
	

	private JButton createEvent;
	private JButton editSettings;
	private JPanel homepage;
	DefaultTableModel model;
	
	public Homepage(LinkedHashMap<String, Events> eventsMap) throws IOException{
		
		new JFrame("Frame");
		setTitle("Homepage");
		setSize(300, 300);
		createPanel(eventsMap);
		pack();
		
	}
	
	public void createPanel(LinkedHashMap<String, Events> eventsMap) throws IOException {
		
		//Create Panel Instance
		homepage = new JPanel (new GridBagLayout());
		
		//Set Constraints
		GridBagConstraints gbc = new GridBagConstraints();
		
		//Add image to Panel 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		userPic = ImageIO.read(new File ("face.jpeg"));
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
		
		
		int mapSize = eventsMap.size();
		String [] columnData = {"Event ID","Event Name","User", "Date","Venue"};

		String [][] newData = new String [mapSize][5];
		
		model = new DefaultTableModel(); 
	
		
		Iterator<Events> it = eventsMap.values().iterator();
		int i=0;
		
		while(it.hasNext()){
			
			Events currentEvent = it.next();

			String currentID= currentEvent.getEventID();
			String eventName = currentEvent.getName();
			String userName = "Anton";
			String eventDate = currentEvent.getDate();
			String eventVenue = currentEvent.getVenue();
			
			newData[i][0]= currentID;
			newData[i][1]= eventName;
			newData[i][2]= userName;
			newData[i][3]= eventDate;
			newData[i][4]= eventVenue;
			
			i++;
		}
		
		
		model.setColumnIdentifiers(columnData);
		model.addColumn(newData);
		
		//JTable newEvents = new JTable (newData,columnData);
		userEvents = new JTable (newData,columnData);
		
		
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
		createEvent = new JButton ("Create Event");
		homepage.add(createEvent,gbc);
		
		gbc.gridx=2;
		gbc.gridy=3;
		gbc.gridwidth=2;
		editSettings = new JButton ("Edit Settings");
		homepage.add(editSettings,gbc);
		
		add(homepage);
		
	}
	
	public JButton getCreateEvent() {
		return createEvent;
	}

	public JButton getEditSettings() {
		return editSettings;
	}
	
	public JTable getUserEvents() {
		return userEvents;
	}

	public void updateEvents(LinkedHashMap<String, Events> eventsMap) {
		// TODO Auto-generated method stub
		
		int mapSize = eventsMap.size();
		String [] columnData = {"Event ID","Event Name","User", "Date","Venue"};

		String [][] newData = new String [mapSize][5];
		
		Iterator<Events> it = eventsMap.values().iterator();
		int i=0;
		
		while(it.hasNext()){
			
			Events currentEvent = it.next();

			String currentID= currentEvent.getEventID();
			String eventName = currentEvent.getName();
			String userName = "Anton";
			String eventDate = currentEvent.getDate();
			String eventVenue = currentEvent.getVenue();
			
			newData[i][0]= currentID;
			newData[i][1]= eventName;
			newData[i][2]= userName;
			newData[i][3]= eventDate;
			newData[i][4]= eventVenue;
			
			i++;
		}
		
		userEvents = new JTable (newData,columnData);
		
		validate();
		repaint();
	}

}
