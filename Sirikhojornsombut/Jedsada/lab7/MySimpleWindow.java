package sirikhojornsombut.jedsada.lab7;

import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame {
    protected JPanel buttonPanel;
    protected JPanel mainPanel;
    protected JButton resetButton;
    protected JButton submitButton;

    // Constructor with a title parameter
    public MySimpleWindow(String title) {
        super(title);
    }

    // Method to initialize and add components to the frame
    protected void addComponents() {
        buttonPanel = new JPanel();
        mainPanel = new JPanel();
        resetButton = new JButton("Reset");
        submitButton = new JButton("Submit");

        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    // Method to set basic frame features
    protected void setFrameFeatures() {
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true); // Make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation on exit
        pack(); // Pack components within the frame
    }

    // Static method to create and show the GUI
    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
