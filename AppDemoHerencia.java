import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class AppDemoHerencia {
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
                Computadora computadora = new Computadora("Hewlett-Packard Company", "1980", "HP", "PC", 1200,
                new Procesador("Intel Core i5", "15075", "Intel Corp", "Procesador", 8192, 5500000000L), 8);
                IUComputadora iuC1 = new IUComputadora("compu.png", computadora);

                Television tv1 = new Television("LG", "4500", "EVO", "TV", 3800.00f,
                new Pantalla("LG", "4500", "EVO", "Oled", 3840, 2160));
                IUTelevision tele = new IUTelevision("tele.png", tv1);

                Smartphone smartphone1 = new Smartphone("Samsung", "42050", "GalaxyA70", "Smartphone", 899.000f,
                new Sensor("Sensor395", "R503", "ModeloTAP", "Huella", "TipoDactilar", "cm", 30),
                new Pantalla("Samsung", "4955", "GalaxyS20", "Pantalla", 1080, 2040));
                IUSmartphone smartphone = new IUSmartphone("smart.png", smartphone1);

                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 400);

                frame.setLayout(new FlowLayout());
                frame.add(iuC1);
                frame.add(tele);
                frame.add(smartphone);
                frame.setVisible(true);
             
        });
    }
}
