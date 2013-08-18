package org.brutalz.physical_engine;

public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        set(x, y, z);
    }

    public void setY(double y) {
        set(x, y, z);
    }

    public void setZ(double z) {
        set(x, y, z);
    }

    public Vector3d add(Vector3d vector) {
        this.x += vector.getX();
        this.y += vector.getY();
        this.z += vector.getZ();
        return this;
    }

    public Vector3d mult(double alpha) {
        this.x *= alpha;
        this.y *= alpha;
        this.z *= alpha;
        return this;
    }
}

