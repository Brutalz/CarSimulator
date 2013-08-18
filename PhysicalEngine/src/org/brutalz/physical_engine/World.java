package org.brutalz.physical_engine;

import java.util.LinkedList;
import java.util.List;

public class World {
    private double gravityX = 0.0;
    private double gravityY = 0.0;
    private double gravityZ = 0.0;
    private List<SphereCollider> colliders = new LinkedList<SphereCollider>();

    public void setGravity(double x, double y, double z) {
        gravityX = x;
        gravityY = y;
        gravityZ = z;
    }

    public void addCollider(SphereCollider sphere) {
        colliders.add(sphere);
    }

    public void addCollider(PlaneCollider earth) {
        throw new UnsupportedOperationException();
    }

    public void step(double deltaT) {
        for (SphereCollider collider : colliders) {
            //TODO: make location, velocity as Vector3d property of colliders
            double x = collider.getX();
            double y = collider.getY();
            double z = collider.getZ();

            double vx = collider.getVelocityX();
            double vy = collider.getVelocityY();
            double vz = collider.getVelocityZ();

            x += vx * deltaT + gravityX * deltaT * deltaT / 2;
            y += vy * deltaT + gravityY * deltaT * deltaT / 2;
            z += vz * deltaT + gravityZ * deltaT * deltaT / 2;

            vx += gravityX * deltaT;
            vy += gravityY * deltaT;
            vz += gravityZ * deltaT;

            collider.setVelocityX(vx);
            collider.setVelocityY(vy);
            collider.setVelocityZ(vz);

            collider.setX(x);
            collider.setY(y);
            collider.setZ(z);
        }
    }
}
