/**
 * <h1>The Wall Class.</h1>
 *
 * @author Emma
 * @version 0
 */
class Wall extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('-', "img/decors.png",6,1);

    /**
     * Instantiates a new macadam.
     */
    Wall() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
