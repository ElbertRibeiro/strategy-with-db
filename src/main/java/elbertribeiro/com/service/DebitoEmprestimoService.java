package elbertribeiro.com.service;

import elbertribeiro.com.dto.DebitoRequest;
import elbertribeiro.com.strategy.DebitoStrategy;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@AllArgsConstructor
public class DebitoEmprestimoService implements DebitoStrategy {
    private final DebitoService debitoService;


    @Override
    public void calculaJuros(DebitoRequest request) {
        log.info("Calculando juros de debito de Emprestimo");
    }

    @Override
    public String obtemTipoDebito() {
        return debitoService.validaDebito(1);
    }
}
