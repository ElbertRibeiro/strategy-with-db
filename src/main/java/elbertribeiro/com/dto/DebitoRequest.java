package elbertribeiro.com.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DebitoRequest {

    @NotNull
    private Integer idDebito;
    private Long idCliente;
}
