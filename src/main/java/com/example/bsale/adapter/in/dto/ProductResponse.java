package com.example.bsale.adapter.in.dto;

import com.example.bsale.entity.ProductEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResponse implements Serializable {

    private int id;
    private String name;
    private String urlImage;
    private BigDecimal price;
    private BigDecimal discount;
    private String category;

    public static ProductResponse from(final ProductEntity entity) {
        return ProductResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .urlImage(entity.getUrlImage())
                .price(entity.getPrice())
                .discount(entity.getDiscount())
                .build();
    }
}
