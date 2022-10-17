package com.example.bsale.adapter.in.controller;

import com.example.bsale.adapter.in.dto.ProductResponse;
import com.example.bsale.domain.port.in.SearchUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/products")
public class ProductController {

    private SearchUseCase searchUseCase;

    public ProductController(SearchUseCase searchUseCase) {
        this.searchUseCase = searchUseCase;
    }

    @GetMapping(value = "/category/{idCategory}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Flux<ProductResponse> all(@PathVariable int idCategory) {
        return searchUseCase.findProducts(idCategory)
                .map(ProductResponse::from);
    }
}
