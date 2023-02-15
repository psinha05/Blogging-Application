package com.ps.blog.services;

import java.util.List;

import com.ps.blog.entities.Category;
import com.ps.blog.entities.Post;
import com.ps.blog.payloads.PostDto;
import com.ps.blog.payloads.ApiResponse;

public interface PostService {
	
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	void deletePost(Integer postId);
	
	//List<PostDto> getAllPost();
	
	List<PostDto> getAllPost(Integer pageNumber, Integer pageSize);
	
	PostDto getPostById(Integer postId);
	
	//List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all posts by category
	
		List<PostDto> getPostsByCategory(Integer categoryId);
	
	//List<PostDto> getPostByUser(Integer userId);
	
	List<PostDto> searchByTitle(String keyword);
	
	
	//get all posts by user
		List<PostDto> getPostsByUser(Integer userId);
	
	

}
