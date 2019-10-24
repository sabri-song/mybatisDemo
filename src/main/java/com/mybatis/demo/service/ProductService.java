package com.mybatis.demo.service;


import com.mybatis.demo.pojo.Product;

import java.util.List;

/**
 * @author：linma
 * @date: 2018/11/8 11:10
 * @email: linma@homeinns.com
 **/
public interface ProductService {

    /**
     * 获取产品
     *
     * @return
     */
    List<Product> getProducts();

}
