package abstractfactory;

public class TurkishBeefDoner implements Doner {
    @Override
    public void describe() {
        System.out.println("Turkish Beef Doner: slow-cooked beef with onions and spices in lavash.");
    }
}
