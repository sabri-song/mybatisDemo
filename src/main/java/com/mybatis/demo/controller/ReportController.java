package com.mybatis.demo.controller;

import com.mybatis.demo.pojo.Product;
import com.mybatis.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author：linma
 * @date: 2018/11/8 11:17
 * @email: linma@homeinns.com
 **/
@RestController
@Slf4j
@RequestMapping("/homeinns")
public class ReportController extends AbstractController {

    @Autowired
    private ProductService productService;

    @GetMapping("/report")
    public void report(HttpServletResponse response) throws IOException, JRException {
        // 从数据库获取需要显示的数据
        List<Product> products = productService.getProducts();
        List<Map<String, Object>> dataSources = new ArrayList<>();
        // 转换数据为map，所有的key和报表的展示的field名字必须保持一致
        products.forEach(product -> {
            Map<String, Object> map = new HashMap<>(16);
            map.put("id", product.getId());
            map.put("productName", product.getProductName());
            map.put("productPrice", product.getProductPrice());
            map.put("productCategory", product.getProductCategory());
            map.put("productInventory", product.getProductInventory());
            dataSources.add(map);
        });
        exportPDFReport(dataSources, "reports/homeinns.jrxml", response);
    }
}
