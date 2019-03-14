
package Proxy3;

import java.awt.*;
import javax.swing.*;


public class ImageComponent extends JComponent
{
    static final long serialVersionUID=1L;
    Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800-w)/2;
        int y = (600-h)/2;
        icon.paintIcon(this, g, x, y);
    }

    
}
