package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Waiter;

import java.util.List;

public interface IWaiterService {
    Waiter findWaiterById(Long id);
    void insertOrUpdate(Waiter product)throws Exception;
    void deleteWaiterById(Long id) throws Exception;
    List<Waiter> query(Waiter waiter);

}
