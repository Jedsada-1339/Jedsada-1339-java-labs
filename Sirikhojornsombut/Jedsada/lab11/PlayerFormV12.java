package sirikhojornsombut.jedsada.lab11;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PlayerFormV12 extends sirikhojornsombut.jedsada.lab10.PlayerFormV11 {

    public PlayerFormV12() {
        super();
        setTitle("Player Form V12");
    }

    @Override
    public void addListeners() {
        super.addListeners();
        nameTextField.setName("Name");
        nationalityTextField.setName("Nationality");
        dobTextField.setName("Date of Birth");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object source = e.getSource();

        if (source == nameTextField) {
            handleTextField(nameTextField, nationalityTextField);
        } else if (source == nationalityTextField) {
            handleTextField(nationalityTextField, dobTextField);
        } else if (source == dobTextField) {
            handleDateTextField(dobTextField);
        }
    }

    protected void handleTextField(JTextField textField, JTextField nextTextField) {
        String text = textField.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter some data in " + textField.getName());
            textField.requestFocusInWindow();
            nextTextField.setEnabled(false);
        }
    }

    protected void handleDateTextField(JTextField textField) {
        String text = textField.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid date in " + textField.getName());
        } else {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate.parse(text, formatter);
                JOptionPane.showMessageDialog(this, textField.getName() + " is changed to " + text);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Please enter a valid date in dd-MM-yyyy");
            }
        }
    }

    public static void createAndShowGUI() {
        PlayerFormV12 playerForm = new PlayerFormV12();
        playerForm.addComponents();
        playerForm.addMenus();
        playerForm.addListeners();
        playerForm.setFrameFeatures();
        playerForm.enableKeyboard();
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
