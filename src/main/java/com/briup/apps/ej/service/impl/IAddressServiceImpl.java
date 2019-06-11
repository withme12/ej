package com.briup.apps.ej.service.Impl;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.AddressExample;
import com.briup.apps.ej.dao.AddressMapper;
import com.briup.apps.ej.service.IAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IAddressServiceImpl  implements IAddressService {

    @Resource
    AddressMapper am;
    @Override
    public int deleteByPrimaryKey(Long id) {

        return am.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Address record) {
        return am.insert(record);
    }



    @Override
    public Address selectByPrimaryKey(Long id) {
        return am.selectByPrimaryKey(id);
    }





    @Override
    public int updateByPrimaryKeySelective(Address record) {
        return am.updateByPrimaryKeySelective(record);
    }
}
