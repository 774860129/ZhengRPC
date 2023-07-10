package com.zheng.myRPC.service;


import com.zheng.myRPC.common.User;
/**
 * @author 86139
 * @version 1.0
 * @description TODO
 * @date 2023/7/6 0:11
 */
public interface UserService {
    // 客户端通过这个接口调用服务端的实现类
    User getUserByUserId(Integer id);

    Integer insertUserId(User user);
}
