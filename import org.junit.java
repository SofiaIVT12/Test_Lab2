import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test1() {
        Main main = new Main();
        main.Init(1,2,3,4);
        int actual = main.Testi();
        int expected = 1;
        assertEquals(expected,actual);

    }
    @Test
    public void test2() {
        Main main = new Main();
        main.Init(1,2,3,3);
        int actual = main.Testi();
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void test3() {
        Main main = new Main();
        main.Init(1,2,3,-1);
        int actual = main.Testi();
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    public void test4() {
        Main main = new Main();
        main.Init1();
        assertEquals(0,main.x);
        assertEquals(0,main.y);
        assertEquals(0,main.xR);
        assertEquals(0,main.yR);
    }

    @Test
    public void test5() {
        Main main = new Main();
        main.Init(1,2,3,3);
        main.Testi2();
        assertEquals(5,main.S);
    }

    @Test
    public void test6() {
        Main main = new Main();
        main.VIVOD();
        assertEquals("Площадь эллипса = 0",main.s);
    }

    @Test
    public void test7() {
        Main main = new Main();
        main.Init(1,2,3,4);
        assertEquals(1,main.x);
        assertEquals(2,main.y);
        assertEquals(3,main.xR);
        assertEquals(4,main.yR);
    }

    @Test
    public void test8() {
        Main main = new Main();
        main.A=10;
        main.B=1;
        assertEquals(1,main.Which_Bigger());
    }

    @Test
    public void test9() {
        Main main = new Main();
        main.A=10;
        main.B=10;
        assertEquals(2,main.Which_Bigger());
    }

    @Test
    public void test10() {
        Main main = new Main();
        main.A=1;
        main.B=10;
        assertEquals(3,main.Which_Bigger());
    }

}
