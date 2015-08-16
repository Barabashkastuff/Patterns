package structural.composite.army;

import javax.naming.OperationNotSupportedException;

/**
 * Archer Class
 *
 * @author a.slepakurov
 * @version 8/14/2015
 */
public class Archer implements IArmy{
    @Override
    public boolean add(IArmy army) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("add() method is not supported for a leaf class.");
    }

    @Override
    public boolean remove(IArmy army) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("remove() method is not supported for a leaf class.");
    }

    @Override
    public String attack() {
        return "Archer shoot an arrow.";
    }
}
