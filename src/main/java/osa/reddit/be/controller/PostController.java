package osa.reddit.be.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import osa.reddit.be.dto.PostDTO;
import osa.reddit.be.model.Post;
import osa.reddit.be.service.PostService;

@RestController
@RequestMapping(value = "/post")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping
	public ResponseEntity<List<PostDTO>> getAll(){ 
		return new ResponseEntity<List<PostDTO>>(postService.getAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PostDTO> get(@PathVariable("id") Integer id){
		Post post = postService.get(id);
		if(post == null) {
			return new ResponseEntity<PostDTO>(HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<PostDTO>(postService.convertToDTO(post), HttpStatus.OK);
		}
	}
	
	@PostMapping
	public ResponseEntity<PostDTO> create(@RequestBody PostDTO postDTO){
		Post post = postService.create(postDTO);
		if (post == null) {
			return new ResponseEntity<PostDTO>(HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<PostDTO>(postService.convertToDTO(post), HttpStatus.OK);
		}
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<PostDTO> update(@RequestBody PostDTO postDTO, @PathVariable("id") Integer id){
		Post post = postService.get(id);
		if(post == null) {
			return new ResponseEntity<PostDTO>(HttpStatus.BAD_REQUEST);
		}
		post = postService.update(postDTO);
		return new ResponseEntity<PostDTO>(postService.convertToDTO(post), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		Post post = postService.get(id);
		if (post == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			postService.delete(post);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}