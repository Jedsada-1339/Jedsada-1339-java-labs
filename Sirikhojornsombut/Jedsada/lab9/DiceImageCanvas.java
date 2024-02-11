package sirikhojornsombut.jedsada.lab9;

import javax.swing.*;
import java.awt.*;

public class DiceImageCanvas extends JPanel {

    private int numberOfDots;

    public DiceImageCanvas(int numberOfDots) {
        this.numberOfDots = numberOfDots;
    }

    public void setNumberOfDots(int numberOfDots) {
        this.numberOfDots = numberOfDots;
        repaint(); // Request a repaint to update the displayed dots
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Get the center of the panel
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Draw the dice border in white
        g.setColor(Color.WHITE);
        g.fillRect(centerX - 75, centerY - 75, 150, 150);

        // Draw the dice border in black
        g.setColor(Color.BLACK);
        g.drawRect(centerX - 75, centerY - 75, 150, 150);

        // Draw dots based on the number of dots
        g.setColor(Color.RED); // Set the color to red for the dots

        switch (numberOfDots) {
            case 1:
                drawCenteredDot(g, centerX, centerY);
                break;
            case 2:
                drawCenteredDot(g, centerX - 30, centerY - 30);
                drawCenteredDot(g, centerX + 30, centerY + 30);
                break;
            case 3:
                drawCenteredDot(g, centerX - 30, centerY - 30);
                drawCenteredDot(g, centerX, centerY);
                drawCenteredDot(g, centerX + 30, centerY + 30);
                break;
            case 4:
                drawCenteredDot(g, centerX - 30, centerY - 30);
                drawCenteredDot(g, centerX + 30, centerY - 30);
                drawCenteredDot(g, centerX - 30, centerY + 30);
                drawCenteredDot(g, centerX + 30, centerY + 30);
                break;
            case 5:
                drawCenteredDot(g, centerX - 30, centerY - 30);
                drawCenteredDot(g, centerX + 30, centerY - 30);
                drawCenteredDot(g, centerX, centerY);
                drawCenteredDot(g, centerX - 30, centerY + 30);
                drawCenteredDot(g, centerX + 30, centerY + 30);
                break;
            case 6:
                drawCenteredDot(g, centerX - 30, centerY - 30);
                drawCenteredDot(g, centerX + 30, centerY - 30);
                drawCenteredDot(g, centerX - 30, centerY);
                drawCenteredDot(g, centerX + 30, centerY);
                drawCenteredDot(g, centerX - 30, centerY + 30);
                drawCenteredDot(g, centerX + 30, centerY + 30);
                break;
            default:
                break;
        }
    }

    private void drawCenteredDot(Graphics g, int x, int y) {
        final int DOT_SIZE = 30;
        g.fillOval(x - DOT_SIZE / 2, y - DOT_SIZE / 2, DOT_SIZE, DOT_SIZE);
    }
}
