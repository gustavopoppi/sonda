package com.sonda.controller;

import com.sonda.dto.EmpresaDto;
import com.sonda.api.EmpresaRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmpresaController {

    private final EmpresaRest empresaRest;

    @Autowired
    public EmpresaController(EmpresaRest empresaService) {
        this.empresaRest = empresaService;
    }

    @GetMapping("listaEmpresas")
    public ResponseEntity<List<EmpresaDto>> listaEmpresas(){
        return ResponseEntity.ok().body(empresaRest.getAllEmpresaDto());
    }
}