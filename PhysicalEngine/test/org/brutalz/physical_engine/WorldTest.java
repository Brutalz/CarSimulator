package org.brutalz.physical_engine;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class WorldTest {
    @Test
    public void testSphereFreeFalling() {
        World world = new World();
        SphereCollider sphere = new SphereCollider(0.0, 0.0, 10.0, 1.0); // (x, y, z, radius)

        world.setGravity(0.0, 0.0, -10.0);
        world.addCollider(sphere);

        world.step(1.0);

        assertEquals(0.0, sphere.getX(), 0.0001);
        assertEquals(0.0, sphere.getY(), 0.0001);
        assertEquals(5.0, sphere.getZ(), 0.0001); // z = z0 + V0*t + a*t^2/2
    }

    //TODO: delete @Ignore and write functionality to this test
    @Ignore
    @Test
    public void testSphereJumpingOnPlane() {
        World world = new World();
        SphereCollider sphere = new SphereCollider(0.0, 0.0, 10.0, 0.00001);
        PlaneCollider earth = new PlaneCollider(0.0, 0.0, 1.0, 0.0); // arguments of plane as in Ax + By + Cz + D = 0
        earth.setStatic(true);

        world.setGravity(0.0, 0.0, -10.0);
        world.addCollider(sphere);
        world.addCollider(earth);

        world.step(2.8284271247); // time, when the shpere has no speed after collision with plane

        assertEquals(0.0, sphere.getVelocity().getZ(), 0.0001);
        assertEquals(10.0, sphere.getY(), 0.0001);
    }
}
