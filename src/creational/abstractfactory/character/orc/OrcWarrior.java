package creational.abstractfactory.character.orc;

import creational.abstractfactory.character.Warrior;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * OrcWarrior Class
 *
 * @author a.slepakurov
 * @version 8/5/2015
 */
public class OrcWarrior extends Warrior {
    private Random random = new Random();

    @Override
    public String attack() {
        DecimalFormat df = new DecimalFormat("#.#");
        double stamina = Double.parseDouble(df.format(3 * random.nextDouble()).replace(",", "."));
        return swingSword(stamina) ?
                String.format("Orc warrior attacks, spending %s stamina.", df.format(stamina)) :
                String.format("Orc warrior doesn\'t have enough stamina to swing a sword. (Minimum %s stamina needed)", stamina);
    }
}
