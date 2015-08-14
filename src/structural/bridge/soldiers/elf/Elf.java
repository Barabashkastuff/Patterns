package structural.bridge.soldiers.elf;

import structural.bridge.attacks.IAttack;
import structural.bridge.soldiers.ASoldier;

/**
 * Elf Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/14/2015
 */
public class Elf extends ASoldier {
    public Elf(IAttack attack) {
        super(attack);
    }

    @Override
    public String attack() {
        return "Elf" + attack.attack(health);
    }
}
