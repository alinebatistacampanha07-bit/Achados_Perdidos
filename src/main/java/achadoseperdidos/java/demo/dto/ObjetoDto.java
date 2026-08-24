package achadoseperdidos.java.demo.dto;

import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

public class ObjetoDto {

    @NotBlank
    private String nome;

    private String local;

    private LocalDate data;

    private String descricao;

    //Getters e Setters
}
