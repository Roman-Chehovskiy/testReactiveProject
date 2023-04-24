package com.reactorProject.reactor.repository;

import com.reactorProject.reactor.entity.Content;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ContentRepository extends ReactiveCrudRepository<Content, Long> {

     Flux<Content> findByIdUser(long userId);

}
