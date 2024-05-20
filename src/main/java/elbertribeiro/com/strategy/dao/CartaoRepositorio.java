package elbertribeiro.com.strategy.dao;

import elbertribeiro.com.strategy.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepositorio extends JpaRepository<Cartao, Integer> {
}
