import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

class IUTelevision extends JPanel {
    private BufferedImage imagen;
    private Television television;

    public IUTelevision(String nombreImagen, Television television) {
        try {
            imagen = ImageIO.read(new File(nombreImagen)); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.television = television;

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                
                if (x >= 10 && x <= 60 && y >= 10 && y <= 60) {
                    System.out.println(television.toString());
                }
            }
        });
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(80, 80); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 10, 10, 60, 60, this);
    }
}