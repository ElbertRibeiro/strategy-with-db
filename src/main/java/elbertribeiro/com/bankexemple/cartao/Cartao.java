package elbertribeiro.com.bankexemple.cartao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "EXEMPLO", name = "TAB_CARTAO")
@Getter
@Setter
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TIPO_CARTAO", columnDefinition = "VARCHAR")
    private String tipoCartao;

}
