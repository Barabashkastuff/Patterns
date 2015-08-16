package creational.abstractfactory.character;

/**
 * Party Class
 *
 * @author a.slepakurov
 * @version 8/5/2015
 */
public class Party {
    private Mage mage;
    private Archer archer;
    private Warrior warrior;

    public Party(Mage mage, Archer archer, Warrior warrior) {
        this.mage = mage;
        this.archer = archer;
        this.warrior = warrior;
    }

    public Mage getMage() {
        return mage;
    }

    public void setMage(Mage mage) {
        this.mage = mage;
    }

    public Archer getArcher() {
        return archer;
    }

    public void setArcher(Archer archer) {
        this.archer = archer;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    public String partyAttack() {
        return String.format("--------------------------------\n%s \n%s \n%s\n", mage.cast(), archer.shoot(), warrior.attack());
    }
}
