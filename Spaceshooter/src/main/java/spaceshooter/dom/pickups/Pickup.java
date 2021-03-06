/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter.dom.pickups;

import spaceshooter.dom.GameObject;
import spaceshooter.dom.ImageObject;
import spaceshooter.dom.Level;
import spaceshooter.dom.Player;

/**
 * Baseclass for pickup-objects.
 *
 */
public class Pickup extends ImageObject {

    private int tick = 0;
    private float beginX;
    private float beginY;

    /**
     * Constructor for Pickup.
     *
     * @param x x-coordinate.
     * @param y y-coordinate.
     * @param vx x-velocity.
     * @param vy y-velocity.
     * @param w Hitbox width.
     * @param h Hitbox height.
     */
    public Pickup(float x, float y, float vx, float vy, int w, int h) {
        super(x, y, vx, vy, w, h);

        this.beginX = x;
        this.beginY = y;
    }

    @Override
    public void move() {
        tick++;
        this.setPosX(this.beginX + 100 * (float) Math.cos(tick * 0.05 * Math.PI));
        this.setPosY(this.getPosY() + this.getVelY());
    }

    @Override
    public void update(Level taso) {
        move();
    }

    @Override
    public void onCollision(GameObject obj) {
        if (obj instanceof Player) {
            this.setIsAlive(false);
        }
    }

    public int getTick() {
        return tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
    }

    public float getBeginX() {
        return beginX;
    }

    public void setBeginX(float beginX) {
        this.beginX = beginX;
    }

    public float getBeginY() {
        return beginY;
    }

    public void setBeginY(float beginY) {
        this.beginY = beginY;
    }

}
