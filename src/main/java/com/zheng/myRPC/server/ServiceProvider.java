package com.zheng.myRPC.server;

/**
 * @author 86139
 * @version 1.0
 * @description TODO
 * @date 2023/7/8 22:34
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 存放服务接口名与服务端对应的实现类
 * 服务启动时要暴露其相关的实现类
 * 根据request中的interface调用服务端中相关实现类
 * (根据接口名称获取相应的实现类对象)
 */
public class ServiceProvider {
    /**
     * 一个实现类可能实现多个服务接口，
     * 用于存储接口名称与实现类之间的映射关系
     */
    private Map<String, Object> interfaceProvider;

    public ServiceProvider(){
        this.interfaceProvider = new HashMap<>();
    }

    public void provideServiceInterface(Object service){
        Class<?>[] interfaces = service.getClass().getInterfaces();

        for(Class clazz : interfaces){
            interfaceProvider.put(clazz.getName(),service);
        }

    }

    public Object getService(String interfaceName){
        return interfaceProvider.get(interfaceName);
    }
}
