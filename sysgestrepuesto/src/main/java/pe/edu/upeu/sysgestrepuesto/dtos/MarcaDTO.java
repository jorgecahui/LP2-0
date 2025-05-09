package pe.edu.upeu.sysgestrepuesto.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MarcaDTO {
    private Long idMarca;
    @NotNull
    @Size(min = 4, max = 60, message = "el nombre debe ser entre 4 a 60 caracteres")
    private String nombre;
}
