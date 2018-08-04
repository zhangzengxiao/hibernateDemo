/**
 * 
 */
package day3;

import java.util.HashSet;
import java.util.Set;

public class Custom {
    private Integer cid;
    private String custName;
    private String custLevel;
    private String custSource;
    private String custPhone;
    private String custMobile;
    //表示多个联系人,hibernate要求使用set集合
    private Set<LinkMan> set = new HashSet();
    public Set<LinkMan> getSet() {
        return set;
    }
    public void setSet(Set<LinkMan> set) {
        this.set = set;
    }
    public Integer getCid() {
        return cid;
    }
    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustLevel() {
        return custLevel;
    }
    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }
    public String getCustSource() {
        return custSource;
    }
    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }
    public String getCustPhone() {
        return custPhone;
    }
    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
    public String getCustMobile() {
        return custMobile;
    }
    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }
}
