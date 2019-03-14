package Proxy3;

import java.awt.*;
import java.net.*;
import javax.swing.*;

public class ImageProxy  implements Icon
{
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageURL) {    this.imageURL = imageURL; }
       
    @Override
    public int getIconWidth() 
    {
       if(imageIcon!=null) return imageIcon.getIconWidth();
       else return 800;
    }

    @Override
    public int getIconHeight() {
        if(imageIcon!=null) return imageIcon.getIconHeight();
       else return 600;
    }

    synchronized void setImageIcon(ImageIcon imageIcon) 
    {
        this.imageIcon = imageIcon; 
    }
    
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) 
    {
        if(imageIcon!=null) imageIcon.paintIcon(c, g, x, y);
        else
        {
            g.drawString("Loading cd cover, p.w. ...", x+300, y+190);
            if(!retrieving)
            {
                retrieving=true;
                retrievalThread = new Thread( () ->
                    {
                        try
                        {
                            setImageIcon( new ImageIcon(imageURL,"CD cover") );
                            c.repaint();
                        }
                        catch(Exception e) { e.printStackTrace(); }
                    }
                );
                retrievalThread.start();
            }
        }        
    }
}
