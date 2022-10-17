package com.example.bsale.adapter.out.adapter;

import com.example.bsale.adapter.out.repository.CategoryRepository;
import com.example.bsale.domain.port.out.CategoryPort;
import com.example.bsale.entity.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
@AllArgsConstructor(staticName = "of")
public class CategoryAdapter implements CategoryPort {

    private CategoryRepository repository;

    @Override
    public Flux<CategoryEntity> all() {
        return repository.findAll()
                .map(CategoryEntity::from)
                .doOnComplete(() ->
                        log.info("Success CategoryAdapter.all"))
                .doOnError(err ->
                        log.error("Error CategoryAdapter.all: ", err));
    }
}
