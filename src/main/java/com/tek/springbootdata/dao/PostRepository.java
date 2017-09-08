package com.tek.springbootdata.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tek.springbootdata.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

	/*
	 * I will return the last post that was created.
	 */
	Post findFirstByOrderByPostedOnDesc();

	List<Post> findAllByOrderByPostedOnDesc();

	Post findBySlug(String slug);

}
