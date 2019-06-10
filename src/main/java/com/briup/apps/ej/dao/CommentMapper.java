package com.briup.apps.ej.dao;

import com.briup.apps.ej.bean.Comment;
import com.briup.apps.ej.bean.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_comment
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    long countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_comment
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_comment
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_comment
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_comment
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_comment
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_comment
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    Comment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_comment
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_comment
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_comment
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_comment
     *
     * @mbg.generated Mon Jun 10 15:24:11 CST 2019
     */
    int updateByPrimaryKey(Comment record);
}