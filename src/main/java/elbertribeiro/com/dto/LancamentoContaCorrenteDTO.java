package elbertribeiro.com.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class LancamentoContaCorrenteDTO {
    private Integer idPlanoConta;
    private Long idContribuinte;
    private Long docOrigem;
    private Date dataCriacao;
}
