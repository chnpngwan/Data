package org.example.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.BrandMapper;
import org.example.mapper.UserMapper;
import org.example.pojo.Brand;
import org.example.pojo.User;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ProjectName:   MyBatis
 * PackageName:   org.example.test
 * ClassName:     MyBatisSelect
 * Description:  mybatisTest
 *
 * @Author: ChnpngWng
 * @Date: 2022/10/9 12:21
 */
public class MyBatisSelect {
    @Test
    public void testSelectAll() throws IOException {
        //1、获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);

        //5.释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectByID() throws IOException {
        //接受参数
        int id = 1;
        //1、获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        Brand brand = brandMapper.selectById(id);
        System.out.println(brand);

        //5.释放资源
        sqlSession.close();
    }

//    @Test
//    public void testSelectByCondition() throws IOException {
//        //接受参数
//        int status = 1;
//        String brandName = "华为" ;
//        String companyName = "华为技术有限公司" ;
//
//        //处理参数
//        //brandName = "%" + brandName +"%";
//        //companyName = "%" + companyName +"%";
//        //1、获取SqlSessionFactory
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        //2.获取sqlSession
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        //3.获取Mapper接口代理对象
//        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
//
//        //4.执行方法
//        List<Brand> brands = brandMapper.selectByCondition(1, "华为","华为");
//        System.out.println(brands);
//
//        //5.释放资源
//        sqlSession.close();
//    }
}
