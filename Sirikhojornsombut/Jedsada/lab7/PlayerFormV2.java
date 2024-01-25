package sirikhojornsombut.jedsada.lab7;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV2 extends PlayerFormV1 {
    protected JLabel playerTypeLabel;
    protected JComboBox<String> typesCombo;
    protected JLabel noteLabel;
    protected JTextArea noteTextArea;

    public PlayerFormV2() {
        setTitle("Player Form V2");
    }

    @Override
    protected void addComponents() {
        super.addComponents();

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


        topPanel.setLayout(new GridLayout(6, 2));
        topPanel.add(playerTypeLabel);
        topPanel.add(typesCombo);
        topPanel.add(noteLabel);
        topPanel.add(scrollPane);
    }

    @Override
    protected void setFrameFeatures() {
        super.setFrameFeatures();
        pack();
    }

    public static void createAndShowGUI() {
        PlayerFormV1 playerForm = new PlayerFormV2();
        playerForm.addComponents();
        playerForm.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
