package creational.builder.character;

/**
 * Hero Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public class Hero {
    private String name;
    private String level;
    private String subclass;
    private RaceType type;

    public Hero(Builder builder) {
        this.name = builder.getName();
        this.level = builder.getLevel();
        this.subclass = builder.getSubclass();
        this.type = builder.getType();
    }

    @Override
    public String toString() {
        return String.format("%s the %s  (lvl. %s) rises with %s subclass.\n", name, type.getName(), level, subclass);
    }

    public static class Builder {
        private String name = "Daisy";
        private String level = "42";
        private String subclass = "dancer";
        private RaceType type = RaceType.ARCHER;

        public Builder() {
        }

        public Builder putName(String name) {
            this.name = name;
            return this;
        }

        public Builder levelUp(String level) {
            this.level = level;
            return this;
        }

        public Builder putSubclass(String subclass) {
            this.subclass = subclass;
            return this;
        }

        public Builder putType(RaceType type) {
            this.type = type;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }

        private String getName() {
            return name;
        }

        private String getLevel() {
            return level;
        }

        private String getSubclass() {
            return subclass;
        }

        private RaceType getType() {
            return type;
        }
    }
}
