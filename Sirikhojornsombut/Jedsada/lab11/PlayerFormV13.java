package sirikhojornsombut.jedsada.lab11;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PlayerFormV13 extends PlayerFormV12 {
    // Constructor for PlayerFormV13
    public PlayerFormV13() {
        super();
        setTitle("Player Form V13");
    }

    // Override method for handling actionPerformed events
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e); // Call the method from the superclass
        fileChooser = new JFileChooser();

        // Check if the openMenuItem was clicked
        if (srcObject == openMenuItem) {
            openPlayerDataFromFile();
        }

        // Check if the saveMenuItem was clicked
        if (srcObject == saveMenuItem) {
            savePlayerDataToFile();
        }

        if(maleRadioButton.isSelected() == true){
            gender = "male";
        } else {
            gender = "female";
        }

        // Use StringBuilder to build a string of selected hobbies
        StringBuilder hobbies = new StringBuilder();
        if (readingCheckbox.isSelected()) {
            hobbies.append(readingCheckbox.getText()).append(" ");
        }

        if (browsingCheckbox.isSelected()) {
            hobbies.append(browsingCheckbox.getText()).append(" ");
        }

        if (sleepingCheckbox.isSelected()) {
            hobbies.append(sleepingCheckbox.getText()).append(" ");
        }

        if (travelingCheckbox.isSelected()) {
            hobbies.append(travelingCheckbox.getText()).append(" ");
        }

    }

    // Method to save player data to a file
    @Override
    public void savePlayerDataToFile() {
        int returnVal = fileChooser.showSaveDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                // Write player data in the same format as shown in the dialog
                writer.write(nameTextField.getText()+" has nationality as "+ nationalityTextField.getText() +" and was born on "+ dobTextField.getText()
                + ", has gender as " + gender +" ,is a "+typesCombo.getSelectedItem() +" player, has hobbies as "+hobbies+" and plays "+sportsList.getSelectedValuesList());
                JOptionPane.showMessageDialog(this, "Player data saved to " + file.getPath());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Method to open player data from a file
    @Override
    public void openPlayerDataFromFile() {
        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                // Read player data and display in a message dialog
                String data = "";
                String line;
                while ((line = reader.readLine()) != null) {
                    data += line + "\n";
                }
                JOptionPane.showMessageDialog(this, "Opening file " + file.getPath());
                JOptionPane.showMessageDialog(this, "Player data read from file: " + file.getName() + "\n" + data);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Static method to create and show the GUI for PlayerFormV13
    public static void createAndShowGUI() {
        PlayerFormV13 playerForm = new PlayerFormV13(); // Create an instance of PlayerFormV13
        playerForm.addComponents(); // Add components to the frame
        playerForm.addMenus(); // Add menus to the frame
        playerForm.addListeners(); // Add listeners to the frame
        playerForm.setFrameFeatures(); // Set features for the frame
        playerForm.enableKeyboard(); // Enable keyboard shortcuts
    }

    // Main method to run the application for PlayerFormV13
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); // Create and show the GUI on the Event Dispatch Thread
            }
        });
    }
}
