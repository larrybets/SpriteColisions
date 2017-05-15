package cat.flx.sprite;

/**
 * Created by DAM on 15/5/17.
 */

public class Bomba extends Character {

    private static int[][] states = {
            { 41,41,41,41,41,41}
    };

    int[][] getStates() { return states; }

    int x1, x2, dir;

    Bomba(Game game) {
        super(game);
        padLeft = padTop = 6;
        colWidth = 20; colHeight = 16;
        dir = 1;
    }

    void physics() {
        y++;
    }
}
