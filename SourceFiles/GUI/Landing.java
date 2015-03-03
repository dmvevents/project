import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Landing extends JFrame {
	
	private JButton login;
	private JButton register;
	private Image logo;
	private JPanel loginPanel;
	
	public Landing () {
		
		new JFrame("Frame");
		setTitle("Landing Page");
		setSize(200,200);
		createPanel();
		
	}
	
	public void createPanel(){
		
		//Initialize Panel Variables
		
		loginPanel = new JPanel(new GridBagLayout());
		login = new JButton("Login");
		register = new JButton ("Register");
            try {
                logo = ImageIO.read(new File ("c:/bday.jpeg"));
            } catch (IOException ex) {
                Logger.getLogger(Landing.class.getName()).log(Level.SEVERE, null, ex);
            }
		
		//Set Constraints
		GridBagConstraints gbc = new GridBagConstraints();
		
		/*
		 * Add the logo image to panel 
		 */
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=2;
		loginPanel.add(new JLabel(new ImageIcon(logo)),gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=2;
		loginPanel.add(new JPanel(),gbc);

		
		/*
		 * Add the buttons to the panel 
		 */
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		loginPanel.add(login,gbc);
		
		gbc.gridx=1;
		gbc.gridy=2;
		loginPanel.add(register,gbc);
		
		//Add panel to main frame 
		add(loginPanel);
                
	login.addActionListener(new LoginButtonListener());
        register.addActionListener(new RegisterButtonListener());
}
        private class LoginButtonListener implements ActionListener {
        public LoginButtonListener(){
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
                Login login = new Login ();
		login.setLocationRelativeTo(null);
                login.setVisible(true);
        }
    }
        private class RegisterButtonListener implements ActionListener {
        public RegisterButtonListener(){
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
                Register register = new Register();
		register.setLocationRelativeTo(null);
                register.setVisible(true);
        }
    }
	
	
	
	
}
