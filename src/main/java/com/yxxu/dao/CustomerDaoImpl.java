package com.yxxu.dao;

import com.yxxu.domain.Customer;
import com.yxxu.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public Customer getCustomerWithId(Integer id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Customer customer = sqlSession.selectOne("queryCustomerById", id);
        sqlSession.commit();
        MybatisUtil.closeSqlSession();
        return customer;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return null;
    }

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void updateCustomer(Customer customer) {

    }
}
