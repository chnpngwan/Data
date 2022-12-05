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
 * ClassName:     Updata
 * Description:  update
 *
 * @Author: ChnpngWng
 * @Date: 2022/10/11 15:09
 */
public class Updata {
    @Test
    public void testupdate() throws IOException {
        int id = 6;
        int status = 1;
        String brand_name = "OPPOP" ;
        String company_name = "OPPOP" ;
        String description = "手机中的战斗机";
        int ordered = 100;

        //封装对象
        Brand brand = new Brand();
        brand.setId(id);
        brand.setBrand_name(brand_name);
        brand.setCompany_name(company_name);
        brand.setDescription(description);
        brand.setOrdered(ordered);
        brand.setStatus(status);
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
        int update = brandMapper.update(brand);
        System.out.println(update);

        //提交事务
        sqlSession.commit();

        //5.释放资源
        sqlSession.close();
    }

    @Test
    public void testupdate2() throws IOException {
        int id = 7;
        int status = 1;
        String brand_name = "OPPOP" ;
        String company_name = "OPPOP" ;
        String description = "手机中的战斗机";
        int ordered = 100;

        //封装对象
        Brand brand = new Brand();
        brand.setId(id);
        brand.setBrand_name(brand_name);
        brand.setCompany_name(company_name);
        brand.setDescription(description);
        brand.setOrdered(ordered);
        brand.setStatus(status);
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
        int update = brandMapper.update(brand);
        System.out.println(update);

        //提交事务
        sqlSession.commit();

        //5.释放资源
        sqlSession.close();
    }
}
