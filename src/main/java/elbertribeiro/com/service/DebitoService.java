package elbertribeiro.com.service;

import elbertribeiro.com.dao.DebitoRepository;
import elbertribeiro.com.model.Debito;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DebitoService {
    private final DebitoRepository debitoRepository;

    public String validaDebito(Integer id) {
        return debitoRepository.findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Debito informada inválida. Cálculo de juros permitido para os seguintes debitos: "
                                + debitoRepository.findAll().stream().map(Debito::getDescricao).toList()))
                .getDescricao();
    }

}
