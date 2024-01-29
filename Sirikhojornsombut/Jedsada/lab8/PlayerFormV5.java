package sirikhojornsombut.jedsada.lab8;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;

public class PlayerFormV5 extends PlayerFormV4 {
    public PlayerFormV5() {
        setTitle("Player Form V4"); // Set the title for PlayerFormV4
    }

    // Override addComponents to add new components to the frame
    protected void addComponents() {
        super.addComponents(); // Call the addComponents method from the parent class

        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(topPanel);
        mainPanel.add(hobbiesPanel);
        mainPanel.add(sportPanel);
        mainPanel.add(experiencePanel);
        mainPanel.add(centerPanel);
        mainPanel.add(buttonPanel);
        add(mainPanel);

        // Add components to the content pane
    }

    // Static method to create and show the GUI for PlayerFormV4
    public static void createAndShowGUI() {
        PlayerFormV4 playerForm = new PlayerFormV4();
        playerForm.addComponents();
        playerForm.addMenus();
        playerForm.setFrameFeatures();
    }

    // Main method to run the application for PlayerFormV4
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
