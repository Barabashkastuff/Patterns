package structural.composite.army;

import java.util.ArrayList;
import java.util.List;

/**
 * Party Class
 *
 * @author a.slepakurov
 * @version 8/14/2015
 */
public class Party implements IArmy {
    private List<IArmy> party = new ArrayList<>();

    @Override
    public boolean add(IArmy army) {
        return party.add(army);
    }

    @Override
    public boolean remove(IArmy army) {
        return party.remove(army);
    }

    @Override
    public String attack() {
        StringBuilder attack = new StringBuilder();
        party.forEach(partyMember -> attack.append("\n").append(partyMember.attack()));
        return party.toString();
    }
}
