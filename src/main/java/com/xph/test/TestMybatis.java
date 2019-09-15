package com.xph.test;

import com.xph.bean.Account;
import com.xph.dao.IAccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    /**
     * 测试保存
     * @throws IOException
     */
    @Test
    public void test2() throws IOException {
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(132.35);
        // 加载配置文件
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        // 创建 SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 创建 sqlSession
        SqlSession session = factory.openSession();
        // 获取到代理对象
        IAccountDao accountDao = session.getMapper(IAccountDao.class);
        // 保存
        accountDao.saveAccount(account);
        // 提交事务
        session.commit();
        // 关闭资源
        session.close();
        is.close();
    }

    /**
     * 测试查询
     * @throws IOException
     */
    @Test
    public void test1() throws IOException {
        // 加载配置文件
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        // 创建 SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 创建 sqlSession
        SqlSession session = factory.openSession();
        // 获取到代理对象
        IAccountDao accountDao = session.getMapper(IAccountDao.class);
        // 查询所有数据
        List<Account> list = accountDao.findAll();
        list.forEach(i-> System.out.println(i));
        // 关闭资源
        session.close();
        is.close();
    }
}
