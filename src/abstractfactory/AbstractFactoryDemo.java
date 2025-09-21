package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Turkish Style Doners
        DonerStyleFactory turkishFactory = new TurkishDonerFactory();
        Doner turkishChicken = turkishFactory.createChickenDoner();
        Doner turkishBeef = turkishFactory.createBeefDoner();
        Doner turkishVeggie = turkishFactory.createVeggieDoner();

        turkishChicken.describe();
        turkishBeef.describe();
        turkishVeggie.describe();

        System.out.println("----");

        // German Style Doners
        DonerStyleFactory germanFactory = new GermanDonerFactory();
        Doner germanChicken = germanFactory.createChickenDoner();
        Doner germanBeef = germanFactory.createBeefDoner();
        Doner germanVeggie = germanFactory.createVeggieDoner();

        germanChicken.describe();
        germanBeef.describe();
        germanVeggie.describe();
    }
}
