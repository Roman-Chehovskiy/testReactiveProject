package com.reactorProject.reactor.controller;

import com.reactorProject.reactor.entity.Content;
import com.reactorProject.reactor.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds= 10)
public class MyController {

    @Autowired
    private ContentService contentService;

    @GetMapping("/contents/{userId}")
    public Flux<Content> getContentByUserId(@PathVariable("userId") long userId) {
        return contentService.findContentByUserId(userId);
    }

}
