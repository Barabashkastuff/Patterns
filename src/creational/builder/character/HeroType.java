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

    private static void initMapping() {
        heroTypeMap = new HashMap<String, HeroType>();
        for (HeroType s : values()) {
            heroTypeMap.put(s.getName(), s);
        }
    }
}
