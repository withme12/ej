package com.briup.apps.ej.service.impl;

import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.bean.CustomerExample;
import com.briup.apps.ej.dao.CustomerMapper;
import com.briup.apps.ej.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Resource
    private CustomerMapper customerMapper;


    @Override
    public List<Customer> findAll() {
        CustomerExample example=new CustomerExample();
        return customerMapper.selectByExample(example);
    }

    @Override
    public Customer findCustomerById(Long id) {


        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertOrUpdate(Customer Customer) throws Exception {

    }

    @Override
    public void deleteCustomerById(Long id) throws Exception {

    }

    @Override
    public List<Customer> query(Customer Customer) {
        return null;
    }
}
