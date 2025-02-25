package com.ll.meilisearch.domain.post.post.event;

import com.ll.meilisearch.domain.post.post.dto.PostDto;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class AfterPostCreatedEvent extends ApplicationEvent {
    @Getter
    private final PostDto postDto;

    public AfterPostCreatedEvent(Object source, PostDto postDto) {
        super(source);
        this.postDto = postDto;
    }
}
