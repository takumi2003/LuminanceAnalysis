import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedImage f = ImageIO.read(new File("image.jpg"));
        BufferedImage g = new BufferedImage(f.getWidth(), f.getHeight(), BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < f.getHeight(); y++) {
            for (int x = 0; x < f.getWidth(); x++) {
                Color c = new Color(f.getRGB(x, y));

                float R = c.getRed();
                float G = c.getGreen();
                float B = c.getBlue();

                float V = .299f * R + .587f * G + .114f * B;

                c = new Color(V / 255, V / 255, V / 255);
                g.setRGB(x, y, c.getRGB());
            }
        }

        ImageIO.write(g, "jpg", new File("output.jpg"));
    }
}