package org.brutalz.physical_engine;

public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        set(x, y, z);
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

    public Vector3d add(Vector3d vector) {
        return new Vector3d(this.x + vector.x,
                this.y + vector.y,
                this.z + vector.z);
    }

    public Vector3d multiply(double alpha) {
        return new Vector3d(alpha * this.x,
                alpha * this.y,
                alpha * this.z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector3d vector3d = (Vector3d) o;

        if (x == vector3d.x &&
                y == vector3d.y &&
                z == vector3d.z) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(z);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f, %f)", x, y, z);
    }

    public double dot() {
        return x*x + y*y + z*z;
    }
}

