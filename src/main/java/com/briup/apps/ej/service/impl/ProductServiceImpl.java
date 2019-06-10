package com.briup.apps.ej.service.impl;

import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.bean.Product;
import com.briup.apps.ej.dao.ProductMapper;
import com.briup.apps.ej.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {
    @Resource
    private ProductMapper productMapper;
    @Override
    public Product findProductById(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }
}
