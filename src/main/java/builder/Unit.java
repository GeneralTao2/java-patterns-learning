package builder;

import java.util.List;

public class Unit {
    String name;
    String icon;
    String xp;

    public Unit(String name, String icon, String xp) {
        this.name = name;
        this.icon = icon;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getXp() {
        return xp;
    }

    public void setXp(String xp) {
        this.xp = xp;
    }
}
