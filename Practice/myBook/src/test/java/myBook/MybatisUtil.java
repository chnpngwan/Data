package myBook;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author ChnpngWng
 *
 * @date   Mar 6, 20238:51:50 PM
 */
public class MybatisUtil {
	public static SqlSession init() throws IOException {
		//1.mybatis核心配置文件的路径
		String resource = "mybatis-config.xml";
		//2.读取核心配置文件
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//3.构建SqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//4.从SqlSessionFactory中获取SqlSession对象
		SqlSession session = sqlSessionFactory.openSession();
		return session;
	}
}
