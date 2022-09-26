/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author color
 */
public class GradientPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth(), h = getHeight();
        Color color1 = Color.decode("#2681C7");
        Color color2 = Color.decode("#99B4FF");
        GradientPaint gp = new GradientPaint(w, 0, color2, 0, h, color1);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
}