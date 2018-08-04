/**
 * 
 */
package day1;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;


public class Demo1 {
    
    @Test
    public void testAdd() throws ClassNotFoundException, SQLException{
        //第一步加载配置文件
        Configuration cfg = new Configuration();
        cfg.configure();
        //创建SessionFactory对象 
        //在过程中会创建表
        System.out.println("11111");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println("11111");
        //创建session对象
        Session session = factory.openSession();
        //四。开启事务
        Transaction transaction = session.beginTransaction(); 
        //五。具体逻辑
        User user = new User();
        user.setUserName("小王");
        user.setPassWord("123456");
        user.setAddress("北航");
        User user1 = new User();
        user1.setUserName("小张");
        user1.setPassWord("123456");
        user1.setAddress("北航2");
        session.save(user);
        session.save(user1);
        //六提交事务
        transaction.commit();
        //关闭
        session.close();
        factory.close();
    }
}
