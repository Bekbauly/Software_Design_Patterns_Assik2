package factorymethod;

public class FactoryDonerDemo {
    public static void main(String[] args) {
        // Chicken Doner
        DonerFactory chickenFactory = new ChickenDonerFactory();
        ClientDoner chickenClient = new ClientDoner(chickenFactory);
        chickenClient.getDoner().describe();

        System.out.println("----");

        // Beef Doner
        DonerFactory beefFactory = new BeefDonerFactory();
        ClientDoner beefClient = new ClientDoner(beefFactory);
        beefClient.getDoner().describe();

        System.out.println("----");

        // Veggie Doner
        DonerFactory veggieFactory = new VeggieDonerFactory();
        ClientDoner veggieClient = new ClientDoner(veggieFactory);
        veggieClient.getDoner().describe();
    }
}
