package com.ll.meilisearch.global.initData;

import com.ll.meilisearch.domain.post.post.service.PostService;
import com.ll.meilisearch.domain.post.postDocument.service.PostDocumentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

@Profile("!prod")
@Configuration
@RequiredArgsConstructor
@Slf4j
public class InitData {
    @Autowired
    @Lazy
    private InitData self;
    private final PostService postService;
    private final PostDocumentService postDocumentService;

    @Bean
    public ApplicationRunner initNotProd() {
        return args -> {
            if (postService.count() > 0) return;

            self.work1();
        };
    }


    @Transactional
    public void work1() {
        postDocumentService.clear();
        postService.write("subject1", "body1");
        postService.write("subject2", "body2");
        postService.write("subject3", "body3");
    }
}
