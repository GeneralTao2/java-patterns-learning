package composite;

public class Rectangle extends Block {
    public Rectangle(Vec2D position, String name) {
        super(position, name);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle - " +name +
                " [x:" + position.getX() +
                " y:" + position.getY() + "]"
        );
    }
}