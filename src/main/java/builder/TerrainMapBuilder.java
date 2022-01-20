package builder;

import java.util.ArrayList;
import java.util.List;

public class TerrainMapBuilder implements Builder {
    private List<Building> buildings;
    private List<Unit> units;

    @Override
    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    @Override
    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    @Override
    public void setTrees(List<Tree> trees) {
        /* Nothing to do */
    }

    public TerrainMap getResult() {
        return new TerrainMap(buildings, units);
    }

    @Override
    public void reset() {
        buildings = new ArrayList<>();
        units = new ArrayList<>();
    }
}
