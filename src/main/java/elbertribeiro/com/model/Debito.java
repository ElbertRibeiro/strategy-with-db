package elbertribeiro.com.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "EXEMPLO", name = "TAB_DEBITO")
@Getter
@Setter
public class Debito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DESCRICAO", columnDefinition = "VARCHAR")
    private String descricao;
}
