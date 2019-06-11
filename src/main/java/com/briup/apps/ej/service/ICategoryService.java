package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Category;

public interface ICategoryService {
    int deleteByPrimaryKey(Long id);
    int insert(Category record);
    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);
}
