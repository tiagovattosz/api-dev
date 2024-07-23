package br.edu.fema.apidev.model;

import br.edu.fema.apidev.model.enums.Contrato;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Desenvolvedor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    @ManyToOne
    private Empresa empresa;

//    @ManyToMany(mappedBy = "desenvolvedores")
    @OneToMany(mappedBy = "desenvolvedor")
    private Set<Contribuicao> contribuicoes;

    private LocalDate dataNascimento;
    private Contrato contrato;
    private BigDecimal salario;

}
