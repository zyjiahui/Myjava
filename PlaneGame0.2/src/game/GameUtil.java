package game;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class GameUtil {
    // 工具类最好将构造器私有化。
    private GameUtil() {

    }

    public static Image getImage(String path) {
        BufferedImage bi = null;
        //URL u = GameUtil.class.getClassLoader().getResource(path);
        try {

            bi = ImageIO.read(GameUtil.class.getClassLoader().getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bi;
    }
}