package com.arquitechthor.inditest.port.in;

import com.arquitechthor.inditest.infrastructure.adapter.in.command.GetPriceCommand;
import com.arquitechthor.inditest.infrastructure.adapter.out.web.PriceResponse;

public interface PricePort {
	PriceResponse getPriceByDateProductAndBrand(GetPriceCommand command);

}
