/**
 * 
 */
package day3;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName:     Role.java
 * @Description:   TODO(用一句话描述该文件做什么) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2018年8月4日 下午1:44:32 
 * @Place          北京航空航天大学中德软件联合研究所
 */
public class Role {
    private Integer rid;
    private String rName;
    private String memo;
    private Set<User> setUser = new HashSet();
    
    public Set<User> getSetUser() {
        return setUser;
    }
    public void setSetUser(Set<User> setUser) {
        this.setUser = setUser;
    }
    public Integer getRid() {
        return rid;
    }
    public void setRid(Integer rid) {
        this.rid = rid;
    }
    public String getrName() {
        return rName;
    }
    public void setrName(String rName) {
        this.rName = rName;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
}
