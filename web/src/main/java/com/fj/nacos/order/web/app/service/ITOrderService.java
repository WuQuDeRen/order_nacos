package com.fj.nacos.order.web.app.service;

import com.baomidou.mybatisplus.service.IService;
import com.fj.nacos.common.dto.OrderDTO;
import com.fj.nacos.common.response.ObjectResponse;
import com.fj.nacos.order.web.app.entity.TOrder;

/**
 * <p>
 *  创建订单
 * </p>
 *
 * * @author lidong
 * @since 2019-09-04
 */
public interface ITOrderService extends IService<TOrder> {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
