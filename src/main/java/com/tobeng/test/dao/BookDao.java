package com.tobeng.test.dao;

import com.tobeng.test.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface BookDao extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book>, Serializable {
}