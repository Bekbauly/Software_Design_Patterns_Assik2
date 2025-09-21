package factorymethod;

public class BeefDonerFactory implements DonerFactory {
    @Override
    public Doner createDoner() {
        return new BeefDoner();
    }
}
