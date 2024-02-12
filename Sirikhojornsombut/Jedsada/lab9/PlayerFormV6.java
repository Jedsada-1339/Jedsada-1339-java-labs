package sirikhojornsombut.jedsada.lab9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class PlayerFormV6 extends sirikhojornsombut.jedsada.lab8.PlayerFormV5 implements ActionListener {
    static String gender;
    public PlayerFormV6() {
        setTitle("Player Form V6"); // Set the title for PlayerFormV4
    }

    public void addListeners(){
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object srcObject = e.getSource();
        if(maleRadioButton.isSelected() == true){
            gender = "male";
        }else{
            gender = "female";
        }
        if (srcObject == submitButton) {
            JOptionPane.showMessageDialog(this, nameTextField.getText()+" has nationality as "+ nationalityTextField.getText() +" and was born on "+ dobTextField.getText()
            + ", has gender as " + gender +" ,is a "+typesCombo.getSelectedItem() +" player, has hobbies as ");
        }else if (srcObject == resetButton){
            nameTextField.setText("");
            nationalityTextField.setText("");
            dobTextField.setText("");
        }
    }
    

    // Override addComponents to add new components to the frame
    protected void addComponents() {
        super.addComponents(); // Call the addComponents method from the parent class
    }

    protected void addMenus(){
        super.addMenus();
    }
    
    public static void createAndShowGUI() {
        PlayerFormV6 playerForm = new PlayerFormV6();
        playerForm.addComponents();
        playerForm.addMenus();
        playerForm.addListeners();
        playerForm.setFrameFeatures();
    }

    // Main method to run the application for PlayerFormV5
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
