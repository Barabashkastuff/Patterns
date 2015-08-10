package creational.builder.character;

import java.util.HashMap;
import java.util.Map;

/**
 * Type Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public enum RaceType {
    MAGE("mage"),
    ARCHER("archer"),
    WARRIOR("warrior");

    private String name;
    private static Map<String, RaceType> heroTypeMap;
    private static String[] names;

    RaceType(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public static RaceType getType(String type) {
        if (heroTypeMap == null) {
            initMapping();
        }
        return heroTypeMap.get(type);
    }

    public static String[] names() {
        if (names != null) {
            return names;
        }
        names = new String[values().length];
        for (int i = 0; i < values().length; i++) {
            names[i] = values()[i].getName();
        }
        return names;
    }

    private static void initMapping() {
        heroTypeMap = new HashMap<String, RaceType>();
        for (RaceType s : values()) {
            heroTypeMap.put(s.getName(), s);
        }
    }
}
