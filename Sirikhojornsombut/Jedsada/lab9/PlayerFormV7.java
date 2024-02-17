package sirikhojornsombut.jedsada.lab9;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

// PlayerFormV7 extends PlayerFormV6 and implements ItemListener
public class PlayerFormV7 extends PlayerFormV6 implements ItemListener {

    // Constructor for PlayerFormV7, setting the title
    public PlayerFormV7() {
        setTitle("Player Form V7");
    }

    // Method to add listeners for various components, extending the superclass's listeners
    public void addListeners(){
        super.addListeners(); // Call the superclass method to add its listeners
        maleRadioButton.addItemListener(this);
        femaleRadioButton.addItemListener(this);
        readingCheckbox.addActionListener(this);
        browsingCheckbox.addActionListener(this);
        sleepingCheckbox.addActionListener(this);
        travelingCheckbox.addActionListener(this);
    }

    // actionPerformed method to handle events when buttons or checkboxes are interacted with
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e); // Call the superclass method to handle common actions

        // Check if the source object is an instance of JCheckBox
        if(srcObject instanceof JCheckBox){
            JCheckBox checkBox = (JCheckBox) srcObject;

            // Display a message based on whether the checkbox is selected or not
            if(checkBox.isSelected()){
                JOptionPane.showMessageDialog(this, checkBox.getActionCommand()+" is one of the hobbies");
            } else {
                JOptionPane.showMessageDialog(this, checkBox.getActionCommand()+" is no longer one of the hobbies");
            }
        }
    }

    // itemStateChanged method to handle changes in the state of radio buttons
    public void itemStateChanged(ItemEvent e) {
        Object src = e.getItemSelectable();

        // Check if the source object is an instance of JRadioButton
        if (src instanceof JRadioButton) {
            JRadioButton radioBtn = (JRadioButton) src;

            // Display a message when a radio button's state is changed
            if (radioBtn.isSelected())
                JOptionPane.showMessageDialog(this, "Gender is updated to " + radioBtn.getActionCommand());
        } 
    }

    // Static method to create and show the GUI for PlayerFormV7
    public static void createAndShowGUI() {
        PlayerFormV7 playerForm = new PlayerFormV7();
        playerForm.addComponents();
        playerForm.addMenus();
        playerForm.addListeners();
        playerForm.setFrameFeatures();
    }

    // Main method to run the application for PlayerFormV7
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
