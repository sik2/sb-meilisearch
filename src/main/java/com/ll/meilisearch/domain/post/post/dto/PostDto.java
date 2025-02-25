package com.ll.meilisearch.domain.post.post.dto;

import com.ll.meilisearch.domain.post.post.entity.Post;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDateTime;

@Getter
public class PostDto {
    @NonNull
    private long id;
    @NonNull
    private LocalDateTime createDate;
    @NonNull
    private LocalDateTime modifyDate;
    @NonNull
    private String subject;
    @NonNull
    private String body;

    public PostDto(Post post) {
        this.id = post.getId();
        this.createDate = post.getCreatedDate();
        this.modifyDate = post.getModifiedDate();
        this.subject = post.getSubject();
        this.body = post.getBody();
    }
}
