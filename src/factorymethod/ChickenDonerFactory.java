package factorymethod;

public class ChickenDonerFactory implements DonerFactory {
    @Override
    public Doner createDoner() {
        return new ChickenDoner();
    }
}
