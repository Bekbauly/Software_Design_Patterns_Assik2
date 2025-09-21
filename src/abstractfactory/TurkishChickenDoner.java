package abstractfactory;

public class TurkishChickenDoner implements Doner {
    @Override
    public void describe() {
        System.out.println("Turkish Chicken Doner: juicy chicken with yogurt sauce in pita.");
    }
}
