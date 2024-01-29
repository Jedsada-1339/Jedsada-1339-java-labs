package sirikhojornsombut.jedsada.lab8;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PlayerFormV5 extends PlayerFormV4 {
    public PlayerFormV5() {
        setTitle("Player Form V4"); // Set the title for PlayerFormV4
    }

    // Override addComponents to add new components to the frame
    protected void addComponents() {
        super.addComponents(); // Call the addComponents method from the parent class

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(topPanel);
        mainPanel.add(hobbiesPanel);
        mainPanel.add(sportPanel);
        mainPanel.add(experiencePanel);
        mainPanel.add(centerPanel);
        mainPanel.add(buttonPanel);
        add(mainPanel);

    }

    protected void addMenus() {
        JMenuBar menuBar = new JMenuBar(); // Create a menu bar

        // Menu "File" with four menu items
        JMenu fileMenu = new JMenu("File");
        ImageIcon newIcon = new ImageIcon("sirikhojornsombut/jedsada/lab8/ICON/New-icon.png");
        JMenuItem newMenuItem = new JMenuItem("New",newIcon);
        ImageIcon openIcon = new ImageIcon("sirikhojornsombut/jedsada/lab8/ICON/Open-icon.png");
        JMenuItem openMenuItem = new JMenuItem("Open",openIcon);
        ImageIcon saveIcon = new ImageIcon("sirikhojornsombut/jedsada/lab8/ICON/Save-icon.png");
        JMenuItem saveMenuItem = new JMenuItem("Save",saveIcon);
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        // Menu "Config" with two menu items
        JMenu configMenu = new JMenu("Config");
        
        JMenu colorMenu = new JMenu("Color");
        JMenuItem redMenuItem = new JMenuItem("Red");
        JMenuItem greenMenuItem = new JMenuItem("Green");
        JMenuItem blueMenuItem = new JMenuItem("Blue");
        colorMenu.add(redMenuItem);
        colorMenu.add(greenMenuItem);
        colorMenu.add(blueMenuItem);

        JMenuItem sizeMenu = new JMenu("Size");
        JMenuItem size16MenuItem = new JMenuItem("16");
        JMenuItem size20MenuItem = new JMenuItem("20");
        JMenuItem size24MenuItem = new JMenuItem("24");
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

    // Static method to create and show the GUI for PlayerFormV4
    public static void createAndShowGUI() {
        PlayerFormV5 playerForm = new PlayerFormV5();
        playerForm.addComponents();
        playerForm.addMenus();
        playerForm.setFrameFeatures();
    }

    // Main method to run the application for PlayerFormV4
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
