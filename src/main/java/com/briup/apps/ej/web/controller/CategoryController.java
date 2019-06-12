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
        @GetMapping("/deleteByPrimaryKey")
        public Message deleteByPrimaryKey(@ApiParam(value = "主键", required = true)
                                          @RequestParam(value = "id") Long id) {
            return MessageUtil.success("success", ics.deleteByPrimaryKey(id));
        }

    @ApiOperation("删除通过ids")
    @GetMapping("/deleteByPrimaryKeys")
    public Message deleteByPrimaryKeys(@ApiParam(value ="主键" ,required=true)
                                       @RequestParam(value="ids") Long[] ids){
        return MessageUtil.success("success",ics.deleteByPrimaryKeys(ids));
    }

        @ApiOperation("插入")
        @GetMapping("/insert")
        public Message insert(Category category) {
            return MessageUtil.success("success", ics.insert(category));
        }

        @ApiOperation("更新")
        @GetMapping("/updateByPrimaryKeySelective")
        public Message updateByPrimaryKeySelective(Category category) {
            return MessageUtil.success("success", ics.updateByPrimaryKeySelective(category));
        }
    }

