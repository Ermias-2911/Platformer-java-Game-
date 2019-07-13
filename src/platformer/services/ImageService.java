package platformer.services;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

import platformer.Application;
import java.net.URL;

// Simply manage images 
public class ImageService {
	// Cache the image, so it can load it faster
	Map<String, BufferedImage> cache = new HashMap<>();

	public BufferedImage getImage(String filename) {
		if (cache.containsKey(filename))
			return cache.get(filename);

		try {
			java.net.URL url = platformer.Application.class.getResource("/"+filename);
			BufferedImage img = ImageIO.read(url);
			cache.put(filename, img);
			return img;
		} catch (IOException e) {
			System.out.println("File not found: " + filename);
			System.out.println("Exception is: " + e);
		}

		return null;
	}
}
