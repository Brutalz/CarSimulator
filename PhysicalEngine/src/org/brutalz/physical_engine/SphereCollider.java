package org.brutalz.physical_engine;

public class SphereCollider extends Collider {
    private double r;

    public SphereCollider(double x, double y, double z, double r) {
        super();
        setCenter(x, y, z);
        this.r = r;
    }

    public double getR() {
        return r;
    }
}
