package abstractfactory;

public class GermanBeefDoner implements Doner {
    @Override
    public void describe() {
        System.out.println("German Beef Doner: grilled beef with fresh salad and spicy sauce.");
    }
}
