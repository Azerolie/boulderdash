/**
 * <h1>The Diamond Class.</h1>
 *
 * @author Emma
 * @version 0
 */
class Diamond extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('D', "img/decors.png",4,1);

    /**
     * Instantiates a new macadam.
     */
    Diamond() {
        super(SPRITE, Permeability.PICKING);
    }
}
