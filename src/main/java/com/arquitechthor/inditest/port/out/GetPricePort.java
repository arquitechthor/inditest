package com.arquitechthor.inditest.port.out;

import com.arquitechthor.inditest.domain.Price;
import java.time.LocalDateTime;

public interface GetPricePort {
    Price getPrice(LocalDateTime applicationDate, Long productId, Long brandId);
}
