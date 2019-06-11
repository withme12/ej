package com.briup.apps.ej.service.Impl;

import com.briup.apps.ej.bean.Category;
import com.briup.apps.ej.dao.CategoryMapper;
import com.briup.apps.ej.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ICategoryServiceImpl implements ICategoryService {
    @Resource
    CategoryMapper cm;

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
