package com.ps.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.ps.blog.entities.Comment;

public class PostDto {
	
    private Integer postId;
	
     private String title;
	
    private String content;
    
    private String imageName;
    
    private Date addedDate;
    
    private CategoryDto category;

	private UserDto user;
	
	// add the comment 	
	private Set<CommentDto> comments = new HashSet<>();
	
    
    public PostDto() {
    	
    }
    
    
	public Integer getPostId() {
		return postId;
	}


	public void setPostId(Integer postId) {
		this.postId = postId;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

	public String getContent() {
		return content;
	}
	

	public void setContent(String content) {
		this.content = content;
	}
	
	public String getImagename() {
		return imageName;
	}

	public void setImagename(String imageName) {
		this.imageName = imageName;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}


		    
}
