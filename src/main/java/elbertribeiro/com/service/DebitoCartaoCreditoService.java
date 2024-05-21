package elbertribeiro.com.service;

import elbertribeiro.com.dto.DebitoRequest;
import elbertribeiro.com.strategy.DebitoStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class DebitoCartaoCreditoService implements DebitoStrategy {
    private final DebitoService debitoService;

    @Override
    public void calculaJuros(DebitoRequest request) {
        log.info("Calculando juros de debito de Cartao de Credito");
    }

    @Override
    public String obtemTipoDebito() {
        return debitoService.validaDebito(2);
    }
}
