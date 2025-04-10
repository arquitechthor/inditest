package com.arquitechthor.inditest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Product {

    private Long id;
    private String name;

}
