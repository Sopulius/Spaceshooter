/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter.dom.components;

import spaceshooter.dom.components.CollisionComponent;
import spaceshooter.dom.GameObject;
import spaceshooter.dom.Player;
import spaceshooter.dom.enemys.Enemy;

/**
 *
 * CollisionComponent for player.
 */
public class PlayerCollisionComponent extends CollisionComponent {

    @Override
    public void onCollision(GameObject obj) {
        Player p = (Player) this.getObj();
        if (obj instanceof Enemy) {
            if (p.getShips() >= 1) {
                p.setShips(p.getShips() - 1);
                if (p.getShips() == 0) {
                    p.setIsAlive(false);
                }
            }

        }
    }

}
