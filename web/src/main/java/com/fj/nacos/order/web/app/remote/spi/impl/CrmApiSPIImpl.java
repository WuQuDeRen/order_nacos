package com.fj.nacos.order.web.app.remote.spi.impl;

import com.fj.nacos.crm.api.CrmApi;
import com.fj.nacos.order.web.app.remote.spi.CrmApiSPI;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class CrmApiSPIImpl implements CrmApiSPI {

    @Reference
    private CrmApi crmApi;

    @Override
    public String getCrmPerson(String name) {
        return crmApi.getCrmPerson(name);
    }
}
