package sirikhojornsombut.jedsada.lab9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

// PlayerFormV6 extends PlayerFormV5 and implements ActionListener
public class PlayerFormV6 extends sirikhojornsombut.jedsada.lab8.PlayerFormV5 implements ActionListener {
    protected String gender;
    protected StringBuilder hobbies;
    protected Object srcObject;

    // Constructor for PlayerFormV6, setting the title
    public PlayerFormV6() {
        setTitle("Player Form V6");
    }

    // Method to add action listeners to various components
    public void addListeners(){
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
        nameTextField.addActionListener(this);
        nationalityTextField.addActionListener(this);
        dobTextField.addActionListener(this);
    }

    // ActionPerformed method to handle events when buttons or text fields are interacted with
    public void actionPerformed(ActionEvent e) {
        srcObject = e.getSource(); // Get the source of the event

        // Determine the selected gender based on radio buttons
        if(maleRadioButton.isSelected() == true){
            gender = "male";
        } else {
            gender = "female";
        }

        // Use StringBuilder to build a string of selected hobbies
        StringBuilder hobbies = new StringBuilder();
        if (readingCheckbox.isSelected()) {
            hobbies.append(readingCheckbox.getText()).append(" ");
        }

        if (browsingCheckbox.isSelected()) {
            hobbies.append(browsingCheckbox.getText()).append(" ");
        }

        if (sleepingCheckbox.isSelected()) {
            hobbies.append(sleepingCheckbox.getText()).append(" ");
        }

        if (travelingCheckbox.isSelected()) {
            hobbies.append(travelingCheckbox.getText()).append(" ");
        }

        // Handle different events based on the source object
        if (srcObject == submitButton) {
            JOptionPane.showMessageDialog(this, nameTextField.getText()+" has nationality as "+ nationalityTextField.getText() +" and was born on "+ dobTextField.getText()
            + ", has gender as " + gender +" ,is a "+typesCombo.getSelectedItem() +" player, has hobbies as "+hobbies+" and plays "+sportsList.getSelectedValuesList());
        } else if (srcObject == resetButton){
            nameTextField.setText("");
            nationalityTextField.setText("");
            dobTextField.setText("");
        }
        if (srcObject == nameTextField){
            JOptionPane.showMessageDialog(this,"Name is changed to " + nameTextField.getText());
        } else if (srcObject == nationalityTextField){
            JOptionPane.showMessageDialog(this,"Nationality is changed to " + nationalityTextField.getText());
        }
        else if (srcObject == dobTextField){
            JOptionPane.showMessageDialog(this,"Date of Birth is changed to " + dobTextField.getText());
        }
    }

    // Static method to create and show the GUI for PlayerFormV6
    public static void createAndShowGUI() {
        PlayerFormV6 playerForm = new PlayerFormV6();
        playerForm.addComponents();
        playerForm.addMenus();
        playerForm.addListeners();
        playerForm.setFrameFeatures();
    }

    // Main method to run the application for PlayerFormV6
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
