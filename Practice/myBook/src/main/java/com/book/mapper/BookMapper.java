package com.book.mapper;

import java.util.List;

import com.book.model.Book;

/**
 * @author ChnpngWng
 *
 * @date   Mar 6, 20238:46:04 PM
 */
public interface BookMapper {
	
	    // 全表查詢
		public List<Book> selectAll();

		// 单条数据查询
		public Book findById(int id);

		// 添加数据
		public boolean insert(Book book);

		// 修改数据
		public boolean update(Book book);

		// 删除数据
		public boolean delUserById(int id);

		// 模糊查询
		public List<Book> selectByName(String book);
}
