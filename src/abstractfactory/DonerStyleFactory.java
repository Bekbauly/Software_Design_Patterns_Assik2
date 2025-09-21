package abstractfactory;

public interface DonerStyleFactory {
    Doner createChickenDoner();
    Doner createBeefDoner();
    Doner createVeggieDoner();
}
