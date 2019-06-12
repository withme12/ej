package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.AddressExample;
import com.briup.apps.ej.service.IAddressService;
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
@RequestMapping("/address")
public class AddressController {

    @Autowired
    IAddressService ids;

    @ApiOperation("查找通过id")
    @GetMapping("/selectByPrimaryKey")
    public Message selectByPrimaryKey(@ApiParam(value ="主键" ,required=true)
                            @RequestParam(value="id") Long id){
        return MessageUtil.success("success",ids.selectByPrimaryKey(id));
    }



    @ApiOperation("删除通过id")
    @GetMapping("/deleteByPrimaryKey")
    public Message deleteByPrimaryKey(@ApiParam(value ="主键" ,required=true)
                            @RequestParam(value="id") Long id){
        return MessageUtil.success("success",ids.deleteByPrimaryKey(id));
    }

    @ApiOperation("删除通过ids")
    @GetMapping("/deleteByPrimaryKeys")
    public Message deleteByPrimaryKeys(@ApiParam(value ="主键" ,required=true)
                                      @RequestParam(value="ids") Long[] idss){
        return MessageUtil.success("success",ids.deleteByPrimaryKeys(idss));
    }

    @ApiOperation("插入")
    @GetMapping("/insert")
    public Message insert(Address address){
        return MessageUtil.success("success",ids.insert(address));
    }

    @ApiOperation("更新")
    @GetMapping("/updateByPrimaryKeySelective")
    public Message updateByPrimaryKeySelective(Address address){
        return MessageUtil.success("success",ids.updateByPrimaryKeySelective(address));
    }



}
