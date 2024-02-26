package sirikhojornsombut.jedsada.lab10;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PlayerFormV10 extends PlayerFormV9 {

    public PlayerFormV10() {
        super(); // Call the constructor of the superclass (PlayerFormV9)
        setTitle("Player Form V10"); // Set the title for the frame
    }

    // Override method to add listeners
    @Override
    public void addListeners() {
        super.addListeners(); // Call the method from the superclass to add existing listeners
        // Add ActionListeners to menu items
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

    // Override method for handling actionPerformed events
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e); // Call the method from the superclass
        srcObject = e.getSource(); // Get the source of the event

        // Check which menu item was clicked and perform corresponding actions
        if (srcObject == newMenuItem) {
            JOptionPane.showMessageDialog(this, "You click menu New");
        }
        if (srcObject == openMenuItem) {
            JOptionPane.showMessageDialog(this, "You click menu Open");
        }
        if (srcObject == saveMenuItem) {
            JOptionPane.showMessageDialog(this, "You click menu Save");
        }
        if (srcObject == exitMenuItem) {
            System.exit(0);
        }
        if (srcObject == redMenuItem) {
            // Set text field foreground color to red
            nameTextField.setForeground(Color.RED);
            nationalityTextField.setForeground(Color.RED);
            dobTextField.setForeground(Color.RED);
        }
        if (srcObject == greenMenuItem) {
            // Set text field foreground color to green
            nameTextField.setForeground(Color.GREEN);
            nationalityTextField.setForeground(Color.GREEN);
            dobTextField.setForeground(Color.GREEN);
        }
        if (srcObject == blueMenuItem) {
            // Set text field foreground color to blue
            nameTextField.setForeground(Color.BLUE);
            nationalityTextField.setForeground(Color.BLUE);
            dobTextField.setForeground(Color.BLUE);
        }
        if (srcObject == size16MenuItem) {
            // Set font size of the noteTextArea to 16
            noteTextArea.setFont(new Font("Serif", Font.BOLD, 16));
        }
        if (srcObject == size20MenuItem) {
            // Set font size of the noteTextArea to 20
            noteTextArea.setFont(new Font("Serif", Font.BOLD, 20));
        }
        if (srcObject == size24MenuItem) {
            // Set font size of the noteTextArea to 24
            noteTextArea.setFont(new Font("Serif", Font.BOLD, 24));
        }
    }

    // Static method to create and show the GUI for PlayerFormV10
    public static void createAndShowGUI() {
        PlayerFormV10 playerForm = new PlayerFormV10(); // Create an instance of PlayerFormV10
        playerForm.addComponents(); // Add components to the frame
        playerForm.addMenus(); // Add menus to the frame
        playerForm.addListeners(); // Add listeners to the frame
        playerForm.setFrameFeatures(); // Set features for the frame
    }

    // Main method to run the application for PlayerFormV10
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); // Create and show the GUI on the Event Dispatch Thread
            }
        });
    }
}
