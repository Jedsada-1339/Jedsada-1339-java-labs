package sirikhojornsombut.jedsada.lab9;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

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
        readingCheckbox.addActionListener(this);
        browsingCheckbox.addActionListener(this);
        sleepingCheckbox.addActionListener(this);
        travelingCheckbox.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if(srcObject instanceof JCheckBox){
            JCheckBox checkBox = (JCheckBox) srcObject;
            if(checkBox.isSelected()){
                JOptionPane.showMessageDialog(this, checkBox.getActionCommand()+" is one of the hobbies");
            }else{
                JOptionPane.showMessageDialog(this, checkBox.getActionCommand()+" is no longer one of the hobbies");
            }
        }
    }

    public void itemStateChanged(ItemEvent e) {
        Object src = e.getItemSelectable();
        if (src instanceof JRadioButton) {
            JRadioButton radioBtn = (JRadioButton) src;
            if (radioBtn.isSelected())
                JOptionPane.showMessageDialog(this, "Gender is updated to " + radioBtn.getActionCommand());
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
