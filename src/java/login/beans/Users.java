package login.beans;
public class Users {
    private String loginId;
    private String password;
    private String userType;
    private String userName;
    private String userEmail;
    private String userPhone;
 
    public Users(String loginId, String password,String userType,String userName, String userEmail, String userPhone) {
        this.loginId = loginId;
        this.password = password;
        this.userType = userType;
        this.userName = userName;
        this.userEmail=userEmail;
        this.userPhone = userPhone;
        
    }
    public String getLoginId() {
        return loginId;
    }
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
