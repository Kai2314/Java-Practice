package ImageProcess;

import org.json.JSONObject;
import org.magiclen.magicimage.ImageBuffer;
import org.magiclen.magicimage.ImageExport;
import org.magiclen.magicimage.ImageMetadata;

import java.awt.image.BufferedImage;
import java.io.File;

/**
 * https://magiclen.org/magicimage/      有bug
 */
public class MagicImageTest {   //"D:\\Olsen\\ohhh.jpg"
    public static void main(String[] args) {
        final File imageFile = new File("D:\\Olsen\\ohhh.jpg");
        final BufferedImage bi = ImageBuffer.getBufferedImages(imageFile)[0];
        System.out.println(ImageExport.exportToJPEG(bi, imageFile, 0.8f, true));
    }
}
