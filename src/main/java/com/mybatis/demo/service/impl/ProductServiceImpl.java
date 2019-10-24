package com.mybatis.demo.service.impl;

import com.mybatis.demo.enums.ProductEnum;
import com.mybatis.demo.exception.ProductException;
import com.mybatis.demo.pojo.Product;
import com.mybatis.demo.repository.ProductRepository;
import com.mybatis.demo.service.AbstractService;
import com.mybatis.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author：linma
 * @date: 2018/11/8 11:10
 * @email: linma@homeinns.com
 **/
@Service
@Slf4j
public class ProductServiceImpl extends AbstractService implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        log.info("==== 开始查询商品信息 =====");
        List<Product> products = productRepository.findProductsByFlag(23);
        if (products.size() == 0) {
            throw new ProductException(ProductEnum.PRODUCT_NOT_EXIST);
        }
        return products;
    }
}
