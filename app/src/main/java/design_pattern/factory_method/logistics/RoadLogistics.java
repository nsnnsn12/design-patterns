package design_pattern.factory_method.logistics;

import design_pattern.factory_method.transport.Transport;
import design_pattern.factory_method.transport.Truck;

public class RoadLogistics extends Logistics{
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}
