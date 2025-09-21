package abstractfactory;

public class GermanVeggieDoner implements Doner {
    @Override
    public void describe() {
        System.out.println("German Veggie Doner: falafel with cucumber, tomato, and yogurt sauce.");
    }
}
