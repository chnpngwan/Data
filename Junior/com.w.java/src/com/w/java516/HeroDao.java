package com.w.java516;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName:HeroDao
 * PackageName:com.w.java516
 * Description:
 *
 * @date:2022/5/16 19:54
 * @author: wangchunping
 */
public class HeroDao {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/blog?useUnicode=true&characterEncoding=utf8", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //添加英雄
    public int addHero(Hero hero) {
        Connection connection = getConnection();
        String sql = "insert into t_hero values(0,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, hero.getNum());
            preparedStatement.setString(2, hero.getName());
            preparedStatement.setInt(3, hero.getOutput());
            preparedStatement.setInt(4, hero.getAttackPower());
            preparedStatement.setInt(5, hero.getMagicValue());
            preparedStatement.setString(6, hero.getType());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return 0;
        }
    }
        //删除英雄
        public int deleteHero(int id){
            Connection connection = getConnection();
            String sql = "delete from t_hero where id=?";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,id);
                return preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return 0;
            }
        }
    //修改英雄
    public int updateHero(Hero hero){

        Connection connection = getConnection();
        String sql = "update t_hero set num=?,name=?,output=?,attackPower=?,magicValue=?," +
                "type=? where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, hero.getNum());
            preparedStatement.setString(2, hero.getName());
            preparedStatement.setInt(3, hero.getOutput());
            preparedStatement.setInt(4, hero.getAttackPower());
            preparedStatement.setInt(5, hero.getMagicValue());
            preparedStatement.setString(6, hero.getType());
            preparedStatement.setInt(7,hero.getId());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return 0;
        }
    }
}
