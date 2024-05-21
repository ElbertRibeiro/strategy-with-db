package elbertribeiro.com.service;

import elbertribeiro.com.dto.LancamentoContaCorrenteDTO;
import elbertribeiro.com.event.ContaCorrenteEvent;
import elbertribeiro.com.event.LancamentoContaCorrenteEvent;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@AllArgsConstructor
public class ContaCorrenteServico implements ApplicationListener<ContaCorrenteEvent> {
    private final ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void onApplicationEvent(ContaCorrenteEvent contaCorrenteEvent) {
        log.info("################CRIACAO##################");
        log.info("Escutando evento de criação de conta corrente");
        log.info("Data Criação: {}", contaCorrenteEvent.getCorrenteDTO().getDataCriacao());
        log.info("Documento Origem: {}", contaCorrenteEvent.getCorrenteDTO().getDocOrigem());
        log.info("ID contribuinte: {}", contaCorrenteEvent.getCorrenteDTO().getIdContribuinte());
        log.info("Plano de Conta: {}", contaCorrenteEvent.getCorrenteDTO().getIdPlanoConta());
        log.info("Cria Conta corrente");
        applicationEventPublisher.publishEvent(new LancamentoContaCorrenteEvent(this,
                new LancamentoContaCorrenteDTO(
                        contaCorrenteEvent.getCorrenteDTO().getIdPlanoConta(),
                        contaCorrenteEvent.getCorrenteDTO().getIdContribuinte(),
                        contaCorrenteEvent.getCorrenteDTO().getDocOrigem(),
                        contaCorrenteEvent.getCorrenteDTO().getDataCriacao()
                )));

    }
}
