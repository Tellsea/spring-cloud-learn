package cn.tellsea.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Tellsea
 * @date 2020/09/28
 */
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    //坐标
    private final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
            //第一个参数是期望值，第二个参数是修改值是
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("*******第几次访问，次数next: " + next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        //得到服务器的下标位置
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
