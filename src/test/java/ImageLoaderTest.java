import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class ImageLoaderTest {
    @Test
    public void canLoadImage() {
        byte[] image = loadImage();
        System.out.println(image);
    }

    private byte[] loadImage() {
        try {
            File file = new File("/Users/mohamadnachabe/dev/game-library-service/src/main/resources/game1.jpg");
            BufferedImage bImage = ImageIO.read(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ImageIO.write(bImage, "jpg", bos );
            return bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }
}
