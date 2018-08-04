/**
 * 
 */
package day1;

public class User {
    //唯一值
    private int uid;
    private String userName;
    private String passWord;
    private String address;
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    @Override
    public String toString() {
        return "User [uid=" + uid + ", userName=" + userName + ", passWord=" + passWord + ", address=" + address + "]";
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
