package structural.bridge.attacks;

/**
 * WarriorSoldier Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/14/2015
 */
public class WarriorAttack implements IAttack {
    @Override
    public String attack(int health) {
        return " soldier attacks with a sword and decreased health by " + health + ".";
    }
}
