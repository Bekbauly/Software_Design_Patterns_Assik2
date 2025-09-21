package factorymethod;

public class VeggieDonerFactory implements DonerFactory {
    @Override
    public Doner createDoner() {
        return new VeggieDoner();
    }
}
