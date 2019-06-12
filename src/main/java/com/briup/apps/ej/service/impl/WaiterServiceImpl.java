package com.briup.apps.ej.service.impl;

import com.briup.apps.ej.bean.Waiter;
import com.briup.apps.ej.bean.WaiterExample;
import com.briup.apps.ej.dao.WaiterMapper;
import com.briup.apps.ej.service.IWaiterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WaiterServiceImpl implements IWaiterService {
    @Resource
    private WaiterMapper waiterMapper;

    @Override
    public Waiter findWaiterById(Long id) {

        return waiterMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertOrUpdate(Waiter waiter) throws Exception {
        if(waiter.getId()!=null){
           waiter.setStatus("正常");
            waiterMapper.updateByPrimaryKey(waiter);
        }else{
            waiter.setStatus("正常");
            waiterMapper.insert(waiter);
        }
    }

    @Override
    public void deleteWaiterById(Long id) throws Exception {
        waiterMapper.deleteByPrimaryKey(id);
    }


    @Override
    public List<Waiter> query(Waiter waiter) {
        WaiterExample example=new WaiterExample();
        if(waiter.getRealname()!=null){
            example.createCriteria().andRealnameLike("%"+waiter.getRealname()+"%");
        }
        if(waiter.getRealname()!=null){
            example.createCriteria().andRealnameLike("%"+waiter.getRealname()+"%");
        }
        return waiterMapper.selectByExample(example);
    }

}
