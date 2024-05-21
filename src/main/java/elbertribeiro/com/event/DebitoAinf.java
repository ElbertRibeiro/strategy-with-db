package elbertribeiro.com.event;

import elbertribeiro.com.dto.ContaCorrenteDTO;
import elbertribeiro.com.dto.DebitoRequest;
import elbertribeiro.com.service.DebitoServico;
import elbertribeiro.com.strategy.DebitoStrategy;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Log4j2
@AllArgsConstructor
public class DebitoAinf implements DebitoStrategy {
    private final DebitoServico debitoServico;

    private final ApplicationEventPublisher applicationEventPublisher;

    public static ContaCorrenteDTO constroiDTO(DebitoRequest request) {
        return new ContaCorrenteDTO(
                request.getIdDebito(),
                request.getIdContribuinte(),
                null,
                new Date()
        );
    }

    @Override
    public void calculaMulta(DebitoRequest request) {
        log.info("Calculando multa de conta corrente");
        applicationEventPublisher.publishEvent(new ContaCorrenteEvent(this, constroiDTO(request)));
    }

    @Override
    public String obtemTipoContaCorrente() {
        return debitoServico.validaDebito(1);
    }
}
