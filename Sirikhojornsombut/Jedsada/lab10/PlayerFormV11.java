package sirikhojornsombut.jedsada.lab10;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class PlayerFormV11 extends PlayerFormV10 {
    protected JMenuItem customMenuItem;
    protected JFileChooser fileChooser;

    public PlayerFormV11() {
        super();
        setTitle("Player Form V11");
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

        configMenu.add(colorMenu);
        configMenu.add(sizeMenu);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(configMenu);

        setJMenuBar(menuBar);
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        fileChooser = new JFileChooser();


        if (e.getSource() == customMenuItem) {
            Color newColor = JColorChooser.showDialog(this, "Choose Color", customMenuItem.getBackground());
            if (newColor != null) {
                nameTextField.setForeground(newColor);
                nationalityTextField.setForeground(newColor);
                dobTextField.setForeground(newColor);
            }
        }

        if(srcObject == openMenuItem){
            int returnVal = fileChooser.showOpenDialog(this);

            if(returnVal == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(this, "Opening file " + file.getPath());
            }
        }
        if(srcObject == saveMenuItem){
            int returnVal = fileChooser.showSaveDialog(this);

            if(returnVal == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(this, "Saveing file " + file.getPath());
            } 
        }
    }

    public void enableKeyboard() {
        // Set mnemonic keys and accelerator keys
        newMenuItem.setMnemonic(KeyEvent.VK_N);
        openMenuItem.setMnemonic(KeyEvent.VK_O);
        saveMenuItem.setMnemonic(KeyEvent.VK_S);
        exitMenuItem.setMnemonic(KeyEvent.VK_X);

        newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
    }
    

    public void addListeners() {
        super.addListeners();
        customMenuItem.addActionListener(this);
    }

    public static void createAndShowGUI() {
        PlayerFormV11 playerForm = new PlayerFormV11();
        playerForm.addComponents();
        playerForm.addMenus();
        playerForm.addListeners();
        playerForm.setFrameFeatures();
        playerForm.enableKeyboard();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
