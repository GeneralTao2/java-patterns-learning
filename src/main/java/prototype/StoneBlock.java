package prototype;

public class StoneBlock extends Block {

    public StoneBlock(String props) {
        this.props = props;
    }

    @Override
    public void show() {
        System.out.println("Stone block with coords " + cords + " and props " + props);
    }
}
