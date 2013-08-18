package org.brutalz.physical_engine;

public class Collider {
    private Vector3d center;
    private Vector3d velocity;
    private double mass;
    private boolean isStatic;

    public Collider() {
        center = new Vector3d(0.0, 0.0, 0.0);
        velocity = new Vector3d(0.0, 0.0, 0.0);
    }

    public Vector3d getCenter() {
        return center;
    }

    public void setCenter(double x, double y, double z) {
        center.set(x, y, z);
    }

    public void setCenter(Vector3d center) {
        setCenter(center.getX(), center.getY(), center.getZ());
    }

    public Vector3d getVelocity() {
        return velocity;
    }

    public void setVelocity(double x, double y, double z) {
        velocity.set(x, y, z);
    }

    public void setVelocity(Vector3d velocity) {
        setVelocity(velocity.getX(), velocity.getY(), velocity.getZ());
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public boolean isStatic() {
        return this.isStatic;
    }

    public void setStatic(boolean isStatic) {
        this.isStatic = isStatic;
    }
}
