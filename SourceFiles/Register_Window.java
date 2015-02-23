package cmsc495_final_proj;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.border.*;


public class Register_Window extends JFrame {

    private JTextField FNameTxtField;
    private JTextField LNameTxtField;
    
    //Add UserBox Items
    private JPanel addNewUserPanel;
    
    //Add Event Items
    private JPanel addNewEventPanel;
    final private String[] colorOptions = {"Blue", "Green", "Yellow", 
                                           "Orange", "Red"};
    private JButton okayButton;

    private JTextField noteTxtField;
    private JComboBox<String> colorComboBox;
    
    private JPanel newUserPanel;

    public Proj_Window() {
        
       createUser();
       
       JFrame windowBox = new JFrame("CMSC 495 Project");
       //windowBox.setLayout(new GridLayout(3, 3));
       windowBox.setLayout(new FlowLayout());
       windowBox.setSize(800, 600);
       
       
       
       windowBox.add(addNewUserPanel);
       
       windowBox.setLocationRelativeTo(null);
       windowBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       windowBox.setVisible(true);
    }
    
    private void createUser() {
        FNameTxtField = new JTextField(8);
        FNameTxtField.setText("Enter First");

        //Last Name TextField
        LNameTxtField = new JTextField(8);
        LNameTxtField.setText("Enter Last");
        
        noteTxtField = new JTextField();
        noteTxtField.setText("Enter Comment");
        
        setBackground(Color.WHITE);

        //OK Button to submit
        okayButton = new JButton("OK");
        okayButton.setToolTipText("New user will be created with this action");

        
        // Color Options for JComboBox 
        colorComboBox = new JComboBox<>(colorOptions);
        colorComboBox.setName("Color");
        colorComboBox.setToolTipText("Sets a color label for user.");

        // Search panel properties 
        addNewUserPanel = new JPanel(new GridLayout(4, 1));
        addNewUserPanel.setBorder(new TitledBorder(" Add User "));
        addNewUserPanel.add(new JLabel(" First Name:"));
        addNewUserPanel.add(FNameTxtField);
        addNewUserPanel.add(new JLabel(" Last Name:"));
        addNewUserPanel.add(LNameTxtField);
        addNewUserPanel.add(new JLabel(" Color Options"));
        addNewUserPanel.add(colorComboBox);
        addNewUserPanel.add(okayButton, BorderLayout.LINE_END);
        
        pack();
    }

    
}
