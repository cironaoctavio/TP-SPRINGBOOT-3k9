package com.utn.products.dto;


import com.utn.products.model.Categoria;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDTO {

    @Size(min = 3, max = 100, message = "El nombre debe de 3 a 100 carácteres.")
    @NotNull(message = "El nombre no puede estar vacío.")
    @NotBlank(message = "Campo obligatorio.")
    private String nombre;

    @Size(max = 500, message = "500 carácteres alcanzados.")
    private String descripcion;

    @NotNull(message = "El precio debe tener un valor.")
    @DecimalMin(value = "0.01", message = "El precio debe ser minimo 0.01")
    private Double precio;

    @NotNull(message = "Ingrese un valor.")
    @DecimalMin(value = "0", message = "De no tener stock ingrese 0.")
    private int stock;

    private Categoria categoria;

}
