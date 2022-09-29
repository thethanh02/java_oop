package main;

import inputs.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    
    public GamePanel() {
        addKeyListener(new KeyboardInputs());
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(100, 100, 200, 200);
//        g.setColor(Color.red);
//        g.drawLine(0, 0, 5, 5);
    }
    
}
