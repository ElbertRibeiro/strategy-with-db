package elbertribeiro.com.event;

import elbertribeiro.com.dto.LancamentoContaCorrenteDTO;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class LancamentoContaCorrenteEvent extends ApplicationEvent {
    private final LancamentoContaCorrenteDTO correnteDTO;

    public LancamentoContaCorrenteEvent(Object source, LancamentoContaCorrenteDTO correnteDTO) {
        super(source);
        this.correnteDTO = correnteDTO;
    }

}
