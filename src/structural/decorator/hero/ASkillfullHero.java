package structural.decorator.hero;

/**
 * ASkillfullHero Class
 *
 * @author a.slepakurov
 * @version 8/14/2015
 */
public class ASkillfullHero extends AbstractHero {

    private AbstractHero hero;

    protected ASkillfullHero(AbstractHero hero) {
        this.hero = hero;
    }

    @Override
    public String whoAmI() {
        return hero.whoAmI() + "\n";
    }
}
