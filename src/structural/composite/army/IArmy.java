package structural.composite.army;

import javax.naming.OperationNotSupportedException;

/**
 * Army Interface
 *
 * @author Andrew S. Slepakurov
 * @version 8/14/2015
 */
public interface IArmy {
    boolean add(IArmy army) throws OperationNotSupportedException;
    boolean remove(IArmy army) throws OperationNotSupportedException;
    String attack();
}
