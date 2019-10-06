package com.fj.nacos.order.web.app.dubbo;

import com.fj.nacos.common.dto.OrderDTO;
import com.fj.nacos.common.dubbo.OrderDubboService;
import com.fj.nacos.common.response.ObjectResponse;
import com.fj.nacos.order.web.app.service.ITOrderService;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: heshouyou
 * @Description
 * @Date Created in 2019-09-04
 */
@Service
@Slf4j
public class OrderDubboServiceImpl implements OrderDubboService {

    @Autowired
    private ITOrderService orderService;

    @Override
    public ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO) {
        log.info("全局事务id ：" + RootContext.getXID());
        return orderService.createOrder(orderDTO);
    }
}
