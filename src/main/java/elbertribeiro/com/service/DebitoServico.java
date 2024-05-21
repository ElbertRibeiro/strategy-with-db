package elbertribeiro.com.service;

import elbertribeiro.com.dao.DebitoRepositorio;
import elbertribeiro.com.model.Debito;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DebitoServico {
    private final DebitoRepositorio debitoRepositorio;

    public Debito validaDebito(Integer id) {
        return debitoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Multa informada inválida. Cálculo de multa permitido para as seguintes multas: "
                        + id));
    }
}
