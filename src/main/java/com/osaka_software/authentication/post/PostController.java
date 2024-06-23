package com.osaka_software.authentication.post;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("")
    public List<Post> index() {
        return postRepository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Post create(@RequestBody Post post) {
        return postRepository.save(post);
    }
}
