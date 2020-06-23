package login.utils;

import java.sql.*;
import login.beans.Users;

public class DBUtils {

    public static Connection getConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/learning;databaseName=master", "wcy", "wcy");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void closeConnection(Connection con, PreparedStatement stat, ResultSet rs) {
        try {
            if (con != null) {
                con.close();
            }
            if (stat != null) {
                stat.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static Users getUser(String loginId) {
        Users user = null;
        Connection con = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            stat = con.prepareStatement("select * from USER where USER_ID=?");
            stat.setString(1, loginId);
            rs = stat.executeQuery();
            if (rs.next()) {
                user = new Users(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            closeConnection(con, stat, rs);
        }
        return user;
    }

    public static boolean verifyUser(String loginId) {
        Connection con = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        boolean exists = false;
        try {
            con = getConnection();
            stat = con.prepareStatement("select * from USERS where USER_ID=?");
            stat.setString(1, loginId);
            rs = stat.executeQuery();
            if (rs.next()) {
                exists = true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            closeConnection(con, stat, rs);
        }
        return exists;
    }

    public static boolean registerUsers(Users usr) {
        try {
            Connection con = getConnection();
            PreparedStatement stat = con.prepareStatement("insert into USERS values(?, ?, ?, ?, ?, ?)");
            stat.setString(1, usr.getLoginId());
            stat.setString(2, usr.getPassword());
            stat.setString(3, usr.getUserType());
            stat.setString(4, usr.getUserName());
            stat.setString(5, usr.getUserPhone());
            stat.setString(6, usr.getUserEmail());
            int ret = stat.executeUpdate();
            closeConnection(con, stat, null);
            if (ret > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean resetPassword(String loginId, String securityQuestion, String securityAnswer, String password) {
        try {
            Connection con = getConnection();
            PreparedStatement stat = con.prepareStatement("update USERS set Password=? where USER_ID=? ");
            stat.setString(1, password.trim());
            stat.setString(2, loginId.trim());
            int ret = stat.executeUpdate();
            closeConnection(con, stat, null);
            if (ret > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean authenticate(String loginId, String password) {
        Connection con = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        boolean exists = false;
        try {
            con = getConnection();
            stat = con.prepareStatement("select * from USERS where USER_ID=? and PASSWORD=?");
            stat.setString(1, loginId);
            stat.setString(2, password);
            rs = stat.executeQuery();
            if (rs.next()) {
                exists = true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            closeConnection(con, stat, rs);
        }
        return exists;
    }
}
