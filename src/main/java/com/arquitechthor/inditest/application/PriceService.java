package com.arquitechthor.inditest.application;

import com.arquitechthor.inditest.infrastructure.adapter.in.command.GetPriceCommand;
import com.arquitechthor.inditest.infrastructure.adapter.out.web.PriceResponse;
import com.arquitechthor.inditest.port.in.PricePort;
import com.arquitechthor.inditest.port.out.GetPricePort;
import com.arquitechthor.inditest.infrastructure.annotation.UseCase;
import com.arquitechthor.inditest.domain.Price;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class PriceService implements PricePort {
	
	private final GetPricePort getPricePort;
	
	@Override
	@Transactional
	public PriceResponse getPriceByDateProductAndBrand(GetPriceCommand priceRequest) {
		
		Price price = getPricePort.getPrice(
				priceRequest.getApplicationDate(), 
				priceRequest.getProductId(),
				priceRequest.getBrandId());

		PriceResponse priceResponse = PriceResponse.builder()
            		.price(price.getPrice())
            		.priceList(price.getPriceList())
            		.applicationDate(priceRequest.getApplicationDate())
            		.brandId(priceRequest.getBrandId())
            		.productId(priceRequest.getProductId())
            		.build();

        return priceResponse;
		
	}
}
