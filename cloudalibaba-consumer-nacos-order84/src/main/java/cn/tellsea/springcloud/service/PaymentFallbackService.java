package cn.tellsea.springcloud.service;

import cn.tellsea.springcloud.entity.CommonResult;
import cn.tellsea.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @author Tellsea
 * @date 2020/10/01
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
