package com.example.bsale.adapter.out.adapter;

import com.example.bsale.adapter.out.repository.ProductRepository;
import com.example.bsale.domain.port.out.ProductPort;
import com.example.bsale.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
@AllArgsConstructor(staticName = "of")
public class ProductAdapter implements ProductPort {

    private ProductRepository productRepository;

    @Override
    public Flux<ProductEntity> findByCatergory(int idCategory) {
        return productRepository.findByCategory(idCategory)
                .map(ProductEntity::from)
                .doOnComplete(() ->
                        log.info("Success ProductAdapter.findByCatergory"))
                .doOnError(err ->
                        log.error("Error ProductAdapter.findByCatergory: ", err));
    }
}
