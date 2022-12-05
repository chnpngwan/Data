package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName:DeleteData
 * PackageName:Main
 * Description:
 *
 * @date:2022/5/11 22:46
 * @author: wangchunping
 */
public class DeleteData {
    //加载驱动
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //建立数据库链接
        try {
            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf8","root","123456");
            //书写sql语句
            String sql="delete from tb_user where id=3";
            //创建命令管理器
            PreparedStatement smt=connection.prepareStatement(sql);
            //执行sql语句
            smt.executeUpdate();
            //关闭数据库链接
            connection.close();
            System.out.println("数据删除完毕！");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
