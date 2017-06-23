/**
 * <h1>The Empty Class.</h1>
 *
 * @author Emma
 * @version 0
 */
class Empty extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite(' ', "img/decors.png",0,1);

    /**
     * Instantiates a new macadam.
     */
    Empty() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
