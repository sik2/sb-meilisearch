package com.ll.meilisearch.domain.post.post.entity;

import com.ll.meilisearch.global.jpa.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Getter
@Setter
@ToString(callSuper = true)
public class Post extends BaseEntity {
    private String subject;
    private String body;
}
