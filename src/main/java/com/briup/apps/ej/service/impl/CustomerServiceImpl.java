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
    public void insertOrUpdate(Customer customer) throws Exception {
            if(customer.getId()!=null){
                customer.setStatus("正常");
            customerMapper.updateByPrimaryKey(customer);
            }else{
                customer.setStatus("正常");
            customerMapper.insert(customer);
            }
    }

    @Override
    public void deleteCustomerById(Long id) throws Exception {
            customerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Customer> query(Customer customer) {
        CustomerExample example=new CustomerExample();
if(customer.getRealname()!=null){
        example.createCriteria().andRealnameLike("%"+customer.getRealname()+"%");
}
if(customer.getTelephone()!=null){
        example.createCriteria().andTelephoneLike("%"+customer.getRealname()+"%");
}
        return customerMapper.selectByExample(example);
    }
    @Override
    public void BatchDelete(Long[] ids) throws Exception {
        for(long id:ids){
            customerMapper.deleteByPrimaryKey(id);
        }
    }





}
