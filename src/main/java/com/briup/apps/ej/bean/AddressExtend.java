package com.briup.apps.ej.bean;

public class AddressExtend extends Address{
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
