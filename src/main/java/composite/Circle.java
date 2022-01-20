package composite;

public class Circle extends Block {

    public Circle(Vec2D position, String name) {
        super(position, name);
    }

    @Override
    public void draw() {
        System.out.println("Circle - " +name +
                " [x:" + position.getX() +
                " y:" + position.getY() + "]"
        );
    }
}
