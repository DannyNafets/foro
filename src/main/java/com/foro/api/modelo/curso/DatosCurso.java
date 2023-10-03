package com.foro.api.modelo.curso;

import jakarta.validation.constraints.NotBlank;

public record DatosCurso(
        @NotBlank
        String nombreCurso,
        @NotBlank
        String categoria
) {
}
