package com.fj.nacos.order.web.app.remote.api;

import com.fj.nacos.order.api.OrderApi;
import org.apache.dubbo.config.annotation.Service;

import java.util.UUID;

@Service
public class OrderApiImpl implements OrderApi {

    @Override
    public String getOrderNo() {
        return UUID.randomUUID().toString();
    }
}
