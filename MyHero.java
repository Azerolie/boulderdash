/**
 * <h1>The MyHero Class.</h1>
 *
 * @author Emma
 * @version 0
 */
public class MyHero extends Mobile {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('H',"img/personnages_bgblack.png",0,0);
    private int nbDiamond = 0;

    public MyHero(final int x, final int y, final Map map) {
        super(x, y, SPRITE, map, Permeability.BLOCKING);
        System.out.println("MyHero - Constructeur");
    }

    public final int getNbDiamond()
    {
    	return this.nbDiamond;
    }

    public void setNbDiamond(int nb)
    {
    	this.nbDiamond += nb;
    	if (this.nbDiamond == 10)
    	{
    		System.out.println("Vous avez trouve 10 diamands !");
    	}
    }
}
