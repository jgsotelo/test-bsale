package com.example.bsale.application.dependency;

import com.example.bsale.adapter.out.adapter.CategoryAdapter;
import com.example.bsale.adapter.out.adapter.ProductAdapter;
import com.example.bsale.adapter.out.repository.CategoryRepository;
import com.example.bsale.adapter.out.repository.ProductRepository;
import com.example.bsale.domain.interactor.SearchInteractor;
import com.example.bsale.domain.port.in.SearchUseCase;
import com.example.bsale.domain.port.out.CategoryPort;
import com.example.bsale.domain.port.out.ProductPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScanConfig {

    @Bean
    public SearchUseCase searchUseCase(CategoryPort categoryPort, ProductPort productPort) {
        return SearchInteractor.of(categoryPort, productPort);
    }

    @Bean
    public CategoryPort categoryPort(CategoryRepository categoryRepository) {
        return CategoryAdapter.of(categoryRepository);
    }

    @Bean
    public ProductPort productPort(ProductRepository productRepository) {
        return ProductAdapter.of(productRepository);
    }
}
