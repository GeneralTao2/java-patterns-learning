package builder;

import java.util.ArrayList;
import java.util.List;

public class TerrainBuilder implements Builder {
    private List<Building> buildings;
    private List<Tree> trees;
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
        this.trees = trees;
    }

    public Terrain getResult() {
        return  new Terrain(buildings, trees, units);
    }

    @Override
    public void reset() {
        buildings = new ArrayList<>();
        trees = new ArrayList<>();
        units = new ArrayList<>();
    }
}
