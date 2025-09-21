package abstractfactory;

public class GermanChickenDoner implements Doner {
    @Override
    public void describe() {
        System.out.println("German Chicken Doner: crispy chicken with cabbage and garlic mayo.");
    }
}
