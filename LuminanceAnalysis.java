import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;



public class LuminanceAnalysis {

	private double Red;

	private double Green;
	private double Blue;

	private double Value;

	public void main(BufferedImage anImage, double brightness) {
		BufferedImage f = loadImage("image.jpg");
		BufferedImage g = GenerateImages(f);
	}

	protected void initialization() {

	}


	public BufferedImage GenerateImages(BufferedImage Image) {
		BufferedImage newImage = new BufferedImage(Image.getWidth(), Image.getHeight(), Image.getType());
		return newImage;
	}

	public BufferedImage loadImage(String path) {
		BufferedImage Image = null;
		try {
			Image = ImageIO.read(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Image;
	}

}
