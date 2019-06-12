package com.briup.apps.ej.service.impl;

import com.briup.apps.ej.bean.Category;
import com.briup.apps.ej.dao.CategoryMapper;
import com.briup.apps.ej.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ICategoryServiceImpl implements ICategoryService {
    @Resource
    CategoryMapper cm;

    public int deleteByPrimaryKeys(Long[] ids) {
        for (Long id:ids) {
            cm.deleteByPrimaryKey(id);
        }
        return 1;
    }
    @Override
    public int deleteByPrimaryKey(Long id) {
        return cm.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Category record) {
        return cm.insert(record);
    }

    @Override
    public Category selectByPrimaryKey(Long id) {
        return cm.selectByPrimaryKey(id);
    }


    @Override
    public int updateByPrimaryKeySelective(Category record) {
        return cm.updateByPrimaryKeySelective(record);
    }
}
