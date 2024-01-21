package sirikhojornsombut.jedsada.lab7;

import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame {
    protected JPanel buttonPanel;
    protected JPanel mainPanel;
    protected JButton resetButton;
    protected JButton submitButton;

    public MySimpleWindow(String title) {
        super(title);
    }

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

    protected void setFrameFeatures() {
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

