package sirikhojornsombut.jedsada.lab7;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV1 extends MySimpleWindow {
    protected JPanel topPanel;
    protected JLabel nameLabel;
    protected JLabel nationalityLabel;
    protected JLabel dobLabel;
    protected JRadioButton maleRadioButton;
    protected JRadioButton femaleRadioButton;

    // Constant for text field length
    public static final int TEXT_FIELD_LENGTH = 15;

    // Constructor for PlayerFormV1
    public PlayerFormV1() {
        super("Player Form V1");
    }

    // Override addComponents to add specific components for PlayerFormV1
    @Override
    protected void addComponents() {
        super.addComponents(); // Call the addComponents method from the superclass

        topPanel = new JPanel();
        nameLabel = new JLabel("Name:");
        nationalityLabel = new JLabel("Nationality:");
        dobLabel = new JLabel("Date of Birth (eg., 31-01-1990):");

        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setSelected(true);

        // Create a ButtonGroup for the radio buttons to ensure only one can be selected
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        topPanel.setLayout(new GridLayout(4, 2));
        topPanel.add(nameLabel);
        topPanel.add(new JTextField(TEXT_FIELD_LENGTH));
        topPanel.add(nationalityLabel);
        topPanel.add(new JTextField(TEXT_FIELD_LENGTH));
        topPanel.add(dobLabel);
        topPanel.add(new JTextField(TEXT_FIELD_LENGTH));
        topPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        topPanel.add(genderPanel);

        mainPanel.add(topPanel, BorderLayout.CENTER);
    }

    // Override setFrameFeatures to add specific features for PlayerFormV1
    @Override
    protected void setFrameFeatures() {
        super.setFrameFeatures(); // Call the setFrameFeatures method from the superclass
        pack(); // Pack components within the frame
    }

    // Static method to create and show the GUI for PlayerFormV1
    public static void createAndShowGUI() {
        PlayerFormV1 playerForm = new PlayerFormV1();
        playerForm.addComponents();
        playerForm.setFrameFeatures();
    }

    // Main method to run the application for PlayerFormV1
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
