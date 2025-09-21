package abstractfactory;

public class TurkishDonerFactory implements DonerStyleFactory {
    @Override
    public Doner createChickenDoner() {
        return new TurkishChickenDoner();
    }

    @Override
    public Doner createBeefDoner() {
        return new TurkishBeefDoner();
    }

    @Override
    public Doner createVeggieDoner() {
        return new TurkishVeggieDoner();
    }
}
