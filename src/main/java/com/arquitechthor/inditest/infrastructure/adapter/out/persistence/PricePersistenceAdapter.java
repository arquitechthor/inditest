package com.arquitechthor.inditest.infrastructure.adapter.out.persistence;

import com.arquitechthor.inditest.infrastructure.adapter.out.persistence.mapper.PriceMapper;
import com.arquitechthor.inditest.infrastructure.adapter.out.persistence.repository.SpringPriceRepository;
import com.arquitechthor.inditest.infrastructure.annotation.PersistenceAdapter;
import com.arquitechthor.inditest.port.out.GetPricePort;
import com.arquitechthor.inditest.domain.Price;
import com.arquitechthor.inditest.infrastructure.adapter.out.exception.RecordNotFoundException;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@PersistenceAdapter
@AllArgsConstructor
public class PricePersistenceAdapter implements GetPricePort {

    private final SpringPriceRepository priceRepository;

    @Override
    public Price getPrice(LocalDateTime applicationDate, Long productId, Long brandId) {
        return priceRepository
                .findFirstByBrandProductAndDate(applicationDate, productId, brandId)
                .map(PriceMapper::entityToDomain)
                .orElseThrow(RecordNotFoundException::new);
    }

}
