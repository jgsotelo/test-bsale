package com.example.bsale.adapter.out.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table("category")
public class CategoryModel implements Serializable {

    @Id
    @Column("id")
    private int id;

    @Column("name")
    private String name;
}
