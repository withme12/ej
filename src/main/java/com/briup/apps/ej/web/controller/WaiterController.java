package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Waiter;
import com.briup.apps.ej.service.IWaiterService;
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
@RequestMapping("/waiter")
public class WaiterController {
    @Autowired
    private IWaiterService waiterService;


    @GetMapping("findWaiterById")
    @ApiOperation("通过ID查询服务员信息")
    public Message findWaiterById(@ApiParam(value = "主键",required =true)@RequestParam("id") Long id){
        Waiter waiter=waiterService.findWaiterById(id);
        return MessageUtil.success("查询成功",waiter);
    }
    @GetMapping("insertOrUpdate")
    @ApiOperation("新增或者更新服务员信息")
    public Message insertOrUpdate(Waiter waiter)throws Exception{
        try{
            waiterService.insertOrUpdate(waiter);
            return MessageUtil.success("修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return MessageUtil.error("更新失败");
        }
    }
    @GetMapping("deleteWaiterById")
    @ApiOperation("根据ID删除服务员信息")
    public Message deleteWaiterById(@ApiParam(value="主键",required=true)@RequestParam("id") Long id)throws Exception{
        try {
            waiterService.deleteWaiterById(id);
            return MessageUtil.success("success");
        }catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error("删除失败");
        }
    }
    @GetMapping("query")
    @ApiOperation("模糊查询服务员信息")
    public Message query(Waiter waiter){
        List<Waiter> list=waiterService.query(waiter);
        return MessageUtil.success("success",list);
    }

}
