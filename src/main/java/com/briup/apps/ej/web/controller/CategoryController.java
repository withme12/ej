package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.Category;
import com.briup.apps.ej.service.IAddressService;
import com.briup.apps.ej.service.ICategoryService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {



        @Autowired
        ICategoryService ics;

        @ApiOperation("查找通过id")
        @GetMapping("/selectByPrimaryKey")
        public Message selectByPrimaryKey(@ApiParam(value = "主键", required = true)
                                          @RequestParam(value = "id") Long id) {
            return MessageUtil.success("success", ics.selectByPrimaryKey(id));
        }

        @ApiOperation("删除通过id")
        @GetMapping("/deleteById")
        public Message deleteByPrimaryKey(@ApiParam(value = "主键", required = true)
                                          @RequestParam(value = "id") Long id) {
            return MessageUtil.success("success", ics.deleteByPrimaryKey(id));
        }

    @ApiOperation("删除通过ids")
    @GetMapping("/batchDelete")
    public Message deleteByPrimaryKeys(@ApiParam(value ="主键" ,required=true)
                                       @RequestParam(value="ids") Long[] ids){
        return MessageUtil.success("success",ics.deleteByPrimaryKeys(ids));
    }

        @ApiOperation("插入")
        @GetMapping("/insertOrUpdate")
        public Message insertOrUpdate(Category category) {
            return MessageUtil.success("success", ics.insertOrUpdate(category));
        }
    @ApiOperation("插入")
    @GetMapping("/findAll")
    public Message findAll() {
        return MessageUtil.success("success", ics.findAll());
    }

    @GetMapping("query")
    @ApiOperation("模糊查询顾客信息")
    public Message query(Category category){
        List<Category> list=ics.query(category);
        return MessageUtil.success("success",list);
    }


}

