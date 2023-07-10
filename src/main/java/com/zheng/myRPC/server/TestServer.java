package com.zheng.myRPC.server;


import com.zheng.myRPC.service.BlogService;
import com.zheng.myRPC.service.BlogServiceImpl;
import com.zheng.myRPC.service.UserService;
import com.zheng.myRPC.service.UserServiceImpl;
/**
 * @author 86139
 * @version 1.0
 * @description TODO
 * @date 2023/7/8 21:43
 */
public class TestServer {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        BlogService blogService = new BlogServiceImpl();

        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.provideServiceInterface(userService);
        serviceProvider.provideServiceInterface(blogService);

        RPCServer RPCServer = new NettyRPCServer(serviceProvider);
        RPCServer.start(8899);
    }
}