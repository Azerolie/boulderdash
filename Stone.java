/**
 * <h1>The Stone Class.</h1>
 *
 * @author Emma
 * @version 0
 */
class Stone extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('X', "img/decors.png",3,1);

    /**
     * Instantiates a new macadam.
     */
    Stone() {
        super(SPRITE, Permeability.PUSHABLE);
    }
}
