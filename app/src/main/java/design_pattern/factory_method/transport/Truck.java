package design_pattern.factory_method.transport;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by land");
    }
}
