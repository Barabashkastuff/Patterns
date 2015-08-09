package creational.builder.character;

import java.util.HashMap;
import java.util.Map;

/**
 * Type Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public enum HeroType {
    MAGE("mage"),
    ARCHER("archer"),
    WARRIOR("warrior");

    private String name;
    private static Map<String, HeroType> heroTypeMap;
    private static String[] names;

    HeroType(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public static HeroType getType(String type) {
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
        heroTypeMap = new HashMap<String, HeroType>();
        for (HeroType s : values()) {
            heroTypeMap.put(s.getName(), s);
        }
    }
}
