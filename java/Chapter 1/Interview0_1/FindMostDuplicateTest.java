package Interview0_1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by SiyuanZeng's on 4/30/2016.
 */
public class FindMostDuplicateTest extends TestCase {

    @Test
    public void testFindMostDuplicate() throws Exception {
        assertEquals(2, FindMostDuplicate.findMostDuplicate(new int[]{1,2,3,4,5,4,2,3,4,2,1,1,2,3,4}));

    }

}