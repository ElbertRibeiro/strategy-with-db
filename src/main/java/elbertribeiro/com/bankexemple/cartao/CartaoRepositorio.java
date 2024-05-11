package elbertribeiro.com.bankexemple.cartao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepositorio extends JpaRepository<Cartao, Integer> {
}
