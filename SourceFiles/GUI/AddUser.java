import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class AddUser extends JFrame {
	
	private JPanel loginPanel;
	private JLabel emailLabel;
	private JTextField email;
	private JButton addUser;
	private JButton cancel;
	
	
	public AddUser (){
		
		new JFrame();
		setTitle("Add User");
		setSize(200,200);
		createPanel();
		pack();
	}

	public void createPanel (){
		
		//Initialize Fields
		loginPanel = new JPanel(new GridBagLayout());
		
		//Set Constraints
		GridBagConstraints gbc = new GridBagConstraints();
		
		/*
		 * Add Fields
		 */
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		emailLabel = new JLabel("Email: ");
		loginPanel.add(emailLabel,gbc);
		
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridwidth=3;
		email = new JTextField();
		loginPanel.add(email,gbc);
		
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=2;
		addUser = new JButton("Add User");
		loginPanel.add(addUser,gbc);
		
		gbc.gridx=2;
		gbc.gridy=1;
		gbc.gridwidth=2;
		cancel = new JButton ("Cancel");
		loginPanel.add(cancel,gbc);
		
		add(loginPanel);

	}
	
	public JButton getAddUser() {
		return addUser;
	}

	public JButton getCancel() {
		return cancel;
	}

}
