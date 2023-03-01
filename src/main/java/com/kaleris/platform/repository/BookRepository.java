package com.kaleris.platform.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaleris.platform.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
  List<Book> findByPublication(String publication);

  List<Book> findByTitleContaining(String title);
}
