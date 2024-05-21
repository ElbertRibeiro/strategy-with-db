package elbertribeiro.com.strategy;


import elbertribeiro.com.dto.DebitoRequest;
import elbertribeiro.com.model.Debito;

public interface DebitoStrategy {
    void calculaMulta(DebitoRequest request);

    Debito obtemTipoContaCorrente();
}
