package leaern_01.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import leaern_01.mapper.User;

/**
 * @author ChnpngWng
 *
 * @date   Feb 28, 20231:25:12 PM
 */
public class UserTest {
	@Test
	public void selectAll() throws IOException {
	//核心配置文件mybatis-config.xml的读取路径
	String resource = "mybatis-config.xml";
	//通过字节流读取文件
	InputStream inputStream = Resources.getResourceAsStream(resource);
	//构建sqlSessionFactory对象
	SqlSessionFactory sf= new SqlSessionFactoryBuilder().build(inputStream);
	//构建sqlSession对象
	SqlSession session = sf.openSession();
	//调用查询方法
	List<User> list = session.selectList("select");
	//输出
	System.out.println(list);
	//关闭流
	session.close();
	}
}
