package elbertribeiro.com.resource;

import elbertribeiro.com.dto.DebitoRequest;
import elbertribeiro.com.dto.DebitoResponse;
import elbertribeiro.com.model.Debito;
import elbertribeiro.com.service.DebitoServico;
import elbertribeiro.com.strategy.DebitoStrategy;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("debito")
public class DebitoRecurso {

    private final Map<String, DebitoStrategy> services;
    private final DebitoServico debitoServic;

    public DebitoRecurso(List<DebitoStrategy> contaCorrenteStrategies, DebitoServico debitoServic) {
        this.debitoServic = debitoServic;
        services = new HashMap<>();
        contaCorrenteStrategies.forEach(multaStrategy -> services.put(multaStrategy.obtemTipoContaCorrente(), multaStrategy));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DebitoResponse> criarContaCorrente(@Validated @RequestBody DebitoRequest contaCorrenteDTO) {
        try {
            services.get(debitoServic.validaDebito(contaCorrenteDTO.getIdDebito())).calculaMulta(contaCorrenteDTO);
            return new ResponseEntity<>(new DebitoResponse("Criação da conta corrente realizada", "1L"), HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    @GetMapping
    public List<Debito> get(){
        return debitoServic.validaDebito();
    }

}