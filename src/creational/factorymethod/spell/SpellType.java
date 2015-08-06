package creational.factorymethod.spell;

import java.util.HashMap;
import java.util.Map;

/**
 * SpellType Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public enum SpellType {
    AIR("air"),
    FIRE("fire"),
    WATER("water"),
    EARTH("earth");

    private String name;
    private static Map<String, SpellType> spellTypeMap;

    SpellType(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public static SpellType getType(String type) {
        if (spellTypeMap == null) {
            initMapping();
        }
        return spellTypeMap.get(type);
    }

    private static void initMapping() {
        spellTypeMap = new HashMap<String, SpellType>();
        for (SpellType s : values()) {
            spellTypeMap.put(s.getName(), s);
        }
    }
}
