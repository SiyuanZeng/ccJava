package Question3_4;

import org.junit.Test;

/**
 * Created by SiyuanZeng's on 4/15/2016.
 */
public class TowerTest {

    @Test
    public void testIndex() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {

    }

    @Test
    public void testMoveTopTo() throws Exception {

    }

    @Test
    public void testPrint() throws Exception {

    }

    @Test
    public void testMoveDisks() throws Exception {

    }

    @Test
    public static void main() {
        // Set up code.
        int n = 5;
        Tower[] towers = new Tower[3];
        for (int i = 0; i < 3; i++) {
            towers[i] = new Tower(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            towers[0].add(i);
        }

        // Copy and paste output into a .XML file and open it with internet explorer.
        //towers[0].print();
        towers[0].moveDisks(n, towers[2], towers[1]);
        //towers[2].print();
    }
}