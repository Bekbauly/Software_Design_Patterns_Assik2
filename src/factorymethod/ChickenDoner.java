package factorymethod;

public class ChickenDoner implements Doner {
    @Override
    public void describe() {
        System.out.println("Chicken Doner: grilled chicken, fresh veggies, and garlic sauce.");
    }
}
