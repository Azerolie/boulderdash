import java.io.IOException;

/**
 * <h1>The BoulderDashGames Class.</h1>
 *
 * @author Emma
 * @version 0
 */

public class BoulderDashGames {

    private static final int keyRight = 51;
    private static final int keyLeft = 49;
    private static final int keyUp = 38;
    private static final int keyDown = 40;

    private Map map;
    private MyHero myHero;
    BoardFrame boardFrame;

    private static final int startX = 0;
    private static final int startY = 1;

    public BoulderDashGames() throws IOException {
    	this.setMap(new Map("map.txt"));
    	System.out.println("Construction Hero");
        this.setMyHero(new MyHero(this.getStartX(), this.getStartY(), this.getMap()));
        this.getMyHero().getSprite().loadImage();
        this.getMap().setHeroHasChanged();
    }

    public final void show()  throws IOException {
    	//f = new Fenetre(this.getMap());   
    	boardFrame = new BoardFrame("BoulderDash",true); 

    }

    public final void play() throws IOException{
    	System.out.println("Play function");
    }

    public final Map getMap() {
        return this.map;
    }

     private void setMap(final Map map) throws IOException {
        this.map = map;
        for (int x = 0; x < this.getMap().getWidth(); x++) {
            for (int y = 0; y < this.getMap().getHeight(); y++) {
                this.getMap().getOnTheMapXY(x, y).getSprite().loadImage();
            }
        } 
    }

    public final MyHero getMyHero() {
        return this.myHero;
    }

    public void setMyHero(final MyHero myHero) {
        this.myHero = myHero;
    }

    public final int getStartX() {
        return this.startX;
    }


    public final int getStartY() {
        return this.startY;
    }

}
