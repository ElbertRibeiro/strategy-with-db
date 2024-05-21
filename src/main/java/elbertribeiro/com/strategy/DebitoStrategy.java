package elbertribeiro.com.strategy;


import elbertribeiro.com.dto.DebitoRequest;

public interface DebitoStrategy {
    void calculaJuros(DebitoRequest request);

    String obtemTipoDebito();
}
