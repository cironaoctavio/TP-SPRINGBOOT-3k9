package com.utn.products.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ActualizarStockDTO {
    @NotNull(message = "Ingrese un valor.")
    @Min(value = 0, message = "De no tener stock ingrese 0.")
    private Integer stock;
}
