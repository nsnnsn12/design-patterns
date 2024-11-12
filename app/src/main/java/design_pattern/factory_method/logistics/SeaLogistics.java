package design_pattern.factory_method.logistics;

import design_pattern.factory_method.transport.Ship;
import design_pattern.factory_method.transport.Transport;

public class SeaLogistics extends Logistics{
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
