package elbertribeiro.com.service;

import elbertribeiro.com.dto.DebitoRequest;
import elbertribeiro.com.strategy.DebitoStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DebitoCartaoCreditoService implements DebitoStrategy {
    private final DebitoService debitoService;

    @Override
    public void calculaJuros(DebitoRequest request) {
    }

    @Override
    public String obtemTipoDebito() {
        return debitoService.validaDebito(2);
    }
}
