package elbertribeiro.com.event;

import elbertribeiro.com.dto.ContaCorrenteDTO;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class ContaCorrenteEvent extends ApplicationEvent {
    private final ContaCorrenteDTO correnteDTO;

    public ContaCorrenteEvent(Object source, ContaCorrenteDTO correnteDTO) {
        super(source);
        this.correnteDTO = correnteDTO;
    }

}
