package com.yxxu.dao;

import com.yxxu.domain.Customer;

import java.util.List;

public interface CustomerDao {
    public Customer getCustomerWithId(Integer id);
    public List<Customer> getAllCustomer();
    public void addCustomer(Customer customer);
    public void updateCustomer(Customer customer);
}
