package sirikhojornsombut.jedsada.lab9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.SwingUtilities;


public class PlayerFormV7 extends PlayerFormV6 implements ActionListener,ItemListener {
    
    public PlayerFormV7() {
        setTitle("Player Form V7"); // Set the title for PlayerFormV4
    }

    public void addListeners(){
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }
    

    // Override addComponents to add new components to the frame
    protected void addComponents() {
        super.addComponents(); // Call the addComponents method from the parent class
    }

    protected void addMenus(){
        super.addMenus();
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
