package org.example.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.BrandMapper;
import org.example.pojo.Brand;
import org.junit.Test;

/**
 * @Description
 * @author ChnpngWng
 * @date 2022年10月9日下午6:52:36
 *
 */
public class SelectByCondition {
	@Test
    public void testSelectByCondition() throws IOException {
        //接受参数
        /*int status = 1;
        String brand_name = "huawei" ;
        String company_name = "HuaWei" ;*/

        //处理参数
        //brandName = "%" + brandName +"%";
        //companyName = "%" + companyName +"%";

        //封装对象
        /*Brand brand = new Brand();
        brand.setBrand_name(brandName);
        brand.setCompany_name(companyName);
        brand.setStatus(status);*/

        Map map = new HashMap();
        map.put("status",1);
        map.put("brandName","huawei");
        map.put("companyName","HuaWei");
        if(map == null) {
            System.out.println("map is null");
        }
        System.out.println("inputStream is not null");

        //1、获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        if(inputStream == null) {
            System.out.println("inputStream is null");
        }
        System.out.println("inputStream is not null");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        if(sqlSessionFactory == null) {
            System.out.println("sqlSessionFactory is null");
        }
        System.out.println("sqlSessionFactory is not null");

        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        if(sqlSession == null) {
            System.out.println("sqlSession is null");
        }
        System.out.println("sqlSession is not null");

        //3.获取Mapper接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        if(brandMapper == null) {
            System.out.println("brandMapper is null");
        }
        System.out.println("brandMapper is not null");

        //4.执行方法
//        List<Brand> brands = brandMapper.selectByCondition(1, "华为","华为");
//        List<Brand> brands = brandMapper.selectByCondition(brand);
        List<Brand> brands = brandMapper.selectByCondition(map);
        System.out.println(brands);

        //5.释放资源
        sqlSession.close();
    }
}
