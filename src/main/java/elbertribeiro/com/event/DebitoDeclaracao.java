package elbertribeiro.com.event;

import elbertribeiro.com.dto.DebitoRequest;
import elbertribeiro.com.service.DebitoServico;
import elbertribeiro.com.strategy.DebitoStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DebitoDeclaracao implements DebitoStrategy {
    private final DebitoServico debitoServico;

    @Override
    public void calculaMulta(DebitoRequest request) {
    }

    @Override
    public String obtemTipoContaCorrente() {
        return debitoServico.validaDebito(2);
    }
}
