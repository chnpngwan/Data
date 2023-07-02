package leaern_01.mapper;

import java.util.List;

import leaern_01.model.Book;

/**
 * @author ChnpngWng
 *
 * @date   Feb 28, 20231:16:12 PM
 */
public interface User {
	//创建全表查询的抽象方法
	public List<Book> select();
}
