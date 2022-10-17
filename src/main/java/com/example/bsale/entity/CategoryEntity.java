package com.example.bsale.entity;

import com.example.bsale.adapter.out.model.CategoryModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {

    private int id;
    private String name;

    public static CategoryEntity from(final CategoryModel model) {
        return CategoryEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .build();
    }
}
