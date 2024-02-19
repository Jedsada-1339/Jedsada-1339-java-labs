package sirikhojornsombut.jedsada.lab10;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PlayerFormV10 extends PlayerFormV9 {

    public PlayerFormV10() {
        super();
        setTitle("Player Form V10");
    }

    @Override
    public void addListeners() {
        super.addListeners();
        newMenuItem.addActionListener(this);
        openMenuItem.addActionListener(this);
        saveMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);
        redMenuItem.addActionListener(this);
        greenMenuItem.addActionListener(this);
        blueMenuItem.addActionListener(this);
        size16MenuItem.addActionListener(this);
        size20MenuItem.addActionListener(this);
        size24MenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        srcObject = e.getSource();
        if(srcObject == newMenuItem){
            JOptionPane.showMessageDialog(this, "You click menu New");
        }
        if(srcObject == openMenuItem){
            JOptionPane.showMessageDialog(this, "You click menu Open");
        }
        if(srcObject == saveMenuItem){
            JOptionPane.showMessageDialog(this, "You click menu Save");
        }
        if(srcObject == exitMenuItem){
            System.exit(0);
        }
        if(srcObject == redMenuItem){
            nameTextField.setForeground(Color.RED);
            nationalityTextField.setForeground(Color.RED);
            dobTextField.setForeground(Color.RED);
        }
        if(srcObject == greenMenuItem){
            nameTextField.setForeground(Color.green);
            nationalityTextField.setForeground(Color.green);
            dobTextField.setForeground(Color.green);
        }
        if(srcObject == blueMenuItem){
            nameTextField.setForeground(Color.blue);
            nationalityTextField.setForeground(Color.blue);
            dobTextField.setForeground(Color.blue);
        }
        if(srcObject == size16MenuItem){
            noteTextArea.setFont(new Font("Serif", Font.BOLD, 16));
        }
        if(srcObject == size20MenuItem){
            noteTextArea.setFont(new Font("Serif", Font.BOLD, 20));
        }
        if(srcObject == size24MenuItem){
            noteTextArea.setFont(new Font("Serif", Font.BOLD, 24));
        }
    }

    public static void createAndShowGUI() {
        PlayerFormV10 playerForm = new PlayerFormV10();
        playerForm.addComponents();
        playerForm.addMenus();
        playerForm.addListeners();
        playerForm.setFrameFeatures();
    }

    // Main method to run the application for PlayerFormV8
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
