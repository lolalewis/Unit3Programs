package Lesson8.Assignments.craps;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Craps {

    private Dice dice1, dice2;
    private int rollnum, point;
    private boolean newGame;

    Craps(Graphics g1, Graphics g2, int size1, int size2) {
        //make 2 dice for 2 panels
        dice1 = new Dice(g1, size1);
        dice2 = new Dice(g2, size2);
        //optional set the color
        dice1.setColor(Color.red, Color.white);
        dice2.setColor(Color.red, Color.white);
        rollnum = 0;
        point = 0;
        newGame = true;

        ImageIcon ii = new ImageIcon("vegas.png");

    }

    public void roll() {
        newGame = false;
        rollnum++;
        dice1.roll();
        dice2.roll();
        if (rollnum == 1) {
            point = getTotal();
        }
        dice1.draw();
        dice2.draw();
    }

    public boolean isNewGame() {
        return newGame;
    }

    public int getTotal() {
        return dice1.getValue() + dice2.getValue();
    }

    public int getPoint() {
        return point;
    }

    public boolean hasWon() {
        if (rollnum == 1) {
            if (point == 7 || point == 11) {
                return true;
            }
        } else {
            if (point == getTotal()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLost() {
        if (rollnum == 1) {
            if (point == 2 || point == 3 || point == 12) {
                return true;
            }
        } else {
            if (getTotal() == 7) {
                return true;
            }
        }
        return false;

    }
}
