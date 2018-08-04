/**
 * 
 */
package day2;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;


public class uuidDemo {
    @Test
    public void testAdd() throws ClassNotFoundException, SQLException{
        //第一步加载配置文件
        Configuration cfg = new Configuration();
        cfg.configure();
        
        //创建SessionFactory对象 
        //在过程中会创建表
        
        SessionFactory factory = cfg.buildSessionFactory();
        //创建session对象
        Session session = factory.openSession();
        //四。开启事务
        Transaction transaction = session.beginTransaction(); 
        //五。具体逻辑
        User2 user = new User2();
        user.setUserName("xiaowang");
        user.setPassWord("123456");
        user.setAddress("buaa");;
        session.save(user);
        //六提交事务
        transaction.commit();
        //关闭
        session.close();
        factory.close();
    }
}
