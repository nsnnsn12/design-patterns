package design_pattern.factory_method.transport;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by sea");
    }
}
