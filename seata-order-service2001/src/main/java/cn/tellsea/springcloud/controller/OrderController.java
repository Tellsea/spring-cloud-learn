package cn.tellsea.springcloud.controller;

import cn.tellsea.springcloud.entity.CommonResult;
import cn.tellsea.springcloud.entity.Order;
import cn.tellsea.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Tellsea
 * @date 2020/10/01
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
