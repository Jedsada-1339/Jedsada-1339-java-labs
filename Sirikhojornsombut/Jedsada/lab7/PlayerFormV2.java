package sirikhojornsombut.jedsada.lab7;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV2 extends PlayerFormV1 {
    protected JLabel playerTypeLabel;
    protected JComboBox<String> typesCombo;
    protected JLabel noteLabel;
    protected JTextArea noteTextArea;

    // Constructor for PlayerFormV2
    public PlayerFormV2() {
        setTitle("Player Form V2"); // Set the title for PlayerFormV2
    }

    // Override addComponents to add specific components for PlayerFormV2
    @Override
    protected void addComponents() {
        super.addComponents(); // Call the addComponents method from the superclass

        JPanel centerPanel = new JPanel();

        playerTypeLabel = new JLabel("Player Type:");
        String[] playerTypes = {"Beginner", "Amateur", "Professional"};
        typesCombo = new JComboBox<>(playerTypes);
        typesCombo.setSelectedItem("Amateur");
        typesCombo.setEditable(false);

        noteLabel = new JLabel("Note:");
        noteTextArea = new JTextArea("Thailand will face Oman at the Abdullah bin Khalifa Stadium in Doha, Qatar, on Sunday in their second match of the 2023 AFC Asian Cup, Group F.", 3, 35);
        noteTextArea.setLineWrap(true);
        noteTextArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(noteTextArea);

        topPanel.setLayout(new GridLayout(5, 2));
        topPanel.add(playerTypeLabel);
        topPanel.add(typesCombo);

        centerPanel.setLayout(new GridLayout(2, 1));
        centerPanel.add(noteLabel);
        centerPanel.add(scrollPane);

        mainPanel.add(centerPanel ,BorderLayout.CENTER);
    }

    // Override setFrameFeatures to add specific features for PlayerFormV2
    @Override
    protected void setFrameFeatures() {
        super.setFrameFeatures(); // Call the setFrameFeatures method from the superclass
        pack(); // Pack components within the frame
    }

    // Static method to create and show the GUI for PlayerFormV2
    public static void createAndShowGUI() {
        PlayerFormV1 playerForm = new PlayerFormV2();
        playerForm.addComponents();
        playerForm.setFrameFeatures();
    }

    // Main method to run the application for PlayerFormV2
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
