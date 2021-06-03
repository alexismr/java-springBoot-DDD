package amr.ddd.Application.Controllers;

import amr.ddd.Domain.Interfaces.services.IThingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Thing")
public class ThingController {

    private IThingService _thingService;

    public ThingController(IThingService thingService) {
        this._thingService = thingService;
    }

    @GetMapping
    public String ReturnHello() {
        return this._thingService.AddThing("hola","alexis");
    }
}
