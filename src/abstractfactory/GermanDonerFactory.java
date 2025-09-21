package abstractfactory;

public class GermanDonerFactory implements DonerStyleFactory {
    @Override
    public Doner createChickenDoner() {
        return new GermanChickenDoner();
    }

    @Override
    public Doner createBeefDoner() {
        return new GermanBeefDoner();
    }

    @Override
    public Doner createVeggieDoner() {
        return new GermanVeggieDoner();
    }
}
