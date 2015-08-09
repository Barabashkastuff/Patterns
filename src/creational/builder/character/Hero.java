package creational.builder.character;

/**
 * Hero Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public class Hero {
    private String name;
    private String level;
    private String subclass;
    private HeroType type;

    public Hero(Builder builder) {
        this.name = builder.getName();
        this.level = builder.getLevel();
        this.subclass = builder.getSubclass();
        this.type = builder.getType();
    }

    @Override
    public String toString() {
        return "-------------------------------------" +
                "\nHero{" +
                "name='" + name + '\'' +
                "\n, level='" + level + '\'' +
                "\n, subclass='" + subclass + '\'' +
                "\n, type=" + type.getName() +
                "}\n";
    }

    public static class Builder {
        private String name = "Daisy";
        private String level = "42";
        private String subclass = "dancer";
        private HeroType type = HeroType.ARCHER;

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

        public Builder putType(HeroType type) {
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

        private HeroType getType() {
            return type;
        }
    }
}
