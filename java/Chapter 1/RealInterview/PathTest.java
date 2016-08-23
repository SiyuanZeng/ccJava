package RealInterview;

import org.junit.Test;

/**
 * Created by SiyuanZeng's on 5/10/2016.
 */
public class PathTest {

    @Test
    public void testCd() throws Exception {
        Path path = new Path("/a/b/c/d");
        System.out.println(path.cd("../x").getPath());
        System.out.println(path.cd("/a/b/c/f").getPath());
        System.out.println(path.cd("/%^&*&^").getPath());
        System.out.println(path.cd("").getPath());
        System.out.println(path.cd(null).getPath());
        System.out.println(path.cd(null).getPath());
    }
}