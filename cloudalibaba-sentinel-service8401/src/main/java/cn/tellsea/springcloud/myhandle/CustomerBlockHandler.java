package cn.tellsea.springcloud.myhandle;

import cn.tellsea.springcloud.entity.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author Tellsea
 * @date 2020/10/01
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");
    }
}
