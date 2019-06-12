package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.AddressExample;
import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.service.IAddressService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/deleteById")
    public Message deleteByPrimaryKey(@ApiParam(value ="主键" ,required=true)
                            @RequestParam(value="id") Long id){
        return MessageUtil.success("success",ids.deleteByPrimaryKey(id));
    }

    @GetMapping("findAll")
    public Message findAll() {
        List<Address> list = ids.findAll();
        return MessageUtil.success("success", list);
    }
    @ApiOperation("删除通过ids")
    @GetMapping("/batchDelete")
    public Message deleteByPrimaryKeys(@ApiParam(value ="主键" ,required=true)
                                      @RequestParam(value="ids") Long[] idss){
        return MessageUtil.success("success",ids.deleteByPrimaryKeys(idss));
    }

    @ApiOperation("插入")
    @PostMapping("/insertOrUpdate")
    public Message insertOrUpdate(Address address){
        return MessageUtil.success("success",ids.insertOrUpdate(address));
    }
    @GetMapping("query")
    @ApiOperation("模糊查询顾客信息")
    public Message query(Address address){
        List<Address> list=ids.query(address);
        return MessageUtil.success("success",list);
    }



}
