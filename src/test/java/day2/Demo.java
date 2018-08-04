/**
 * 
 */
package day2;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Test;

import day1.User;

/**
 * @ClassName:     Demo.java
 * @Description:   TODO(用一句话描述该文件做什么) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2018年8月3日 下午2:55:26 
 * @Place          北京航空航天大学中德软件联合研究所
 */
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
            //TODO
            //Query,参数为hql语句
//            Query query = session.createQuery("from User");
//            List<User> list = query.list();
//            for(User u: list)
//                System.out.println(u.toString());
            //Criteria
//            Criteria criteria = session.createCriteria(User.class);
//            List<User> list = criteria.list();
//          for(User u: list)
//              System.out.println(u.toString());
            SQLQuery sqlQuery = session.createSQLQuery("select * from t_user");
            List<Object[]> list = sqlQuery.list();
            for(Object[] u: list)
                System.out.println(Arrays.toString(u));
            transaction.commit();
        }catch (Exception e) {
         transaction.rollback();  
        }finally {
            //session.close();
            sf.close();
        }
        
    }
}
