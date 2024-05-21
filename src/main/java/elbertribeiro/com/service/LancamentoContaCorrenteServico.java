package elbertribeiro.com.service;

import elbertribeiro.com.event.LancamentoContaCorrenteEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class LancamentoContaCorrenteServico implements ApplicationListener<LancamentoContaCorrenteEvent> {
    @Override
    public void onApplicationEvent(LancamentoContaCorrenteEvent contaCorrenteEvent) {
        log.info("################LANCAMENTO##################");
        log.info("Escutando evento de laçamento de conta corrente");
        log.info("Data Criação: {}", contaCorrenteEvent.getCorrenteDTO().getDataCriacao());
        log.info("Documento Origem: {}", contaCorrenteEvent.getCorrenteDTO().getDocOrigem());
        log.info("ID contribuinte: {}", contaCorrenteEvent.getCorrenteDTO().getIdContribuinte());
        log.info("Plano de Conta: {}", contaCorrenteEvent.getCorrenteDTO().getIdPlanoConta());

        log.info("Lança evento Conta corrente");

    }
}
