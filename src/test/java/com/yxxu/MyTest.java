package com.yxxu;

import com.yxxu.dao.CustomerDaoImpl;
import com.yxxu.mapper.CustomerMapper;
import org.junit.Test;
import com.yxxu.domain.Customer;
import com.yxxu.utils.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

public class MyTest {
    @Test
    public void test() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        Customer customer = sqlSession.selectOne("queryCustomerById", 1);
        System.out.println(customer);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void test1() {
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        Customer customer = customerDao.getCustomerWithId(1);
        System.out.println(customer);
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = mapper.queryCustomerById(2);
//        sqlSession.commit();
        System.out.println(customer);
        MybatisUtil.closeSqlSession();
    }

}
