package creational.factorymethod.character;

/**
 * ARace Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public class ACharacter {
    private String nickname;
    private RaceType race;

    public ACharacter(RaceType race) {
        this.race = race;
    }

    protected ACharacter(String nickname, RaceType race) {
        this.nickname = nickname;
        this.race = race;
    }

    public String getName() {
        return nickname;
    }

    public void setName(String name) {
        this.nickname = nickname;
    }

    public RaceType getRace() {
        return race;
    }

    public void setRace(RaceType race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return ((nickname.equals("") || nickname.equals("nickname")) ? "Unknown " : nickname + " the ") + race.getName();
    }
}
