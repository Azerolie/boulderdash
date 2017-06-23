import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.io.BufferedReader;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * <h1>The Sprite Class.</h1>
 *
 * @author Emma
 * @version 0
 */
public class Sprite {


    private Image   image;
    private String  imageName;
    private char    consoleImage;
    private boolean imageLoaded;

    private int coordX;
    private int coordY;

    final int width = 16;
    final int height = 16;

    public Sprite(final char character, final String imageName, final int coordX, final int coordY) { 
        this.setConsoleImage(character);
        this.setImageName(imageName);
        this.setCoordX(coordX);
        this.setCoordY(coordY);
        //this.loadImage();
    }

    public Sprite(final char character, final String imageName) {
        this.setConsoleImage(character);
        this.setImageName(imageName);
    }
    public Sprite(final char character) {
        this(character, "noimage.jpg");
    }

    public final Image getImage() {
        return this.image;
    }

    public final void loadImage() throws IOException  {
        BufferedImage bigImg = ImageIO.read(new File(this.getImageName()));
        this.setImage(bigImg.getSubimage(this.getCoordX() * this.width,this.getCoordY() * this.height,this.width,this.height));
    }

    public final char getConsoleImage() {
        return this.consoleImage;
    }

    private void setImage(final Image image) {
        this.image = image;
    }

    private void setConsoleImage(final char consoleImage) {
        this.consoleImage = consoleImage;
    }

    public final String getImageName() {
        return this.imageName;
    }


    private void setImageName(final String imageName) {
        this.imageName = imageName;
    }

    public final boolean isImageLoaded() {
        return this.imageLoaded;
    }

    public final void setImageLoaded(final boolean isImageLoaded) {
        this.imageLoaded = isImageLoaded;
    }

    public final int getCoordX() {
        return this.coordX;
    }

    public final void setCoordX(int x) {
        this.coordX = x;
    }

    public final int getCoordY() {
        return this.coordY;
    }

    public final void setCoordY(int y) {
        this.coordY = y;
    }

}
