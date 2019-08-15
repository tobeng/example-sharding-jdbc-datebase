package com.tobeng.test.service;

import com.tobeng.test.dto.BookDTO;
import com.tobeng.test.entity.Book;

/**
 * 书籍 service
 *
 * @author yaorui
 * @version 1.0
 * @date 2019-08-15 15:16
 **/
public interface BookService {

    Book saveBook(BookDTO bookDTO);

}
