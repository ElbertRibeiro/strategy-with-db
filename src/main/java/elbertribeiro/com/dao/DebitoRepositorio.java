package elbertribeiro.com.dao;

import elbertribeiro.com.model.Debito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitoRepositorio extends JpaRepository<Debito, Integer> {
}
