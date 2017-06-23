/**
 * <h1>The Mud Class.</h1>
 *
 * @author Emma
 * @version 0
 */
class Mud extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('*', "img/decors.png",1,0);

    /**
     * Instantiates a new macadam.
     */
    Mud() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
