package com.w.java517;
import java.sql.*;
/**
 * ClassName:DBUtile
 * PackageName:com.w.java517
 * Description:
 *
 * @date:2022/5/17 10:36
 * @author: wangchunping
 */
public class DBUtile {
    static final String Driver ="com.mysql.jdbc.Driver";
    static final String url="jdbc.mysql://localhost:3306/blog?useUnicode=true&characterEncoding=utf8";
    static final String user="root";
    static final String password="1234546";

    static {
        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void closeConnection(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        try {
            if(connection!=null){
                connection.close();
            }
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (resultSet!=null){
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(DBUtile.getConnection());
    }
}
