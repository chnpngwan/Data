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
import java.util.List;

/**
 * ProjectName:   MyBatis
 * PackageName:   org.example.test
 * ClassName:     MyBatisselectByConditionSingle
 * Description:  mybatis
 *
 * @Author: ChnpngWng
 * @Date: 2022/10/11 13:52
 */
public class MyBatisselectByConditionSingle {
    @Test
    public void testselectByConditionSingle() throws IOException {
        int status = 1;
        String brand_name = "huawei" ;
        String company_name = "HuaWei" ;

        //处理参数
        //brandName = "%" + brandName +"%";
        //companyName = "%" + companyName +"%";

        //封装对象
        Brand brand = new Brand();
        /*brand.setBrand_name(brand_name);
        brand.setCompany_name(company_name);
        brand.setStatus(status);*/
        //1、获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        List<Brand> brands = brandMapper.selectByConditionSingle(brand);
        System.out.println(brands);

        //5.释放资源
        sqlSession.close();
    }

}
