package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Waiter;
import com.briup.apps.ej.service.IWaiterService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
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

    @PostMapping("batchDelete")
    @ApiOperation("批量删除顾客信息")
    public Message BatchDelete(@NotNull(message = "ids不能为空") long[] ids) throws Exception {
        try {
            waiterService.batchDelete(ids);
            return MessageUtil.success("批量删除成功");
        }catch (Exception e)
        {
            e.printStackTrace();
            return MessageUtil.error("删除失败");
        }
    }

}
