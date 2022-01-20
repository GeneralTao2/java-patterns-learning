package builder;

public class App {
    public static void main(String[] args) {
        Director director = new Director();

        TerrainBuilder terrainBuilder = new TerrainBuilder();
        director.constructLittleTerrain(terrainBuilder);
        Terrain littleTerrain = terrainBuilder.getResult();
        littleTerrain.render();

        TerrainMapBuilder terrainMapBuilder = new TerrainMapBuilder();
        director.constructLittleTerrain(terrainMapBuilder);
        TerrainMap littleTerrainMap = terrainMapBuilder.getResult();
        littleTerrainMap.show();

        director.constructBigTerrain(terrainBuilder);
        Terrain bigTerrain = terrainBuilder.getResult();
        bigTerrain.render();

        director.constructBigTerrain(terrainMapBuilder);
        TerrainMap bigTerrainMap = terrainMapBuilder.getResult();
        bigTerrainMap.show();
    }
}
