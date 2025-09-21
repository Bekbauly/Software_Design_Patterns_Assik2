package abstractfactory;

public class TurkishVeggieDoner implements Doner {
    @Override
    public void describe() {
        System.out.println("Turkish Veggie Doner: grilled eggplant, peppers, and tahini sauce.");
    }
}
