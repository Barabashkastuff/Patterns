package structural.decorator.hero;

/**
 * MotorcycleSkillhero Class
 *
 * @author a.slepakurov
 * @version 8/14/2015
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
