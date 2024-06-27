package design_pattern.factory_method;

import design_pattern.factory_method.transport.Transport;

public abstract class Logistics {
    public final void planDelivery() {
        //the factory method helps to decouple bellow business logic from the concrete classes
        Transport transport = createTransport();
        //this is core business logic
        transport.deliver();
    }

    protected abstract Transport createTransport();
}
