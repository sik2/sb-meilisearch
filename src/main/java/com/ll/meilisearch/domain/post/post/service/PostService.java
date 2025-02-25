package com.ll.meilisearch.domain.post.post.service;

import com.ll.meilisearch.domain.post.post.entity.Post;
import com.ll.meilisearch.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public Post write(String subject, String body) {
        Post post = postRepository.save(
                Post.builder()
                        .subject(subject)
                        .body(body)
                        .build());

        return post;
    }

    public long count() {
        return postRepository.count();
    }
}