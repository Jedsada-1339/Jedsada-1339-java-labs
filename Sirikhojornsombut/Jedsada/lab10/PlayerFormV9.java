package sirikhojornsombut.jedsada.lab10;

import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PlayerFormV9 extends PlayerFormV8 implements ChangeListener{

    @Override
    public void addListeners() {
        super.addListeners();

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
    }

    // Static method to create and show the GUI for PlayerFormV8
    public static void createAndShowGUI() {
        PlayerFormV9 playerForm = new PlayerFormV9();
        playerForm.addComponents();
        playerForm.addMenus();
        playerForm.addListeners();
        playerForm.setFrameFeatures();
    }

    // Main method to run the application for PlayerFormV8
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
