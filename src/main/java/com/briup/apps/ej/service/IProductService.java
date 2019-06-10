package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.bean.Product;

import java.util.List;

public interface IProductService {
    Product findProductById(Long id);
}
