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

import day1.User;


public class CRUD {
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
        //根据id查询
//        User user=session.get(User.class, 1);
//        System.out.println(user.toString());
        //修改
//        User user=session.get(User.class, 1);
//        user.setUserName("xiaoluan");
//        session.update(user);
        //删除
        //第一种先查再删
        User user=session.get(User.class, 1);
        session.delete(user);
        //第二种新建对象去删除
        User u = new User();
        u.setUid(1);
        session.delete(u);
        //六提交事务
        transaction.commit();
        //关闭
        session.close();
        factory.close();
    }
}
