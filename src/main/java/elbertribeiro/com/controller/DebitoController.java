package elbertribeiro.com.controller;

import elbertribeiro.com.dto.DebitoRequest;
import elbertribeiro.com.dto.DebitoResponse;
import elbertribeiro.com.service.DebitoService;
import elbertribeiro.com.strategy.DebitoStrategy;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("debito")
public class DebitoController {

    private final Map<String, DebitoStrategy> services;
    private final DebitoService debitoServic;

    public DebitoController(List<DebitoStrategy> contaCorrenteStrategies, DebitoService debitoServic) {
        this.debitoServic = debitoServic;
        services = new HashMap<>();
        contaCorrenteStrategies.forEach(multaStrategy -> services.put(multaStrategy.obtemTipoDebito(), multaStrategy));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DebitoResponse> criarDebito(@Validated @RequestBody DebitoRequest contaCorrenteDTO) {
        try {
            services.get(debitoServic.validaDebito(contaCorrenteDTO.getIdDebito())).calculaJuros(contaCorrenteDTO);
            return new ResponseEntity<>(new DebitoResponse("Criação de debito realizada"), HttpStatus.CREATED);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

}