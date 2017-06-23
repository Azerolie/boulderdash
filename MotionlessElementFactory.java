/**
 * <h1>A factory to create MotionlessElements objects.</h1>
 *
 * @author Emma
 * @version 0
 */

public abstract class MotionlessElementFactory {


    private static final Wall     WALL    = new Wall();
    private static final Empty    EMPTY   = new Empty();
    private static final Stone    STONE   = new Stone();
    private static final Mud      MUD     = new Mud();
    private static final Diamond  DIAMOND = new Diamond();

    private static MotionlessElement[]  motionlessElements  = {
        WALL,
        EMPTY,
        STONE,
        MUD,
        DIAMOND, };

    public static MotionlessElement createWall() {
        return WALL;
    }

    public static MotionlessElement createEmpty() {
        return EMPTY;
    }


    public static MotionlessElement createStone() {
        return STONE;
    }


    public static MotionlessElement createMud() {
        return MUD;
    }

    public static MotionlessElement createDiamond() {
        return DIAMOND;
    }

    public static Element getFromFileSymbol(final char fileSymbol) {
        //System.out.println("MotionLessElement - getFromFileSymbol");

        for (final MotionlessElement motionlessElement : motionlessElements) {
            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
                //System.out.println(motionlessElement);
                return motionlessElement;
            }
        }
        return EMPTY;
    }
}
