package com.mybatis.demo.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author：linma
 * @date: 2018/11/7 17:52
 * @email: linma@homeinns.com
 **/
@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private String id;

    private String productName;

    private BigDecimal productPrice;

    private String productCategory;

    private Integer productInventory;

    private Date updateTime;

    private Integer flag;
}
