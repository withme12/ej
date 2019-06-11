package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findCustomerById(Long id);
    void insertOrUpdate(Customer customer)throws Exception;
    void deleteCustomerById(Long id) throws Exception;
    List<Customer> query(Customer customer);
    void BatchDelete(Long[] ids)throws Exception;

   // List<CustomerExtend> selectAllWithTeacher();

   // List<StudentCourseExtend> selectCourseWithTeacherAndStudentAndGradeById(Long id);
}
