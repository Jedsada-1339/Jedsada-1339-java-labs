package sirikhojornsombut.jedsada.lab11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingUtilities;

public class PlayerFormV14 extends PlayerFormV13 {
    protected JRadioButtonMenuItem yesButton, noButton;

    public PlayerFormV14() {
        super();
        setTitle("Player Form V14");
    }

    protected void addMenus() {
        JMenuBar menuBar = new JMenuBar(); // Create a menu bar

        // Menu "File" with four menu items
        JMenu fileMenu = new JMenu("File");
        ImageIcon newIcon = new ImageIcon("sirikhojornsombut/jedsada/lab8/ICON/New-icon.png");
        newMenuItem = new JMenuItem("New", newIcon);
        ImageIcon openIcon = new ImageIcon("sirikhojornsombut/jedsada/lab8/ICON/Open-icon.png");
        openMenuItem = new JMenuItem("Open", openIcon);
        ImageIcon saveIcon = new ImageIcon("sirikhojornsombut/jedsada/lab8/ICON/Save-icon.png");
        saveMenuItem = new JMenuItem("Save", saveIcon);
        exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        // Menu "Config" with two menu items
        JMenu configMenu = new JMenu("Config");

        JMenu colorMenu = new JMenu("Color");
        redMenuItem = new JMenuItem("Red");
        greenMenuItem = new JMenuItem("Green");
        blueMenuItem = new JMenuItem("Blue");
        customMenuItem = new JMenuItem("Custom");
        colorMenu.add(redMenuItem);
        colorMenu.add(greenMenuItem);
        colorMenu.add(blueMenuItem);
        colorMenu.add(customMenuItem);

        JMenu sizeMenu = new JMenu("Size"); // Corrected: Changed to JMenu
        size16MenuItem = new JMenuItem("16");
        size20MenuItem = new JMenuItem("20");
        size24MenuItem = new JMenuItem("24");
        sizeMenu.add(size16MenuItem);
        sizeMenu.add(size20MenuItem);
        sizeMenu.add(size24MenuItem);

        JMenu fillMenu = new JMenu("Fill");
        yesButton = new JRadioButtonMenuItem("Yes");
        noButton = new JRadioButtonMenuItem("No");
        fillMenu.add(yesButton);
        fillMenu.add(noButton);
        noButton.setSelected(true);

        configMenu.add(colorMenu);
        configMenu.add(sizeMenu);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        menuBar.add(fillMenu);

        setJMenuBar(menuBar);
    }

    @Override
    public void savePlayerDataToFile() {
        int returnVal = fileChooser.showSaveDialog(this);

        if (noButton.isSelected() == true) {
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    // Write player data in the same format as shown in the dialog
                    writer.write(nameTextField.getText() + " has nationality as " + nationalityTextField.getText()
                            + " and was born on " + dobTextField.getText()
                            + ", has gender as " + gender + " ,is a " + typesCombo.getSelectedItem()
                            + " player, has hobbies as " + hobbies + " and plays "
                            + sportsList.getSelectedValuesList());
                    JOptionPane.showMessageDialog(this, "Player data saved to " + file.getPath());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (yesButton.isSelected() == true) {
            Player player = new Player(nameTextField.getText(), nationalityTextField.getText());
            player.setDob(dobTextField.getText());
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                    oos.writeObject(player);
                    JOptionPane.showMessageDialog(this, "Saving in file " + file.getPath());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    @Override
    public void openPlayerDataFromFile() {
        int returnVal = fileChooser.showOpenDialog(this);

        if (noButton.isSelected() == true) {
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
                    JOptionPane.showMessageDialog(this, "Player data read from file:" + file.getPath() + "\n" + data);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (yesButton.isSelected() == true) {
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                    Player player = (Player) ois.readObject();
                    // Fill the form with the attributes of the player object
                    nameTextField.setText(player.getName());
                    nationalityTextField.setText(player.getNationality());
                    dobTextField.setText(player.getDob());
                    // Set other form fields similarly
                    JOptionPane.showMessageDialog(this, "Open file " + file.getPath());
                } catch (IOException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void createAndShowGUI() {
        PlayerFormV14 playerForm = new PlayerFormV14(); // Create an instance of PlayerFormV13
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
