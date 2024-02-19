package sirikhojornsombut.jedsada.lab10;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PlayerFormV8 extends sirikhojornsombut.jedsada.lab9.PlayerFormV7 implements ListSelectionListener {

    public PlayerFormV8() {
        super();
        setTitle("Player Form V8");
    }

    @Override
    public void addListeners() {
        super.addListeners();
        // Add ListSelectionListener to the sportsList
        sportsList.addListSelectionListener(this);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            // Retrieve selected items from the list
            Object[] selectedSports = sportsList.getSelectedValues();

            if (selectedSports.length > 0) {
                // Build the message for the dialog
                StringBuilder message = new StringBuilder("Selected sports are ");
                for (Object sport : selectedSports) {
                    message.append(sport).append(", ");
                }
                // Remove the trailing comma and space
                message.setLength(message.length() - 2);

                // Display a dialog with the selected sports
                JOptionPane.showMessageDialog(this, message.toString());
            }
        }
    }

    // Static method to create and show the GUI for PlayerFormV8
    public static void createAndShowGUI() {
        PlayerFormV8 playerForm = new PlayerFormV8();
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
