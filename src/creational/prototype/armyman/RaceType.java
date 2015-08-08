package creational.prototype.armyman;

import java.util.HashMap;
import java.util.Map;

/**
 * RaceType Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public enum RaceType {
    ELF("Elf"),
    ORC("Orc"),
    HUMAN("Human");

    private String name;
    private static Map<String, RaceType> raceTypeMap;

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
        if (raceTypeMap == null) {
            initMapping();
        }
        return raceTypeMap.get(type);
    }

    private static void initMapping() {
        raceTypeMap = new HashMap<String, RaceType>();
        for (RaceType s : values()) {
            raceTypeMap.put(s.getName(), s);
        }
    }
}
