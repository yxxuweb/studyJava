package com.yxxu.mapper;

import com.yxxu.domain.Customer;

/**
 * namespace 必须和 Mapper接口类路径一致
 * id 必须和Mapper接口方法名一样
 * parameterType必须和接口方法参数类型一致
 * resultType必须和接口方法返回值类型一致
 */
public interface CustomerMapper {
    public Customer queryCustomerById(Integer id);
    public void insertCustom(Customer customer);
}
