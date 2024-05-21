package elbertribeiro.com.service;

import elbertribeiro.com.dao.DebitoRepositorio;
import elbertribeiro.com.model.Debito;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DebitoServico {
    private final DebitoRepositorio debitoRepositorio;

    public String validaDebito(Integer id) {
        return debitoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Multa informada inválida. Cálculo de multa permitido para as seguintes multas: "
                        + id)).getDescricao();
    }

    public List<Debito> validaDebito() {
        return debitoRepositorio.findAll();
    }
}
