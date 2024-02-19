package sirikhojornsombut.jedsada.lab10;

import java.awt.event.ActionEvent;

import javax.swing.SwingUtilities;

public class PlayerFormV10 extends PlayerFormV9 {
    
    @Override
    public void addListeners() {
        super.addListeners();
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        super.actionPerformed(e);
    }

    public static void createAndShowGUI() {
        PlayerFormV10 playerForm = new PlayerFormV10();
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
