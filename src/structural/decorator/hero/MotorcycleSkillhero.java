package structural.decorator.hero;

/**
 * MotorcycleSkillhero Class
 *
 * @author Andrew S. Slepakurov
 * @version 14/08/2015
 */
public class MotorcycleSkillhero extends ASkillfullHero {
    public MotorcycleSkillhero(AbstractHero hero) {
        super(hero);
    }

    @Override
    public String whoAmI() {
        return super.whoAmI() + "I know how to drive a motorcycle.";
    }
}
