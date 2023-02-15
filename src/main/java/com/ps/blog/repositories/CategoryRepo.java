package com.ps.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ps.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
