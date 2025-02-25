package com.ll.meilisearch.domain.post.postDocument.service;

import com.ll.meilisearch.domain.post.post.dto.PostDto;
import com.ll.meilisearch.domain.post.postDocument.document.PostDocument;
import com.ll.meilisearch.domain.post.postDocument.repository.PostDocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostDocumentService {
    private final PostDocumentRepository postDocumentRepository;

    public void add(PostDto postDto) {
        PostDocument postDocument = new PostDocument(postDto);

        postDocumentRepository.save(postDocument);
    }

    public void clear() {
        postDocumentRepository.clear();
    }
}