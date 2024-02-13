package sirikhojornsombut.jedsada.lab9;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;


public class PlayerFormV7 extends PlayerFormV6 implements ItemListener {
    
    public PlayerFormV7() {
        setTitle("Player Form V7"); // Set the title for PlayerFormV4
    }

    public void addListeners(){
        super.addListeners();
        maleRadioButton.addItemListener(this);
        femaleRadioButton.addItemListener(this);
        readingCheckbox.addItemListener(this);
        browsingCheckbox.addItemListener(this);
        sleepingCheckbox.addItemListener(this);
        travelingCheckbox.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        Object src = e.getItemSelectable();
        if(src instanceof JRadioButton){
            JRadioButton radioBtn = (JRadioButton) src;
            if (radioBtn.isSelected())
                JOptionPane.showMessageDialog(this, "Gender is updated to "+ radioBtn.getActionCommand());
        } else if (src instanceof JCheckBox) {
            JCheckBox checkBox = (JCheckBox) src;
            //System.out.println(checkBox.getText() + " " + checkBox.isSelected());
            if (e.getStateChange() == ItemEvent.SELECTED) {
                JOptionPane.showMessageDialog(this, "Selected " + checkBox.getText());
                checkBox.setSelected(true);
            } else {
                JOptionPane.showMessageDialog(this, "Unselected " + checkBox.getText());
                checkBox.setSelected(false);
            }
        }
    }
    
    
    public static void createAndShowGUI() {
        PlayerFormV7 playerForm = new PlayerFormV7();
        playerForm.addComponents();
        playerForm.addMenus();
        playerForm.addListeners();
        playerForm.setFrameFeatures();
    }

    // Main method to run the application for PlayerFormV5
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
