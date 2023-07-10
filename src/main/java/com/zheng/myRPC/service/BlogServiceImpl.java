package com.zheng.myRPC.service;


import com.zheng.myRPC.common.Blog;
/**
 * @author 86139
 * @version 1.0
 * @description TODO
 * @date 2023/7/8 21:32
 */
public class BlogServiceImpl implements BlogService {
    @Override
    public Blog getBlogById(Integer id) {
        Blog blog = Blog.builder().id(id).title("我的博客").useId(22).build();
        System.out.println("客户端查询了"+id+"博客");
        return blog;
    }
}
