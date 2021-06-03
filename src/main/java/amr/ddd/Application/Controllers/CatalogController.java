package amr.ddd.Application.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import amr.ddd.Domain.Entities.CatalogType;
import amr.ddd.Infrastructure.Data.BaseRepositoryImpl;
import amr.ddd.Infrastructure.Data.InnertestRepositori;


@RestController
@RequestMapping("/catalo")
public class CatalogController {


  @Autowired
  private InnertestRepositori repo;
  

    @GetMapping("/add")
    public String ReturnHello() {


        CatalogType entity = new CatalogType();
        entity.Type ="asp.net core";

        repo.save(entity);
        return "ok";


    }
}




