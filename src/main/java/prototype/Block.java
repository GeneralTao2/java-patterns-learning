package prototype;

public abstract class Block implements Cloneable {
    String cords;
    String props;

    public String getCords() {
        return cords;
    }

    public String getProps() {
        return props;
    }

    public Block setCords(String cords) {
        this.cords = cords;
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    abstract void show();
}
