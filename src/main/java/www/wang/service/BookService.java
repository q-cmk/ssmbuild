package www.wang.service;

import www.wang.pojo.Books;

import java.util.List;

public interface BookService {
    //增
    int addBook(Books books);
    //删
    int deleteBookById( int id);
    //改
    int updateBook(Books books);
    //查
    Books queryBookById( int id);

    //查询全部的书
    List<Books> queryAllBook();
}
