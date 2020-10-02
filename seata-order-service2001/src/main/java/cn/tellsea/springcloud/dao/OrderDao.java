package cn.tellsea.springcloud.dao;

import cn.tellsea.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Tellsea
 * @date 2020/10/01
 */
@Mapper
public interface OrderDao {
    /**
     * 新建订单
     *
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态，从零改为1
     *
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
