package achadoseperdidos.java.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class UsuarioDto {

    @NotBlank
    private String nome;

    @NotBlank
    private String email;

    @NotBlank
    private String senha;

    // Getters e Setters
}

