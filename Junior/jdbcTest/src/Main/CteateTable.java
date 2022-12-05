package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName:test
 * PackageName:Main
 * Description:
 *
 * @date:2022/5/11 22:05
 * @author: wangchunping
 */
//创建表
public class CteateTable {
    /* jdbc创建表的基本步骤：
     * 1、加载驱动
     * 2、建立数据库链接
     * 3、书写sql语句
     * 4、创建命令管理器
     * 5、执行sql语句
     * 6、关闭数据库链接
     */
    //加载驱动
    static {
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
    } catch(
    ClassNotFoundException e)
    {
        e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //		2、建立数据库链接:getConnection("数据库的访问路径","数据库用户名","数据库密码")
        //建立数据库链接
        try {
            Connection connection=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf8","root","123456");
            //书写sql语句
            String sql = "create table tb_user(\r\n"
                    + "id int primary key auto_increment,\r\n"
                    + "name varchar(20) not null,\r\n"
                    + "password varchar(15) not null,\r\n"
                    + "tel varchar(11) not null\r\n"
                    + ")";
            //创建命令管理器
            PreparedStatement s=connection.prepareStatement(sql);
            //执行sql语句
            s.executeUpdate();
            //关闭数据库链接
            connection.close();
            System.out.println("添加成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
