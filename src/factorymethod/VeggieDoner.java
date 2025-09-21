package factorymethod;

public class VeggieDoner implements Doner {
    @Override
    public void describe() {
        System.out.println("Veggie Doner: grilled vegetables, hummus, and tahini.");
    }
}
