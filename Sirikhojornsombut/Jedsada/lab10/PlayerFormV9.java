package sirikhojornsombut.jedsada.lab10;

import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class PlayerFormV9 extends PlayerFormV8 implements ChangeListener {

    // Constructor for PlayerFormV9
    public PlayerFormV9() {
        super(); // Call the constructor of the superclass (PlayerFormV8)
        setTitle("Player Form V9"); // Set the title for the frame
    }

    // Override method to add listeners
    @Override
    public void addListeners() {
        super.addListeners(); // Call the method from the superclass to add existing listeners
        experienceSlider.addChangeListener(this); // Add ChangeListener to the experienceSlider
    }

    // Override method for stateChanged event in ChangeListener
    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider slider = (JSlider) e.getSource(); // Get the source of the event
        if (!slider.getValueIsAdjusting()) { // Check if the slider value is not adjusting
            int value = slider.getValue(); // Get the current value of the slider
            JOptionPane.showMessageDialog(this, "Year of experience in this sport is " + value); // Display a message dialog with the experience value
        }
    }

    // Static method to create and show the GUI for PlayerFormV9
    public static void createAndShowGUI() {
        PlayerFormV9 playerForm = new PlayerFormV9(); // Create an instance of PlayerFormV9
        playerForm.addComponents(); // Add components to the frame
        playerForm.addMenus(); // Add menus to the frame
        playerForm.addListeners(); // Add listeners to the frame
        playerForm.setFrameFeatures(); // Set features for the frame
    }

    // Main method to run the application for PlayerFormV9
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); // Create and show the GUI on the Event Dispatch Thread
            }
        });
    }
}
