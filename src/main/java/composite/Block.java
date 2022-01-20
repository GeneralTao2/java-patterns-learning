package composite;

public abstract class Block implements HierarchicalSchemeNode {
    Vec2D position;
    String name;

    public Block(Vec2D position, String name) {
        this.position = position;
        this.name = name;
    }

    @Override
    public Vec2D getPosition() {
        return position;
    }

    public void setPosition(Vec2D position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move(Vec2D vec2D) {
        position.plus(vec2D);
    }
}
