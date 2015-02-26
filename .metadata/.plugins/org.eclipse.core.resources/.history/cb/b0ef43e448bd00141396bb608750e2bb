/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private JTextField EmailTxtField; 
    private JTextField PasswdTxtField;
    private JTextField RePasswdTxtField;
    
    //Add UserBox Items
    private JPanel addNewUserPanel;
    
    //Add Event Items
    private JPanel addNewEventPanel;
    final private String[] genderOptions = {"Male", "Female"};
    private JButton okayButton;

    private JTextField noteTxtField;
    private JComboBox<String> genderComboBox;
    
    private JPanel newUserPanel;

    public Register_Window() {
        
       registerUser();
       
       JFrame windowBox = new JFrame("CMSC 495 Register");
       //windowBox.setLayout(new GridLayout(3, 3));
       windowBox.setLayout(new FlowLayout());
       windowBox.setSize(400, 500);
       
       
       
       windowBox.add(addNewUserPanel);
       
       windowBox.setLocationRelativeTo(null);
       windowBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       windowBox.setVisible(true);
    }
    
    private void registerUser() {
        FNameTxtField = new JTextField(8);
        FNameTxtField.setText("Enter First");

        //Last Name TextField
        LNameTxtField = new JTextField(8);
        LNameTxtField.setText("Enter Last");
        
        EmailTxtField = new JTextField(15);
        EmailTxtField.setText("Email");
        
        PasswdTxtField = new JTextField(15);
        PasswdTxtField.setText("Enter Password");
        
        RePasswdTxtField = new JTextField(15);
        RePasswdTxtField.setText("Re-Enter Password");
        
        setBackground(Color.WHITE);

        //OK Button to submit
        okayButton = new JButton("OK");
        okayButton.setToolTipText("New user will be created with this action");

        
        // Color Options for JComboBox 
        genderComboBox = new JComboBox<>(genderOptions);
        genderComboBox.setToolTipText("Select Male or Female for Gender");

        // Search panel properties 
        addNewUserPanel = new JPanel(new GridLayout(8, 1));
        addNewUserPanel.setBorder(new TitledBorder(" Add User "));
        addNewUserPanel.add(new JLabel(" First Name:"));
        addNewUserPanel.add(FNameTxtField);
        addNewUserPanel.add(new JLabel(" Last Name:"));
        addNewUserPanel.add(LNameTxtField);
        addNewUserPanel.add(new JLabel(" Email:"));
        addNewUserPanel.add(EmailTxtField);
        addNewUserPanel.add(new JLabel(" Gender:"));
        addNewUserPanel.add(genderComboBox);
        addNewUserPanel.add(new JLabel(" Password:"));
        addNewUserPanel.add(PasswdTxtField);
        addNewUserPanel.add(new JLabel(" Re-Enter:"));
        addNewUserPanel.add(RePasswdTxtField);
        addNewUserPanel.add(okayButton, BorderLayout.LINE_END);
        
        pack();
    }
    
    private void createOccasion(){
        
    }
    
}
