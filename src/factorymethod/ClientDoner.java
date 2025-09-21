package factorymethod;

public class ClientDoner {
    private final DonerFactory factory;

    public ClientDoner(DonerFactory factory) {
        this.factory = factory;
    }

    public Doner getDoner() {
        return factory.createDoner();
    }
}
