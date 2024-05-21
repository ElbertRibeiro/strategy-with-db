package elbertribeiro.com.strategy;


import elbertribeiro.com.dto.DebitoRequest;

public interface DebitoStrategy {
    void calculaMulta(DebitoRequest request);

    String obtemTipoContaCorrente();
}
