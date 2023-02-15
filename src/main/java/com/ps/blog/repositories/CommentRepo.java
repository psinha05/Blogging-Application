package com.ps.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ps.blog.entities.Comment;


public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}