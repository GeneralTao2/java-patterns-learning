package builder;

import java.util.List;

public class Terrain {
    private List<Building> buildings;
    private List<Tree> trees;
    private List<Unit> units;

    public Terrain(List<Building> buildings, List<Tree> trees, List<Unit> units) {
        this.buildings = buildings;
        this.trees = trees;
        this.units = units;
    }

    public List<Building> getBuildings() {
        return buildings;
    }


    public List<Tree> getTrees() {
        return trees;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void render() {
        buildings.forEach(x -> System.out.println("*rendering building* "+x.getName()+" "+x.getIcon()));
        trees.forEach(x -> System.out.println("*rendering tree* "+x.getName()+" "+x.getIcon()+" "));
        units.forEach(x -> System.out.println("*rendering units* "+x.getName()+" "+x.getIcon()+" "+x.getXp()));
    }

}
