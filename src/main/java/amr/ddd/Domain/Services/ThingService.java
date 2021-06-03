package amr.ddd.Domain.Services;

import amr.ddd.Domain.Interfaces.services.IThingService;

public class ThingService implements IThingService {
    @Override
    public String AddThing(String name, String value) {
        return   name + value ;
    }
}
