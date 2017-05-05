package Ventanas;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class JpanelImagen extends JPanel{
	private BufferedImage image;

    public JpanelImagen() {
       try {                
          image = ImageIO.read(new File("src/img/Fichas-para-jugar.jpg"));
       } catch (IOException ex) {
            // handle exception...
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        
    	super.paintComponent(g);
        g.drawImage(image, 0, 0,this.getWidth(), this.getHeight(), this); // see javadoc for more info on the parameters            
    }

}

