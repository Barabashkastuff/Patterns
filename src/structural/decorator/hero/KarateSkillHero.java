package structural.decorator.hero;

/**
 * KarateSkillHero Class
 *
 * @author Andrew S. Slepakurov
 * @version 14/08/2015
 */
public class KarateSkillHero extends ASkillfullHero {
    public KarateSkillHero(AbstractHero hero) {
        super(hero);
    }

    @Override
    public String whoAmI() {
        return super.whoAmI() + "I know karate.";
    }
}
