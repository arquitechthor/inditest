package com.arquitechthor.inditest.infrastructure.adapter.in.web;

import com.arquitechthor.inditest.infrastructure.adapter.in.command.GetPriceCommand;
import com.arquitechthor.inditest.infrastructure.adapter.out.web.PriceResponse;
import com.arquitechthor.inditest.port.in.PricePort;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prices")
@AllArgsConstructor
@Tag(name = "Prices", description = "API for retrieving applicable prices")
public class PriceController {

    private final PricePort pricePort;

    @PostMapping("/get-price")
    public ResponseEntity<PriceResponse> getPrice(@RequestBody GetPriceCommand getPriceCommand) {
        PriceResponse response = pricePort.getPriceByDateProductAndBrand(getPriceCommand);
        return ResponseEntity.ok(response);
    }
}
