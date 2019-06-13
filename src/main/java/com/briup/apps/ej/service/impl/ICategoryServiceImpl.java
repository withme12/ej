package com.briup.apps.ej.service.impl;

import com.briup.apps.ej.bean.*;
import com.briup.apps.ej.dao.CategoryMapper;
import com.briup.apps.ej.service.ICategoryService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ICategoryServiceImpl implements ICategoryService {
    @Resource
    CategoryMapper cm;

    @Override
    public List<CategoryExtend> findAllWithCategory() {
        return cm.findAllWithCategory();
    }

    @Override
    public int insertOrUpdate(Category category) {
        if(category.getId()==null)
            return cm.insert(category);

          return  cm.updateByPrimaryKeySelective(category);

    }

    @Override
    public List<Category> findAll() {
        CategoryExample ce=new CategoryExample();
        return cm.selectByExample(ce);
    }

    @Override
    public List<Category> query(Category category) {
        CategoryExample ce=new CategoryExample();
        if(category.getName()!=null)
            ce.createCriteria().andNameLike("%"+category.getName()+"%");

        return cm.selectByExample(ce);
    }

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
    public Category selectByPrimaryKey(Long id) {
        return cm.selectByPrimaryKey(id);
    }



}
