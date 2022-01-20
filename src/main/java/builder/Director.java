package builder;

import java.util.List;

public class Director {
    public void constructLittleTerrain(Builder builder) {
        builder.reset();
        builder.setBuildings(List.of(
                new Building("qwe","ewq")
        ));
        builder.setTrees(List.of(
                new Tree("asd","dsa")
        ));
        builder.setUnits(List.of(
                new Unit("zxc", "cxz", "bnm")
        ));

    }

    public void constructBigTerrain(Builder builder) {
        builder.reset();
        builder.setBuildings(List.of(
                new Building("qwe","ewq"),
                new Building("qwe1","ewq1")
        ));
        builder.setTrees(List.of(
                new Tree("asd","dsa"),
                new Tree("asd1","dsa1")
        ));
        builder.setUnits(List.of(
                new Unit("zxc", "cxz", "bnm"),
                new Unit("zxc1", "cxz1", "bnm1")
        ));
    }
}
