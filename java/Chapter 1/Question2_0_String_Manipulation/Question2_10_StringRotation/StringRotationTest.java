package Question2_0_String_Manipulation.Question2_10_StringRotation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/21/2016.
 */
public class StringRotationTest {
    @Test
    public void isRotation1() throws Exception {
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        assertEquals(true, StringRotation.isRotation(s1, s2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isRotationWithNullString2() throws Exception {
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        StringRotation.isRotation(s1, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isRotationWithEmptyString3() throws Exception {
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "";
        StringRotation.isRotation(s1, s2);
    }
}