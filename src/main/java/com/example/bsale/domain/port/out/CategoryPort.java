package com.example.bsale.domain.port.out;

import com.example.bsale.entity.CategoryEntity;
import reactor.core.publisher.Flux;

public interface CategoryPort {

    Flux<CategoryEntity> all();
}
