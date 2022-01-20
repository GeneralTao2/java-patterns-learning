package builder;

import java.util.List;

public interface Builder {
    void setBuildings(List<Building> buildings);
    void setUnits(List<Unit> units);
    void setTrees(List<Tree> trees);
    void reset();
}
