package elbertribeiro.com.bankexemple.validacao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "EXEMPLO", name = "TAB_VALIDACAO")
@Getter
@Setter
public class Validacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
}
