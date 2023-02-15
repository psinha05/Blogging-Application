package com.ps.blog.controllers;

import java.util.List;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.hibernate.engine.jdbc.StreamUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestParam;

import com.ps.blog.config.AppConstants;
import com.ps.blog.entities.Post;
import com.ps.blog.payloads.ApiResponse;
import com.ps.blog.payloads.PostDto;
import com.ps.blog.services.FileService;
import com.ps.blog.services.PostService;

@RestController
@RequestMapping("/api/")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private FileService fileService;

	@Value("${project.image}")
	private String path;

	@PostMapping("/user/{userId}/category/{categoryId}/posts")
	 public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto,
			 @PathVariable Integer userId,
			 @PathVariable Integer categoryId) {
		
		 PostDto createPost= this.postService.createPost(postDto, userId, categoryId);		
		return new ResponseEntity<PostDto>(createPost, HttpStatus.CREATED);
		 
	 }
	
	// get by user

		@GetMapping("/user/{userId}/posts")
		public ResponseEntity<List<PostDto>> getPostsByUser(@PathVariable Integer userId) {

			List<PostDto> posts = this.postService.getPostsByUser(userId);
			return new ResponseEntity<List<PostDto>>(posts, HttpStatus.OK);

		}
	
		// get by category

		@GetMapping("/category/{categoryId}/posts")
		public ResponseEntity<List<PostDto>> getPostsByCategory(@PathVariable Integer categoryId) {

			List<PostDto> posts = this.postService.getPostsByCategory(categoryId);
			return new ResponseEntity<List<PostDto>>(posts, HttpStatus.OK);

		}
		
		
		/*
		 * @GetMapping("/posts") public ResponseEntity<List<PostDto>> getAllPost() {
		 * List<PostDto> getAllPost = this.postService.getAllPost(); return new
		 * ResponseEntity<List<PostDto>>(getAllPost, HttpStatus.OK); }
		 */
		
		@GetMapping("/posts")
		public ResponseEntity<List<PostDto>> getAllPost(
				@RequestParam(value = "pageNumber", defaultValue = AppConstants.PAGE_NUMBER, required = false) Integer pageNumber,
				@RequestParam(value = "pageSize", defaultValue = AppConstants.PAGE_SIZE, required = false) Integer pageSize) {

			List<PostDto> allPost = this.postService.getAllPost(pageNumber, pageSize);
			return new ResponseEntity<List<PostDto>>(allPost, HttpStatus.OK);
		}
		
		
		// get post details by id

		@GetMapping("/posts/{postId}")
		public ResponseEntity<PostDto> getPostById(@PathVariable Integer postId) {

			PostDto postDto = this.postService.getPostById(postId);
			return new ResponseEntity<PostDto>(postDto, HttpStatus.OK);

		}
		
		// delete post
		@DeleteMapping("/posts/{postId}")
		public ApiResponse deletePost(@PathVariable Integer postId) {
			this.postService.deletePost(postId);
			return new ApiResponse("Post is successfully deleted !!", true);
		}
		
		
		@PutMapping("/posts/{postId}")
		public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto, @PathVariable Integer postId) {

			PostDto updatePost = this.postService.updatePost(postDto, postId);
			return new ResponseEntity<PostDto>(updatePost, HttpStatus.OK);

		}
		
	
		@GetMapping("/posts/search/{keywords}")
		public ResponseEntity<List<PostDto>> searchPost(@PathVariable("keywords") String keywords) {
			List<PostDto> searchPost = this.postService.searchByTitle(keywords);
			return new ResponseEntity<List<PostDto>>(searchPost, HttpStatus.OK);

		}
		
		
		// post image upload

		@PostMapping("/post/image/upload/{postId}")
		public ResponseEntity<PostDto> uploadPostImage(@RequestParam("image") MultipartFile image,
				@PathVariable Integer postId) throws IOException {

			PostDto postDto = this.postService.getPostById(postId);
			
			String fileName = this.fileService.uploadImage(path, image);
			postDto.setImagename(fileName);
			PostDto updatePost = this.postService.updatePost(postDto, postId);
			return new ResponseEntity<PostDto>(updatePost, HttpStatus.OK);

		}
		
		//method to serve files
	    @GetMapping(value = "/post/image/{imageName}",produces = MediaType.IMAGE_JPEG_VALUE)
	    public void downloadImage(@PathVariable("imageName") String imageName,
	            HttpServletResponse response) throws IOException {

	        InputStream resource = this.fileService.getResource(path, imageName);
	        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
	        StreamUtils.copy(resource,response.getOutputStream())   ;

	    }
		
		
	
}
