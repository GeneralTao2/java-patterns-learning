package composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundHierarchicalSchemeNode implements HierarchicalSchemeNode {
    private final List<HierarchicalSchemeNode> children;
    private HierarchicalSchemeNode node;

    @Override
    public Vec2D getPosition() {
        var positions = children.stream().map(HierarchicalSchemeNode::getPosition);
        var xPositions = positions.mapToInt(Vec2D::getX);
        var yPositions = positions.mapToInt(Vec2D::getY);
        return new Vec2D(
                (xPositions.max().orElseThrow() + xPositions.max().orElseThrow())/2,
                (yPositions.max().orElseThrow() + yPositions.max().orElseThrow())/2
        );
    }

    public CompoundHierarchicalSchemeNode(List<HierarchicalSchemeNode> children, HierarchicalSchemeNode node) {
        this.children = children;
        this.node = node;
    }

    public void add(HierarchicalSchemeNode child) {
        this.children.add(child);
    }

    public void remove(HierarchicalSchemeNode child) {
        this.children.remove(child);
    }

    public HierarchicalSchemeNode getNode() {
        return node;
    }

    public void setNode(HierarchicalSchemeNode node) {
        this.node = node;
    }

    @Override
    public void move(Vec2D vec2D) {
        this.node.move(vec2D);
        this.children.forEach(x -> x.move(vec2D));
    }

    @Override
    public void draw() {
        this.node.draw();
        this.children.forEach(HierarchicalSchemeNode::draw);
    }
}
