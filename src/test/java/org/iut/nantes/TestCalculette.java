package org.iut.nantes;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculette {
    Calculette c=new Calculette();

    @Test
    public void test1() {
        assertEquals(3,c.Addition(1,2));
        assertEquals(0,c.Addition(0,0));
        assertEquals(1500,c.Addition(1000,500));
    }
    @Test
    public void test2() {
        assertEquals(-3,c.Addition(-1,-2));
        assertEquals(0,c.Addition(-0,-0));
        assertEquals(-1500,c.Addition(-1000,-500));
    }
    @Test
    public void test3() {
        assertEquals(-1,c.Addition(1,-2));
        assertEquals(-500,c.Addition(-1000,500));
    }
}
