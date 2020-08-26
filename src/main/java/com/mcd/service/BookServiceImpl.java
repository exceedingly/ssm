package com.mcd.service;

import com.mcd.dao.BookDao;
import com.mcd.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {
    //组合Dao

    public BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    public int addBook(Books books) {
        return bookDao.addBook(books);
    }


    public int deleteBookByID(int id) {
        return bookDao.deleteBookByID(id);
    }


    public int updateBook(Books books) {
        return bookDao.updateBook(books);
    }


    public Books queryBookByID(int id) {
        return bookDao.queryBookByID(id);
    }


    public List<Books> queryAllBook() {
        return bookDao.queryAllBook();
    }
}
