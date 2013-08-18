package org.brutalz.physical_engine;

import java.util.LinkedList;
import java.util.List;

public class World {
    private Vector3d gravity;
    private List<Collider> colliders = new LinkedList<Collider>();

    public void setGravity(double x, double y, double z) {
        gravity = new Vector3d(x, y, z);
    }

    public void addCollider(Collider collider) {
        colliders.add(collider);
    }

    public void step(double deltaT) {
        for (Collider collider : colliders) {
            //TODO: check Vector3d operations and make physics for sphere jump.
            if (!collider.isStatic()) {
                SphereCollider sphereCollider = (SphereCollider) collider;
                Vector3d location = sphereCollider.getCenter();
                Vector3d velocity = sphereCollider.getVelocity();

                location.add(velocity.multiply(deltaT).add(gravity.multiply(deltaT * deltaT / 2)));

                velocity.add(gravity.multiply(deltaT));

                sphereCollider.setVelocity(velocity);

                sphereCollider.setCenter(location);
            }
        }
    }
}
