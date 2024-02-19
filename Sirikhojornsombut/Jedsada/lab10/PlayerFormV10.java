package sirikhojornsombut.jedsada.lab10;

import java.awt.event.ActionEvent;

import javax.swing.SwingUtilities;

public class PlayerFormV10 extends PlayerFormV9 {

    @Override
    public void addListeners() {
        super.addListeners();
        newMenuItem.addActionListener(this);
        openMenuItem.addActionListener(this);
        saveMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);
        redMenuItem.addActionListener(this);
        greenMenuItem.addActionListener(this);
        blueMenuItem.addActionListener(this);
        size16MenuItem.addActionListener(this);
        size20MenuItem.addActionListener(this);
        size24MenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object srcObject = e.getSource(); // Set srcObject when an action is performed
        if (srcObject == exitMenuItem) {
            System.exit(0);
        }
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
