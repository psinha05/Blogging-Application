package com.ps.blog.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.ps.blog.entities.Comment;
import com.ps.blog.entities.Post;
import com.ps.blog.exceptions.ResourceNotFoundException;
import com.ps.blog.payloads.CommentDto;
import com.ps.blog.repositories.CommentRepo;
import com.ps.blog.repositories.PostRepo;
import com.ps.blog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private PostRepo postRepo;

	@Autowired
	private CommentRepo commentRepo;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		
		Post post = this.postRepo.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "post id ", postId));

		Comment comment = this.modelMapper.map(commentDto, Comment.class);

		comment.setPost(post);

		Comment savedComment = this.commentRepo.save(comment);

		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
	Comment com = this.commentRepo.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment", "CommentId", commentId));
		this.commentRepo.delete(com);
		
	}

}
