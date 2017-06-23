import java.util.Observable;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


import java.io.IOException;

/**
 * <h1>The Map Class.</h1>
 *
 * @author Emma
 * @version 0
 */
public class Map extends Observable {

    private int width;
    private int height;
    private Element[][] onTheMap;


    public Map(final String fileName) throws IOException {
        super();
        System.out.println("Map - LoadFile");
        this.loadFile(fileName);
        System.out.println("Map - LoadFile - Fin");
    }


    private void loadFile(final String fileName) throws IOException {
        System.out.println(fileName);
        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String line;
        int y = 0;
        line = buffer.readLine();
        this.setWidth(Integer.parseInt(line));
        System.out.println("width : "+ this.getWidth());
        line = buffer.readLine();
        this.setHeight(Integer.parseInt(line));
        System.out.println("height : "+ this.getHeight());

        this.onTheMap = new Element[this.getWidth()][this.getHeight()];
        while (y<this.getHeight()){
            line = buffer.readLine();
                for (int x = 0; x < line.toCharArray().length; x++) {
                    this.setOnTheMapXY(MotionlessElementFactory.getFromFileSymbol(line.toCharArray()[x]),x,y);
                }
                //System.out.println("\n"); 
            y++;
        }
        buffer.close();
    }

    public final int getWidth() {
        return this.width;
    }


    private void setWidth(final int width) {
        this.width = width;
    }


    public final int getHeight() {
        return this.height;
    }


    private void setHeight(final int height) {
        this.height = height;
    }

    public final void setOnTheMapXY(final Element element, final int x, final int y) {
        this.onTheMap[x][y] = element;
    }

    public final Element getOnTheMapXY(final int x, final int y) {
        return this.onTheMap[x][y];
    }


    public final void setHeroHasChanged() {
        this.setChanged();
        this.notifyObservers(); // Méthodes de la classe observable
    }
}
