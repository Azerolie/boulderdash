
/**
 * <h1>The Mobile Class.</h1>
 *
 * @author Emma
 * @version 0
 */
abstract class Mobile extends Element {

    private int   x;
    private int   y;
    private Boolean alive = true;
    private Map    map;


    Mobile(final Sprite sprite, final Map map, final Permeability permeability) {
        super(sprite, permeability);
        this.setMap(map);
    }

    Mobile(final int x, final int y, final Sprite sprite, final Map map, final Permeability permeability) {
        this(sprite, map, permeability);
        this.setX(x);
        this.setY(y);
        System.out.println("Mobile - Constructeur complet");
    }

    public void moveUp() {
        this.setY(this.getY() + 1);
    }

    public void moveLeft() {
        this.setX(this.getX() - 1);
    }

    public void moveDown() {
        this.setY(this.getY() - 1);
    }

    public void moveRight() {
        this.setX(this.getX() + 1);
    }


    public final int getX() {
        return this.x;
    }


    public final void setX(final int x) {
        this.x = x;
        if (this.isDead()) {
            this.die();
        }
    }

    public final int getY() {
        return this.y;
    }


    public final void setY(final int y) {
        this.y = y ;
        if (this.isDead()) {
            this.die();
        }
    }

    public Map getMap() {
        return this.map;
    }

    private void setMap(final Map map) {
        this.map = map;
    }


    public Boolean isAlive() {
        return this.alive;
    }


    private void die() {
        this.alive = false;
    }


    private Boolean isDead() {
        return false;
    }

}
