package structural.bridge.soldiers.human;

import structural.bridge.attacks.IAttack;
import structural.bridge.soldiers.ASoldier;

/**
 * Human Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/14/2015
 */
public class Human extends ASoldier {
    public Human(IAttack attack) {
            super(attack);
        }

        @Override
        public String attack() {
            return "Human" + attack.attack(health);
        }
}
