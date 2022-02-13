package com.sonda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Empresa")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Empresa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String email;
    private String empresa;
    private String cnpj;
}