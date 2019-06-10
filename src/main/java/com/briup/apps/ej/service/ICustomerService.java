package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findCustomerById(Long id);
    void insertOrUpdate(Customer Customer)throws Exception;
    void deleteCustomerById(Long id) throws Exception;
    List<Customer> query(Customer Customer);

   // List<CustomerExtend> selectAllWithTeacher();

   // List<StudentCourseExtend> selectCourseWithTeacherAndStudentAndGradeById(Long id);
}
