package cn.tellsea.springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Tellsea
 * @date 2020/10/01
 */
public interface AccountService {

    /**
     * 扣减账户余额
     *
     * @param userId
     * @param money
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
