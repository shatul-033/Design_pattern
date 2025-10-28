import java.io.InputStream;
import java.awt.Image;
import javax.imageio.ImageIO;

public class ResourceLoader {
    public static Image loadImage(String path) throws IOException {
        try (InputStream is = ResourceLoader.class.getResourceAsStream(path)) {
            if (is == null) throw new IOException("Resource not found: " + path);
            return ImageIO.read(is);
        }
    }
}
