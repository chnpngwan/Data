package org.example.mapper;


import org.apache.ibatis.annotations.Param;
import org.example.pojo.Brand;

import java.util.List;
import java.util.Map;

/**
 * ProjectName:   MyBatis
 * PackageName:   org.example.mapper
 * ClassName:     UserMapper
 * Description:  mybatis
 *
 * @Author: ChnpngWng
 * @Date: 2022/10/9 11:55
 */
public interface BrandMapper {
//    查询所有
    public List<Brand> selectAll();
    /*
    * 查看详情：根据ID
    * */
    Brand selectById(int id);

    /**
     * 条件查询
     *  * 参数接收
     *      1. 散装参数：如果方法中有多个参数，需要使用@Param("SQL参数占位符名称")
     *      2. 对象参数:对象的属性名称要和参数占位符名称一致
     *      3. map集合参数
     *
     */

     /*public List<Brand> selectByCondition(@Param("status") int status,
                                  @Param("brandName") String brandName,
                                  @Param("companyName") String companyName);*/
/*
    List<Brand> selectByCondition(Brand brand);
*/
    List<Brand> selectByCondition(Map map);
    /**
     * 单条件动态查询
     * @param brand
     * @return
     */
    List<Brand> selectByConditionSingle(Brand brand);

    /*
     * 添加
     * */
    void add(Brand brand);

    /*
    * 修改
    * */
    int update(Brand brand);

    /*
     * 根据ID删除
     * */
    void delByIdAfter(int id);

    /*
    * 批量删除
    * */
    /*void deleteByIdAfters(@Param("ids") int [] ids);*/
    void deleteByIdAfters(int [] ids);
}
