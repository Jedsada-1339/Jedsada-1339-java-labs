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

    public static final int TEXT_FIELD_LENGTH = 15;

    public PlayerFormV1() {
        super("Player Form V1");
    }

    @Override
    protected void addComponents() {
        super.addComponents();

        topPanel = new JPanel();
        nameLabel = new JLabel("Name:");
        nationalityLabel = new JLabel("Nationality:");
        dobLabel = new JLabel("Date of Birth (eg.,31-01-1990):");

        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setSelected(true);

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

    @Override
    protected void setFrameFeatures() {
        super.setFrameFeatures();
        pack();
    }

    public static void createAndShowGUI() {
        PlayerFormV1 playerForm = new PlayerFormV1();
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
