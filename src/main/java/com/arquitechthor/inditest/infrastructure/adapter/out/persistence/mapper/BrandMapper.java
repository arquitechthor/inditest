package com.arquitechthor.inditest.infrastructure.adapter.out.persistence.mapper;

import com.arquitechthor.inditest.infrastructure.adapter.out.persistence.entity.BrandEntity;
import com.arquitechthor.inditest.domain.Brand;

public class BrandMapper {

    public static Brand entityToDomain(BrandEntity brandEntity) {
        return Brand.builder()
                .id(brandEntity.getId())
                .name(brandEntity.getName())
                .build();
    }

    public static BrandEntity domainToEntity(Brand brand) {
        return BrandEntity.builder()
                .id(brand.getId())
                .name(brand.getName())
                .build();
    }
}
