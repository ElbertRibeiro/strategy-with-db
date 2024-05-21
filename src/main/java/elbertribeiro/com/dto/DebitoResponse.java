package elbertribeiro.com.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DebitoResponse {
    @JsonProperty("msg_retorno")
    private final String mensagemRetorno;
    private final String numCorrelativo;
}
