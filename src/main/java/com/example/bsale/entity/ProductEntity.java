package com.example.bsale.entity;

import com.example.bsale.adapter.out.model.ProductModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;

import java.math.BigDecimal;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

    private int id;
    private String name;
    private String urlImage;
    private BigDecimal price;
    private BigDecimal discount;
    private int category;

    public static ProductEntity from(final ProductModel model) {
        return ProductEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .urlImage(model.getUrlImage())
                .price(model.getPrice())
                .discount(model.getDiscount())
                .build();
    }
}
