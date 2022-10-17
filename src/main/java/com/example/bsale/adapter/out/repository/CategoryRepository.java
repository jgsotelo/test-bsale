package com.example.bsale.adapter.out.repository;

import com.example.bsale.adapter.out.model.CategoryModel;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface CategoryRepository extends ReactiveSortingRepository<CategoryModel, Integer> {
}
