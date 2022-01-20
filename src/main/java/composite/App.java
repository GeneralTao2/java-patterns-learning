package composite;

import java.util.List;

public class App {
    public static void main(String[] args) {
        new CompoundHierarchicalSchemeNode(List.of(
                new CompoundHierarchicalSchemeNode(
                        List.of(
                                new Rectangle(new Vec2D(1,2), "Rec1"),
                                new Rectangle(new Vec2D(3,4), "Rec2")
                        ),
                        new Circle(new Vec2D(5,6), "Cir1")
                ),
                new Rectangle(new Vec2D(7,8), "Rec3")
        ),
                new Rectangle(new Vec2D(9,10), "Rec4")
        ).draw();
    }
}
