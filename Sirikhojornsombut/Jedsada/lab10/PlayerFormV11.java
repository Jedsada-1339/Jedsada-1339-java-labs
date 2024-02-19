package sirikhojornsombut.jedsada.lab10;

import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class PlayerFormV11 extends PlayerFormV10 {
    protected JMenuItem customMenuItem;

    protected void addMenus(){
        super.addMenus();
        customMenuItem = new JMenuItem("Custom");
    }

    public static void createAndShowGUI() {
        PlayerFormV11 playerForm = new PlayerFormV11();
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
