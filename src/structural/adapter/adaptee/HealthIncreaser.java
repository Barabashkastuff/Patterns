package structural.adapter.adaptee;

/**
 * HealthIncreaser Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/11/2015
 */
public class HealthIncreaser {
    public int increaseHealth(int current, int increaseBy) {
        return (current + increaseBy > 100) ? 100 : current + increaseBy;
    }
}
