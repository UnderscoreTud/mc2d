import me.tud.mc2d.canvas.Canvas;
import me.tud.mc2d.canvas.ConcurrentMemoryRGBCanvas;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

void main() throws IOException {
    Canvas canvas = new ConcurrentMemoryRGBCanvas(256, 240);
    canvas.fillRGB(new Color(118, 118, 255).getRGB());
    BufferedImage image = dump(canvas);
    ImageIO.write(image, "png", new File("output.png"));
}

public BufferedImage dump(Canvas canvas) {
    BufferedImage output = new BufferedImage(canvas.width(), canvas.height(), BufferedImage.TYPE_INT_RGB);
    for (int y = 0; y < canvas.height(); y++) {
        for (int x = 0; x < canvas.width(); x++)
            output.setRGB(x, y, canvas.getRGB(x, y));
    }
    return output;
}
