package com.example.bsale.adapter.out.repository;

import com.example.bsale.adapter.out.model.ProductModel;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveSortingRepository<ProductModel, Integer> {

    @Query("select p.id, p.name, p.url_image, p.price, p.discount from product p  where p.category = :idCategory")
    Flux<ProductModel> findByCategory(int idCategory);
}
