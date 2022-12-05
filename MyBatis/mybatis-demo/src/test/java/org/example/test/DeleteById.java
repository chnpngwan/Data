package org.example.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.BrandMapper;
import org.example.pojo.Brand;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * ProjectName:   MyBatis
 * PackageName:   org.example.test
 * ClassName:     DeleteById
 * Description:  delete
 *
 * @Author: ChnpngWng
 * @Date: 2022/10/11 19:52
 */
public class DeleteById {
    @Test
    public void testdelByIdAfters() throws IOException {
        int id = 7;
        /*int status = 1;
        String brand_name = "OPPOP" ;
        String company_name = "OPPOP" ;
        String description = "手机中的战斗机";
        int ordered = 100;*/

        //1、获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlSession
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //自动提交事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //3.获取Mapper接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        brandMapper.delByIdAfter(id);

        //提交事务
        sqlSession.commit();

        //5.释放资源
        sqlSession.close();
    }

    @Test
    public void testdelByIdAfter() throws IOException {
        int[] ids = {9};
        /*int status = 1;
        String brand_name = "OPPOP" ;
        String company_name = "OPPOP" ;
        String description = "手机中的战斗机";
        int ordered = 100;*/

        //1、获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlSession
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //自动提交事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //3.获取Mapper接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        brandMapper.deleteByIdAfters(ids);

        //提交事务
        sqlSession.commit();

        //5.释放资源
        sqlSession.close();
    }
}
