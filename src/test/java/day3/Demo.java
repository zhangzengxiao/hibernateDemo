/**
 * 
 */
package day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Test;


public class Demo {
    @Test
    public void testTransaction(){
        Configuration cfg=null;
        SessionFactory sf=null;
        Session session = null;
        Transaction transaction = null;
        try{
            cfg = new Configuration().configure();
            sf=cfg.buildSessionFactory();
            session=sf.getCurrentSession();
            transaction=session.beginTransaction();
            //TODO一对多保存
//            Custom custom = new Custom();
//            custom.setCustName("tx");
//            custom.setCustLevel("vip");
//            custom.setCustSource("net");
//            custom.setCustMobile("333");
//            custom.setCustPhone("999");
//            
//            LinkMan man = new LinkMan();
//            man.setLkm_gender("man");
//            man.setLkm_name("xiaowang");
//            man.setLkm_phone("110");
//            //在一中表示多，多中表示一，建立关系
//            custom.getSet().add(man);
//            //保存
//            session.save(custom);
            //修改
//            Custom baidu = session.get(Custom.class, 2);
//            LinkMan man = session.get(LinkMan.class,1);
//            
//            baidu.getSet().add(man);
            //多对多保存
            User user1 = new User();
            user1.setName("lucy");
            user1.setPassword("123");
            User user2 = new User();
            user2.setName("mary");
            user2.setPassword("456");
            
            Role role1 = new Role();
            role1.setrName("ji");
            Role role2 = new Role();
            role2.setrName("ya");
            Role role3 = new Role();
            role3.setrName("gay");
            //建立关系
            user1.getSetRole().add(role1);
            user1.getSetRole().add(role2);
            user2.getSetRole().add(role2);
            user2.getSetRole().add(role3);
            session.save(user1);
            session.save(user2);
            
            transaction.commit();
        }catch (Exception e) {
         transaction.rollback();  
        }finally {
            //session.close();
            sf.close();
        }
        
    }
}
