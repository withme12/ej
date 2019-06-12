package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.AddressExample;
import org.apache.ibatis.annotations.Param;

public interface IAddressService {
    int deleteByPrimaryKey(Long id);
    int insert(Address record);
    int deleteByPrimaryKeys(Long[] ids);
    Address selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(Address record);
}
