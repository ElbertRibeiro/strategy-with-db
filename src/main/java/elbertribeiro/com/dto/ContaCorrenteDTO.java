package elbertribeiro.com.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class ContaCorrenteDTO {
    private Integer idPlanoConta;
    @NotNull
    private Long idContribuinte;
    private Long docOrigem;
    private Date dataCriacao;
}
