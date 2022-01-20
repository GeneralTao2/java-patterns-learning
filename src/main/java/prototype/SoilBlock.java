package prototype;

public class SoilBlock extends Block {

    public SoilBlock(String props) {
        this.props = props;
    }

    @Override
    public void show() {
        System.out.println("Soil block with coords " + cords + " and props " + props);
    }
}
