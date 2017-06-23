/**
 * <h1>The Element Class.</h1>
 *
 * @author Emma
 * @version 0
 */

public abstract class Element {

    /** The sprite. */
    private Sprite sprite;

    /** The permeability. */
    private Permeability permeability;

    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }

    public final Sprite getSprite() {
        return this.sprite;
    }


    private void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }

    public final Permeability getPermeability() {
        return this.permeability;
    }


    private void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }

}
