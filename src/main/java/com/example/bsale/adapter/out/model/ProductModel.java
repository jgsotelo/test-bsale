package com.example.bsale.adapter.out.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table("product")
public class ProductModel implements Serializable {

    @Id
    @Column("id")
    private int id;

    @Column("name")
    private String name;

    @Column("url_image")
    private String urlImage;

    @Column("price")
    private BigDecimal price;

    @Column("discount")
    private BigDecimal discount;

    @Column("category")
    private int category;
}
