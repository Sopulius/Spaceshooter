/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter.dom.pickups;

import spaceshooter.dom.pickups.Update;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import spaceshooter.dom.Player;
import static org.junit.Assert.*;
import spaceshooter.dom.pickups.Pickup;

/**
 *
 * @author Aleksi
 */
public class PickupTest {

    private Pickup update;

    public PickupTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.update = new Pickup(12, 13, 5, 5, 32, 32);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void paivitysLuodaanOikein() {
        assertEquals(0, this.update.getTick());
        assertEquals(12, this.update.getBeginX(), 0.0);
        assertEquals(13, this.update.getBeginY(), 0.0);

    }

    @Test
    public void tuhoutuuTormatessaPelaajaan() {
        this.update.onCollision(new Player(0, 0, 0, 0));
        assertEquals(false, this.update.isAlive());
    }
}
