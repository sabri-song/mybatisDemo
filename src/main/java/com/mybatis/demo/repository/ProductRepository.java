package com.mybatis.demo.repository;

import com.mybatis.demo.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author：linma
 * @date: 2018/11/7 17:55
 * @email: linma@homeinns.com
 **/
public interface ProductRepository extends JpaRepository<Product, String> {

    /**
     * 查询商品
     *
     * @param flag
     * @return
     */
    List<Product> findProductsByFlag(Integer flag);
}
