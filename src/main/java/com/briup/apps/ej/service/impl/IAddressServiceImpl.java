package com.briup.apps.ej.service.impl;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.AddressExample;
import com.briup.apps.ej.bean.Category;
import com.briup.apps.ej.dao.AddressMapper;
import com.briup.apps.ej.service.IAddressService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IAddressServiceImpl  implements IAddressService {

    @Resource
    AddressMapper am;

    @Override
    public List<Address> findAll() {
        AddressExample ae=new AddressExample();
        return am.selectByExample(ae);
    }

    @Override
    public List<Address> query(Address address) {
        AddressExample ae=new AddressExample();
        if(address.getAddress()!=null)
            ae.createCriteria().andAddressLike("%"+address.getAddress()+"%");
        if(address.getTelephone()!=null)
            ae.createCriteria().andTelephoneLike("%"+address.getTelephone()+"%");
        return am.selectByExample(ae);
    }

    @Override
    public int insertOrUpdate(Address address) {
        if(address.getId()==null)
        {
            return am.insert(address);
        }
        return am.updateByPrimaryKeySelective(address);
    }

    @Override
    public int deleteByPrimaryKeys(Long[] ids) {
        for (Long id:ids) {
            am.deleteByPrimaryKey(id);
        }
        return 1;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {

        return am.deleteByPrimaryKey(id);
    }





    @Override
    public Address selectByPrimaryKey(Long id) {
        return am.selectByPrimaryKey(id);
    }






}
