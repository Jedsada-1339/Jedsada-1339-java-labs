package sirikhojornsombut.jedsada.lab8; //sirikhojornsombut.jedsada.lab7.PlayerFormV2

import javax.swing.*;

public class PlayerFormV3 extends sirikhojornsombut.jedsada.lab7.PlayerFormV2 {
    protected JMenuItem newMenuItem,openMenuItem,saveMenuItem,exitMenuItem;
    protected JMenuItem redMenuItem,greenMenuItem,blueMenuItem;
    protected JMenuItem size16MenuItem,size20MenuItem,size24MenuItem;
    JMenuBar menuBar;
    JMenu colorMenu;

    // Constructor for PlayerFormV3
    public PlayerFormV3() {
        setTitle("Player Form V3"); // Set the title for PlayerFormV3
    }

    // Override addMenus to add menu bar with specified menus
    protected void addMenus() {
        menuBar = new JMenuBar(); // Create a menu bar

        // Menu "File" with four menu items
        JMenu fileMenu = new JMenu("File");
        newMenuItem = new JMenuItem("New");
        openMenuItem = new JMenuItem("Open");
        saveMenuItem = new JMenuItem("Save");
        exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        // Menu "Config" with two menu items
        JMenu configMenu = new JMenu("Config");
        
        colorMenu = new JMenu("Color");
        redMenuItem = new JMenuItem("Red");
        greenMenuItem = new JMenuItem("Green");
        blueMenuItem = new JMenuItem("Blue");
        colorMenu.add(redMenuItem);
        colorMenu.add(greenMenuItem);
        colorMenu.add(blueMenuItem);

        JMenuItem sizeMenu = new JMenu("Size");
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

        // Set the menu bar for the frame
        setJMenuBar(menuBar);
    }

    // Static method to create and show the GUI for PlayerFormV3
    public static void createAndShowGUI() {
        PlayerFormV3 playerForm = new PlayerFormV3();
        playerForm.addComponents();
        playerForm.addMenus(); // Add the menu bar
        playerForm.setFrameFeatures();
    }

    // Main method to run the application for PlayerFormV3
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
