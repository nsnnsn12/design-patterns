package design_pattern.factory_method.transport;

public class Airplane implements Transport{
    public void deliver() {
        System.out.println("Deliver by air");
    }
}
