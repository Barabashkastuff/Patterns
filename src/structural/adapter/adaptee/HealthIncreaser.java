package structural.adapter.adaptee;

/**
 * HealthIncreaser Class
 *
 * @author a.slepakurov
 * @version 8/11/2015
 */
public class HealthIncreaser {
    public int increaseHealth(int current, int increaseBy) {
        return (current + increaseBy > 100) ? 100 : current + increaseBy;
    }
}
