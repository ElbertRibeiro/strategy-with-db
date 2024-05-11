package elbertribeiro.com.bankexemple.cartao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cartao")
public class CartaoRecurso {
    @Autowired
    private CartaoRepositorio cartaoRepositorio;

    @GetMapping
    public List<Cartao> getCartao() {
        return cartaoRepositorio.findAll();
    }
}
