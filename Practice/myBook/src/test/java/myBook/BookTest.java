package myBook;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.book.mapper.BookMapper;
import com.book.model.Book;

/**
 * @author ChnpngWng
 *
 * @date   Mar 7, 20237:33:56 PM
 */
public class BookTest {
	@Test
	public void all() throws IOException {
		//1.获取sqlSession对象
		SqlSession session = MybatisUtil.init();
		//2.获取UserMapper对象
		BookMapper bookMapper = session.getMapper(BookMapper.class);
		//3.调用方法
		List<Book> list = bookMapper.selectAll();
		for (Book book : list) {
			System.out.println(book);
			}
		//4.关闭流
		session.close();
	}
	@Test
	void findById() throws IOException {
		//1.获取sqlSession对象
		SqlSession session = MybatisUtil.init();
		//2.获取UserMapper对象
		BookMapper bookMapper = session.getMapper(BookMapper.class);
		//3.调用方法
		Book book = bookMapper.findById(2);
		System.out.println(book);
		//4.关闭流
		session.close();
	}
	@Test
	void insert() throws IOException {
		//1.获取sqlSession对象
		SqlSession session = MybatisUtil.init();
		//2.获取UserMapper对象
		BookMapper bookMapper = session.getMapper(BookMapper.class);
		//3.调用方法
		Book book = new Book(1, "haha", "test", 10.0, "tyujhb");
		boolean flag = bookMapper.insert(book);
		if (flag) {
			System.out.println("数据添加成功");
		}else {
			System.out.println("数据添加失败");
		}
		//4.提交事务
		session.commit();
		//5.关闭流
		session.close();
	}
	
	@Test
	public void updateInfo() throws IOException {
		//1.获取sqlSession对象
		SqlSession session = MybatisUtil.init();
		//2.获取UserMapper对象
		BookMapper bookMapper = session.getMapper(BookMapper.class);
		//3.调用方法
		Book book = new Book(1, "haha", "test", 10.0, "yuop;j");
		boolean flag = bookMapper.update(book);
		if (flag) {
			System.out.println("数据修改成功");
		}else {
			System.out.println("数据修改失败");
		}
		//4.提交事务
		session.commit();
		//5.关闭流
		session.close();
	}
	@Test
	public void delById() throws IOException {
		//1.获取sqlSession对象
		SqlSession session = MybatisUtil.init();
		//2.获取UserMapper对象
		BookMapper bookMapper = session.getMapper(BookMapper.class);
		//3.调用方法
		boolean flag =bookMapper.delUserById(2);
		if (flag) {
			System.out.println("数据删除成功");
		}else {
			System.out.println("数据删除失败");
		}
		//4.提交事务
		session.commit();
		//5.关闭流
		session.close();
	}
	@Test
	public void findBYName() throws IOException {
		//1.获取sqlSession对象
		SqlSession session = MybatisUtil.init();
		//2.获取UserMapper对象
		BookMapper bookMapper = session.getMapper(BookMapper.class);
		//3.调用方法
		List<Book> list = bookMapper.selectByName("三体");
		for (Book book : list) {
			System.out.println(book);
		}
		//4.关闭流
		session.close();
	}
}
