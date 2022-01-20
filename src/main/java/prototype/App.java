package prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    static Map<String, Block> blockPrototypes = new HashMap<>() {{
        put("soil", new SoilBlock("soilProps"));
        put("stone", new StoneBlock("stoneProps"));
    }};


    public static void main(String[] args) throws CloneNotSupportedException {
        List.of(
            ( (Block) blockPrototypes.get("soil").clone()   ).setCords("coords1"),
            ( (Block) blockPrototypes.get("soil").clone()   ).setCords("coords2"),
            ( (Block) blockPrototypes.get("stone").clone()  ).setCords("coords3"),
            ( (Block) blockPrototypes.get("stone").clone()  ).setCords("coords4")
        ).forEach(Block::show);
    }
}
