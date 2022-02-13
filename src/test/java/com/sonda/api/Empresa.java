package com.sonda.api;

import com.sonda.controller.EmpresaController;
import com.sonda.repository.EmpresaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Empresa {

    @Autowired
    EmpresaRepository empresaRepository;

    @Test
    public void dadoRequestListaEmpresasValidarRetornoDeTodasEmpresasEStatusResponse200(){
        EmpresaRest empresaRest = new EmpresaRest(empresaRepository, new ModelMapper());
        EmpresaController empresaController = new EmpresaController(empresaRest);

        Assertions.assertEquals(3, empresaController.listaEmpresas().getBody().size(), "Deveria ter 3 empresas cadastradas");
        Assertions.assertEquals(200, empresaController.listaEmpresas().getStatusCode().value(), "Código do status response deveria ser 200");
    }
}