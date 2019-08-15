package com.tobeng.test.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.tobeng.test.dao.BookDao;
import com.tobeng.test.dto.BookDTO;
import com.tobeng.test.entity.Book;
import com.tobeng.test.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 书籍 service 实现类
 *
 * @author yaorui
 * @version 1.0
 * @date 2019-08-15 15:18
 **/
@Service
@Transactional(rollbackFor = Exception.class)
@Slf4j
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Book saveBook(BookDTO bookDTO) {
        Book book = new Book();
        BeanUtil.copyProperties(bookDTO, book);
        return bookDao.saveAndFlush(book);
    }
}
