package com.osaka_software.authentication.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {
    public List<Post> findAll();

    public Post save(Post post);
}
