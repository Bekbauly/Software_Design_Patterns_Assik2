package factorymethod;

public class BeefDoner implements Doner {
    @Override
    public void describe() {
        System.out.println("Beef Doner: marinated beef, onions, and spicy sauce.");
    }
}
