import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
//Warren jaftha
class JodyTest {
    public Jody test1;
    public Jody test2;
    public Jody test3;
    @BeforeEach
    public void setUp() {
        test1 = new Jody();
        test1.setA(18);
        test1.setB(6);

        test2 = new Jody();
        test2.setA(6);
        test2.setB(18);

        test3 = test2;
    }

    @AfterEach
    public void tearDown(){
    }

    /**
     * Test of Object Equality, Object Identity, Test fail, Test timeout, Test Disabling
     */

    //Testing Object Equality
    @Test
    public void testEquality(){
        assertEquals(test1.getA(), test2.getB());
    }

    //Testing Object Identity
    @Test
    public void testIdentity(){
        assertSame(test2, test3);
    }

    //Test fail, this is meant for the test to fail
    @Test
    public void testFail(){
        fail("Failing on purpose");
        assertEquals(test1.getA(), test2.getB());
    }

    //Test timeout, this is supposed to error
    @Test
    @Timeout(10)
    public void testTimeOut()throws InterruptedException {
        while (true) {
            Thread.sleep(300);
        }
    }

    //Test disabling, this is meant to skip the test
    @Test
    @Disabled("Purposely disabling this test")
    public void testDisable() {
    }

}