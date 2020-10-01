package cn.tellsea.springcloud.service;

import cn.tellsea.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}
