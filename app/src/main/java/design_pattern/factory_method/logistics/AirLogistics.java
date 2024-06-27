package design_pattern.factory_method.logistics;

import design_pattern.factory_method.Logistics;
import design_pattern.factory_method.transport.Airplane;
import design_pattern.factory_method.transport.Transport;

public class AirLogistics extends Logistics{
    @Override
    protected Transport createTransport() {
        return new Airplane();
    }
}
