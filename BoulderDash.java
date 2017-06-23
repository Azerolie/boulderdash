import java.io.IOException;
import javax.swing.JFrame;

/**
 * <h1>The BoulderDash Class.</h1>
 *
 * @author Emma
 * @version 0
 */

public abstract class BoulderDash {

    public static void main(final String[] args) throws IOException {
        System.out.println("Main - Debut");
        final BoulderDashGames boulderDashGames = new BoulderDashGames();

        System.out.println("Main - Appel play");
        boulderDashGames.show();
        //boulderDashGames.play();
    }

}
