package sirikhojornsombut.jedsada.lab11;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

// PlayerFormV12 extends PlayerFormV11 and adds some additional functionality
public class PlayerFormV12 extends sirikhojornsombut.jedsada.lab10.PlayerFormV11 {

    // Constructor for PlayerFormV12
    public PlayerFormV12() {
        super();  // Call the constructor of the superclass (PlayerFormV11)
        setTitle("Player Form V12");  // Set the title for the form
    }

    // Method to add listeners to components
    @Override
    public void addListeners() {
        super.addListeners();  // Call the addListeners method of the superclass
        nameTextField.setName("Name");  // Set the name for the nameTextField
        nationalityTextField.setName("Nationality");  // Set the name for the nationalityTextField
        dobTextField.setName("Date of Birth");  // Set the name for the dobTextField
    }

    // Method to handle actions performed (e.g., button clicks)
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);  // Call the actionPerformed method of the superclass
        Object source = e.getSource();  // Get the source of the action event

        // Check which component triggered the action
        if (source == nameTextField) {
            handleTextField(nameTextField, nationalityTextField);
        } else if (source == nationalityTextField) {
            handleTextField(nationalityTextField, dobTextField);
        } else if (source == dobTextField) {
            handleDateTextField(dobTextField);
        }
    }

    // Method to handle text fields validation
    protected void handleTextField(JTextField textField, JTextField nextTextField) {
        String text = textField.getText().trim();  // Get the trimmed text from the text field
        if (text.isEmpty()) {
            // Display a message if the text is empty
            JOptionPane.showMessageDialog(this, "Please enter some data in " + textField.getName());
            textField.requestFocusInWindow();  // Set focus to the current text field
            nextTextField.setEnabled(false);  // Disable the next text field
        } else {
            nextTextField.setEnabled(true);  // Enable the next text field if the text is not empty
        }
    }

    // Method to handle date text field validation
    protected void handleDateTextField(JTextField textField) {
        String text = textField.getText().trim();  // Get the trimmed text from the date text field
        if (text.isEmpty()) {
            // Display a message if the date is empty
            JOptionPane.showMessageDialog(this, "Please enter a valid date in " + textField.getName());
        } else {
            try {
                // Parse the date using a specified date format
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate.parse(text, formatter);
                JOptionPane.showMessageDialog(this, textField.getName() + " is changed to " + text);
            } catch (DateTimeParseException e) {
                // Display a message if the date format is invalid
                JOptionPane.showMessageDialog(this, "Please enter a valid date in " + textField.getName());
            }
        }
    }

    // Method to create and show the GUI
    public static void createAndShowGUI() {
        PlayerFormV12 playerForm = new PlayerFormV12();
        playerForm.addComponents();
        playerForm.addMenus();
        playerForm.addListeners();
        playerForm.setFrameFeatures();
        playerForm.enableKeyboard();
    }

    // Main method to run the application
    public static void main(String[] args) {
        createAndShowGUI();
    }
}
