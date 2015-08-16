package structural.decorator.hero;

/**
 * KarateSkillHero Class
 *
 * @author a.slepakurov
 * @version 8/14/2015
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
