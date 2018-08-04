/**
 * 
 */
package day3;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName:     User.java
 * @Description:   TODO(用一句话描述该文件做什么) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2018年8月4日 下午1:44:26 
 * @Place          北京航空航天大学中德软件联合研究所
 */
public class User {
    private Integer uid;
    private String name;
    private String password;
    private Set<Role> setRole = new HashSet();
    
    public Set<Role> getSetRole() {
        return setRole;
    }
    public void setSetRole(Set<Role> setRole) {
        this.setRole = setRole;
    }
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
