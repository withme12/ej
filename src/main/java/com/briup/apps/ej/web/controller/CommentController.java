package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Comment;
import com.briup.apps.ej.service.ICommentService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
@Autowired
    private ICommentService commentService;
@GetMapping("findAll")
@ApiOperation("查询所有评论")
    public Message findAll(){
    List<Comment> list=commentService.findAll();
    return MessageUtil.success("success",list);
}
@GetMapping("findCommentrById")
@ApiOperation("通过ID查询评论")
    public Message findCommentrById(@ApiParam(value = "主键",required =true)@RequestParam("id") Long id){
    Comment comment=commentService.findCommentrById(id);
    return MessageUtil.success("success",comment);
}
@GetMapping("insertOrUpdate")
@ApiOperation("新增或者更新评论")
    public Message insertOrUpdate(Comment comment)throws Exception{
    try{
        commentService.insertOrUpdate(comment);
        return MessageUtil.success("success");
    }catch (Exception e){
        e.printStackTrace();
        return MessageUtil.error("更新失败");
    }
}
    @GetMapping("deleteCommentById")
    @ApiOperation("根据ID删除评论")
    public Message deleteCommentById(@ApiParam(value="主键",required=true)@RequestParam("id") Long id)throws Exception{
    try {
        commentService.deleteCommentById(id);
        return MessageUtil.success("success");
    }catch (Exception e) {
    e.printStackTrace();
    return MessageUtil.error("删除失败");
    }
}
@GetMapping("query")
@ApiOperation("模糊查询评论")
    public Message query(Comment comment){
    List<Comment> list=commentService.query(comment);
    return MessageUtil.success("success",list);
}
    @GetMapping("BatchDelete")
    @ApiOperation("批量删除顾客信息")
    public Message BatchDelete(@NotNull(message = "ids不能为空")Long[] ids)throws Exception{

      try
      {commentService.BatchDelete(ids);
        return MessageUtil.success("批量删除成功");
    }catch(Exception e){
          e.printStackTrace();
          return MessageUtil.error("删除失败");
      }
}
}
