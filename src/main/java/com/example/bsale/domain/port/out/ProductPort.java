package com.example.bsale.domain.port.out;

import com.example.bsale.entity.ProductEntity;
import reactor.core.publisher.Flux;

public interface ProductPort {

    Flux<ProductEntity> findByCatergory(int idCategory);
}
