import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class IUSmartphone extends JPanel {
    private BufferedImage imagen;
    private Smartphone smart;

    public IUSmartphone(String nombreImagen, Smartphone smart) {
        try {
            imagen = ImageIO.read(new File(nombreImagen));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.smart = smart;

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                if (x >= 10 && x <= 60 && y >= 10 && y <= 60) {
                    System.out.println(smart.toString());
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