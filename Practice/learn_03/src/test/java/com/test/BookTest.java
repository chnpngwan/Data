package com.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.book.mapper.BookMapper;
import com.book.model.Book;
import com.book.test.MybatisUtil;

/**
 * @author ChnpngWng
 *
 * @date   Mar 7, 20237:29:23 PM
 */
public class BookTest {
	public static void main(String[] args) throws IOException {
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

}
