package com.example.bsale.adapter.in.controller;

import com.example.bsale.adapter.in.dto.CategoryResponse;
import com.example.bsale.domain.port.in.SearchUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryContoller {

    private SearchUseCase searchUseCase;

    public CategoryContoller(SearchUseCase searchUseCase) {
        this.searchUseCase = searchUseCase;
    }

    @GetMapping(value = "/",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Flux<CategoryResponse> all() {
        return searchUseCase.allCategories()
                .map(CategoryResponse::from);
    }
}
