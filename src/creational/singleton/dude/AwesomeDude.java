package creational.singleton.dude;

/**
 * AwesomeDude Class
 *
 * @author a.slepakurov
 * @version 8/9/15
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class AwesomeDude {
    private static AwesomeDude instance;
    private String id = "42";
    private String name;
    private String catchphrase;

    private AwesomeDude() {
        name = "dude";
        catchphrase = "Duke Nukem must die!";
    }

    public static AwesomeDude getInstance() {
        if (instance == null) {
            synchronized (AwesomeDude.class) {
                if (instance == null) {
                    instance = new AwesomeDude();
                }
            }
        }
        return instance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchphrase() {
        return catchphrase;
    }

    public void setCatchphrase(String catchphrase) {
        this.catchphrase = catchphrase;
    }

    @Override
    public String toString() {
        return "\n----------------------------\nAwesomeDude{" +
                "id='" + id + '\'' +
                "\n, name='" + name + '\'' +
                "\n, catchphrase='" + catchphrase + '\'' +
                '}';
    }
}
