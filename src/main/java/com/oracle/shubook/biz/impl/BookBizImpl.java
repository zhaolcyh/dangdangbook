package com.oracle.shubook.biz.impl;

import java.util.List;

import com.oracle.shubook.biz.BookBiz;
import com.oracle.shubook.dao.BookDao;
import com.oracle.shubook.dao.impl.BookDaoImpl;
import com.oracle.shubook.model.Book;

public class BookBizImpl implements BookBiz {

	@Override
	public boolean save(Book book) {
		BookDao bookDao = new BookDaoImpl();
		return bookDao.save(book);
	}

	@Override
	public List<Book> findAll(int currentPage,String name,int sid) {
		BookDao bookDao = new BookDaoImpl();
		return bookDao.findAll(currentPage,name,sid);
	}

	@Override
	public int totalRow(String name,int sid) {
		BookDao bookDao = new BookDaoImpl();
		return bookDao.total(name,sid);
	}


}
