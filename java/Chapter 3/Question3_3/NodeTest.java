package Question3_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/14/2016.
 */
public class NodeTest {
    @Test
    public void getLastStack1() throws Exception {
        Node node = new Node(4);
        assertEquals(4, node.value);
    }
}