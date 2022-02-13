package com.sonda.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmpresaDto {

    private long id;

    private String nome;
    private String email;
    private String empresa;
    private String cnpj;
}