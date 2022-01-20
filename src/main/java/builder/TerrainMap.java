package builder;

import java.util.List;

public class TerrainMap {
    private List<Building> buildings;
    private List<Unit> units;

    public TerrainMap(List<Building> buildings, List<Unit> units) {
        this.buildings = buildings;
        this.units = units;
    }

    void show() {
        buildings.forEach(x -> System.out.println("*print building icon in the map* " + x.getIcon()));
        units.forEach(x -> System.out.println("*print unit icon in the map* " + x.getIcon()));
    }
}
