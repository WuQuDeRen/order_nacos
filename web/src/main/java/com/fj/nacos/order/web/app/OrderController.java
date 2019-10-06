package com.fj.nacos.order.web.app;


import com.fj.nacos.order.web.app.remote.spi.CrmApiSPI;
import com.fj.nacos.order.web.app.remote.spi.RepositoryApiSPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    //@Autowired
    private RepositoryApiSPI repositoryApiSPI;

    @Autowired
    private CrmApiSPI crmApiSPI;

    @GetMapping(value = "/deduct")
    public String deduct() {
        return repositoryApiSPI.deduct();
    }


    @GetMapping("/getPerson")
    public String getPerson() {
        return crmApiSPI.getCrmPerson("");
    }
}
