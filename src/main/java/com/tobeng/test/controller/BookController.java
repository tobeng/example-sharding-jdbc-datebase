package com.tobeng.test.controller;

import com.tobeng.test.dto.BookDTO;
import com.tobeng.test.dto.UserDTO;
import com.tobeng.test.entity.Book;
import com.tobeng.test.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 书籍 controller
 *
 * @author yaorui
 * @version 1.0
 * @date 2019-08-15 15:20
 **/
@RestController
@RequestMapping("/book")
@Slf4j
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book save(@RequestBody BookDTO bookDTO){
        return bookService.saveBook(bookDTO);
    }

}
