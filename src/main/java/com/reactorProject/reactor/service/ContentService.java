package com.reactorProject.reactor.service;

import com.reactorProject.reactor.entity.Content;
import com.reactorProject.reactor.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;

    public Flux<Content> findContentByUserId(long userId) {
        return contentRepository.findByIdUser(userId);
    }

}
