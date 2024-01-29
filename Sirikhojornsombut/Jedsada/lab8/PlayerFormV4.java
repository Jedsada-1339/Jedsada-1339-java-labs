package sirikhojornsombut.jedsada.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV4 extends PlayerFormV3 {
    protected JPanel hobbiesPanel;
    protected JPanel sportPanel;
    protected JPanel experiencePanel;

    // Components for favorite sports
    private JList<String> sportsList;
    private String[] sports = {"Badminton", "Boxing", "Football", "Running"};

    // Constructor for PlayerFormV4
    public PlayerFormV4() {
        setTitle("Player Form V4"); // Set the title for PlayerFormV4
    }

    // Override addComponents to add new components to the frame
    protected void addComponents() {
        super.addComponents(); // Call the addComponents method from the parent class

        JPanel hobbiesPanel = new JPanel();
        JPanel hobbiesPanel2 = new JPanel();

        hobbiesPanel.setLayout(new GridLayout(0,1));

        // Add checkboxes for hobbies
        JLabel hobbiesLabel = new JLabel("Hobbies:");
        JCheckBox readingCheckbox = new JCheckBox("Reading");
        JCheckBox browsingCheckbox = new JCheckBox("Browsing");
        JCheckBox sleepingCheckbox = new JCheckBox("Sleeping");
        JCheckBox travelingCheckbox = new JCheckBox("Traveling");
        sleepingCheckbox.setSelected(true); // Checked by default

        hobbiesPanel.add(hobbiesLabel);

        hobbiesPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        hobbiesPanel2.add(readingCheckbox);
        hobbiesPanel2.add(browsingCheckbox);
        hobbiesPanel2.add(sleepingCheckbox);
        hobbiesPanel2.add(travelingCheckbox);

        hobbiesPanel.add(hobbiesPanel2);


        JPanel sportPanel = new JPanel();
        sportPanel.setLayout(new GridLayout(0,2));
        // Add components for favorite sports
        JLabel sportLabel = new JLabel("Sport:");
        sportsList = new JList<>(sports);
        sportsList.setSelectedValue("Football", true); // Selected by default
        sportPanel.add(sportLabel);
        sportPanel.add(sportsList);
        
        JPanel experiencePanel = new JPanel();
        experiencePanel.setLayout(new GridLayout(0,1));
        // Add components for years of experience slider
        JLabel experienceLabel = new JLabel("Year of experience in this sport:");
        JSlider experienceSlider = new JSlider(0, 20, 0); // Minimum, Maximum, Default
        experienceSlider.setMajorTickSpacing(5);
        experienceSlider.setMinorTickSpacing(1);
        experienceSlider.setPaintTicks(true);
        experienceSlider.setPaintLabels(true);
        experiencePanel.add(experienceLabel);
        experiencePanel.add(experienceSlider);



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
