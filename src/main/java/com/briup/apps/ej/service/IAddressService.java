package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.AddressExample;
import com.briup.apps.ej.bean.Category;
import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.utils.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAddressService {
    int deleteByPrimaryKey(Long id);
   // int insert(Address record);
    int deleteByPrimaryKeys(Long[] ids);
    Address selectByPrimaryKey(Long id);
   // int updateByPrimaryKeySelective(Address record);
    int insertOrUpdate(Address address);
    List<Address> findAll();
    List<Address>  query(Address address);
}
