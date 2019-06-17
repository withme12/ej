package com.briup.apps.ej.dao;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.AddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_address
     *
     * @mbg.generated Mon Jun 10 11:19:31 CST 2019
     */
    long countByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_address
     *
     * @mbg.generated Mon Jun 10 11:19:31 CST 2019
     */
    int deleteByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_address
     *
     * @mbg.generated Mon Jun 10 11:19:31 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_address
     *
     * @mbg.generated Mon Jun 10 11:19:31 CST 2019
     */
    int insert(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_address
     *
     * @mbg.generated Mon Jun 10 11:19:31 CST 2019
     */
    int insertSelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_address
     *
     * @mbg.generated Mon Jun 10 11:19:31 CST 2019
     */
    List<Address> selectByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_address
     *
     * @mbg.generated Mon Jun 10 11:19:31 CST 2019
     */
    Address selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_address
     *
     * @mbg.generated Mon Jun 10 11:19:31 CST 2019
     */
    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_address
     *
     * @mbg.generated Mon Jun 10 11:19:31 CST 2019
     */
    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_address
     *
     * @mbg.generated Mon Jun 10 11:19:31 CST 2019
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_address
     *
     * @mbg.generated Mon Jun 10 11:19:31 CST 2019
     */
    int updateByPrimaryKey(Address record);
}