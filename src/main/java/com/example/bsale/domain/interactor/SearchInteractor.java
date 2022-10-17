package com.example.bsale.domain.interactor;

import com.example.bsale.adapter.in.dto.CategoryResponse;
import com.example.bsale.domain.port.in.SearchUseCase;
import com.example.bsale.domain.port.out.CategoryPort;
import com.example.bsale.domain.port.out.ProductPort;
import com.example.bsale.entity.CategoryEntity;
import com.example.bsale.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

import java.util.List;

@Slf4j
@AllArgsConstructor(staticName = "of")
public class SearchInteractor implements SearchUseCase {

    private CategoryPort categoryPort;
    private ProductPort productPort;

    @Override
    public Flux<CategoryEntity> allCategories() {
        return categoryPort.all()
                .doOnComplete(() ->
                        log.info("Success SearchInteractor.allCategories"))
                .doOnError(err ->
                        log.error("Error SearchInteractor.allCategories: ", err));
    }

    @Override
    public Flux<ProductEntity> findProducts(int idCategory) {
        return productPort.findByCatergory(idCategory)
                .doOnComplete(() ->
                        log.info("Success SearchInteractor.findProducts"))
                .doOnError(err ->
                        log.error("Error SearchInteractor.findProducts: ", err));
    }
}
