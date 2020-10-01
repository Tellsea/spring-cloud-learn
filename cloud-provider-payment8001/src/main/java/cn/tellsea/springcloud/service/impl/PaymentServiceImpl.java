package cn.tellsea.springcloud.service.impl;

import cn.tellsea.springcloud.dao.PaymentDao;
import cn.tellsea.springcloud.entity.Payment;
import cn.tellsea.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }
}
