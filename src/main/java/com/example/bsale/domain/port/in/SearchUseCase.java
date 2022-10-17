package com.example.bsale.domain.port.in;

import com.example.bsale.entity.CategoryEntity;
import com.example.bsale.entity.ProductEntity;
import reactor.core.publisher.Flux;

public interface SearchUseCase {

    Flux<CategoryEntity> allCategories();
    Flux<ProductEntity> findProducts(int idCategory);
}
