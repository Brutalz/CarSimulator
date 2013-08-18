package org.brutalz.physical_engine;

public class PlaneCollider extends Collider {
    private Vector3d normalVector;
    private double planeConstant;

    public PlaneCollider(double a, double b, double c, double d) {
        normalVector = new Vector3d(a, b, c);
        planeConstant = d;
    }
}
