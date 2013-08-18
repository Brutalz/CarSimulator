package org.brutalz.physical_engine;

import org.junit.*;

import static org.junit.Assert.*;

public class Vector3dTest {
    @Test
    public void testVectorAddition() {
        Vector3d vector1 = new Vector3d(1.0, 2.0, 4.0);
        Vector3d vector2 = new Vector3d(0.0, -1.0, 5.0);
        vector1.add(vector2);
        assertTrue(new Vector3d(1.0, 1.0, 9.0).equals(vector1));
    }

    @Test
    public void testVectorMultiplicationByNumber() {
        Vector3d vector = new Vector3d(0.0, -1.0, 2.0);
        double alpha = 5.0;
        vector.multiply(alpha);
        assertTrue(new Vector3d(0.0, -5.0, 10.0).equals(vector));
    }
}
