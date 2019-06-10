package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Product;
import com.briup.apps.ej.service.ICustomerService;
import com.briup.apps.ej.service.IProductService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("findProductById")
    public Message findProductById(Long id) {
        Product product = productService.findProductById(id);
        return MessageUtil.success("查询成功", product);
    }
}