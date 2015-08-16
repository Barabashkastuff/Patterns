package structural.bridge.attacks;

/**
 * ArcherSoldier Class
 *
 * @author a.slepakurov
 * @version 8/14/2015
 */
public class ArcherAttack implements IAttack {
    @Override
    public String attack(int health) {
        return " archer attacks with a bow and arrow and decreased health by " + health + ".";
    }
}
