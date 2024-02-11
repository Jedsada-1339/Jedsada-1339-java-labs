package sirikhojornsombut.jedsada.lab9;

import javax.swing.*;
import java.awt.*;

public class DiceGameWindow extends JFrame {
    protected JPanel buttonPanel;
    protected JButton highButton;
    protected JButton lowButton;
    protected JButton rollButton;
    protected DiceImageCanvas diceCanvas; // New instance of DiceImageCanvas

    // Constructor with a title parameter
    public DiceGameWindow(String title) {
        super(title);
    }

    // Method to initialize and add components to the frame
    protected void addComponents() {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        highButton = new JButton("High");
        lowButton = new JButton("Low");
        rollButton = new JButton("Roll");
        buttonPanel.add(highButton);
        buttonPanel.add(lowButton);
        buttonPanel.add(rollButton);
    
        diceCanvas = new DiceImageCanvas(3); // Initialize DiceImageCanvas with 3 dots
    
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        mainPanel.add(diceCanvas, BorderLayout.CENTER);
    
        add(mainPanel);
    }
    

    // Method to set basic frame features
    protected void setFrameFeatures() {
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true); // Make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation on exit
        setSize(400, 400); // Increase size to accommodate the dice
    }

    // Static method to create and show the GUI
    public static void createAndShowGUI() {
        DiceGameWindow msw = new DiceGameWindow("DiceGameWindow Version1");
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
