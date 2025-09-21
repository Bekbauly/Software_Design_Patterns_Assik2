package doner;

import factorymethod.BeefDonerFactory;
import factorymethod.ChickenDonerFactory;
import factorymethod.ClientDoner;
import factorymethod.DonerFactory;
import factorymethod.VeggieDonerFactory;

import abstractfactory.Doner;
import abstractfactory.DonerStyleFactory;
import abstractfactory.TurkishDonerFactory;
import abstractfactory.GermanDonerFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Factory Method Demo ===");
        DonerFactory chickenFactory = new ChickenDonerFactory();
        ClientDoner chickenClient = new ClientDoner(chickenFactory);
        chickenClient.getDoner().describe();

        DonerFactory beefFactory = new BeefDonerFactory();
        ClientDoner beefClient = new ClientDoner(beefFactory);
        beefClient.getDoner().describe();

        DonerFactory veggieFactory = new VeggieDonerFactory();
        ClientDoner veggieClient = new ClientDoner(veggieFactory);
        veggieClient.getDoner().describe();

        System.out.println("\n=== Abstract Factory Demo ===");

        // Turkish style family
        DonerStyleFactory turkishFactory = new TurkishDonerFactory();
        Doner turkishChicken = turkishFactory.createChickenDoner();
        Doner turkishBeef = turkishFactory.createBeefDoner();
        Doner turkishVeggie = turkishFactory.createVeggieDoner();

        turkishChicken.describe();
        turkishBeef.describe();
        turkishVeggie.describe();

        System.out.println("----");

        // German style family
        DonerStyleFactory germanFactory = new GermanDonerFactory();
        Doner germanChicken = germanFactory.createChickenDoner();
        Doner germanBeef = germanFactory.createBeefDoner();
        Doner germanVeggie = germanFactory.createVeggieDoner();

        germanChicken.describe();
        germanBeef.describe();
        germanVeggie.describe();
    }
}
