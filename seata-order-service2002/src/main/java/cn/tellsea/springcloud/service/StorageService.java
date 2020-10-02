package cn.tellsea.springcloud.service;

/**
 * @author Tellsea
 * @date 2020/10/01
 */
public interface StorageService {

    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     */
    void decrease(Long productId, Integer count);
}
