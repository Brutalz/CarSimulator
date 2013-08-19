package org.brutalz.physical_engine;

import org.junit.*;

import static org.junit.Assert.*;

public class Vector3dTest {
    @Test
    public void testVectorAddition() {
        Vector3d vector1 = new Vector3d(1.0, 2.0, 4.0);
        Vector3d vector2 = new Vector3d(0.0, -1.0, 5.0);
        Vector3d result = vector1.add(vector2);
        assertTrue(new Vector3d(1.0, 1.0, 9.0).equals(result));
    }

    @Test
    public void testVectorMultiplicationByNumber() {
        Vector3d vector = new Vector3d(0.0, -1.0, 2.0);
        double alpha = 5.0;
        Vector3d result = vector.multiply(alpha);
        assertTrue(new Vector3d(0.0, -5.0, 10.0).equals(result));
    }

    @Test
    public void testVectorLinearCombination() {
        Vector3d vector1 = new Vector3d(1.0, -1.0, 3.0);
        Vector3d vector2 = new Vector3d(-5.0, 21.0, 7.0);
        double alpha1 = 4.0;
        double alpha2 = -3.0;
        Vector3d result = vector1.multiply(alpha1).add(vector2.multiply(alpha2));
        assertTrue(new Vector3d(19.0, -67.0, -9.0).equals(result));
    }

    @Test
    public void testEquality() {
        Vector3d vector1 = new Vector3d(1.0, 2.0, 3.0);
        Vector3d vector2 = new Vector3d(1.0, 2.0, 3.0);
        assertTrue(vector1.equals(vector2));
    }
}
