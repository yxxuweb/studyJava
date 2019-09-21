package com.yxxu.mapper;

import com.yxxu.domain.Customer;
import org.apache.ibatis.annotations.Param;

public interface MyTest {
    public void insertCustomer(@Param("customer") Customer customer);
}
