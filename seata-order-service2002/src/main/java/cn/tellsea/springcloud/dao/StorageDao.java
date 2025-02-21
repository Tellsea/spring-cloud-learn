package cn.tellsea.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Tellsea
 * @date 2020/10/01
 */
@Mapper
public interface StorageDao {

    /**
     * 扣减库存信息
     *
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
