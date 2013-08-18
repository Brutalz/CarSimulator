package org.brutalz.physical_engine;

public class SphereCollider extends Collider {
    private Vector3d center;
    private double r;
    private Vector3d velocity;

    public SphereCollider(double x, double y, double z, double r) {
        this.center = new Vector3d(x, y, z);
        this.r = r;
        this.velocity = new Vector3d(0.0, 0.0, 0.0);
    }

    public Vector3d getCenter() {
        return center;
    }

    public void setCenter(double x, double y, double z) {
        center.set(x ,y ,z);
    }

    public void setCenter(Vector3d center) {
        setCenter(center.getX(), center.getY(), center.getZ());
    }


    public double getR() {
        return r;
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
}
