package com.tek.springbootdata.dao;

import org.springframework.data.repository.CrudRepository;

import com.tek.springbootdata.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
