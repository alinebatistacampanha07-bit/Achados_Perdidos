package achadoseperdidos.java.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
public class ObjetoPerdido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    private LocalDate data;

    private String local;

    private String descricao;

    private String status; // "Disponível" ou "Devolvido"

    private String devolvidoPara;

}

