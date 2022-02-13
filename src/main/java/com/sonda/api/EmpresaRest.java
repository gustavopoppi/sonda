package com.sonda.api;

import com.sonda.dto.EmpresaDto;
import com.sonda.model.Empresa;
import com.sonda.repository.EmpresaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaRest {

    @Autowired
    private final EmpresaRepository empresaRepository;

    private final ModelMapper modelMapper;

    public EmpresaRest(EmpresaRepository empresaRepository, ModelMapper modelMapper) {
        this.empresaRepository = empresaRepository;
        this.modelMapper = modelMapper;
    }

    public List<EmpresaDto> getAllEmpresaDto(){
        List<EmpresaDto> empresasDto = new ArrayList<>();
        for (Empresa empresa : consultaFindAllEmpresas()) {
            EmpresaDto empresaDto = modelMapper.map(empresa, EmpresaDto.class);
            empresasDto.add(empresaDto);
        }
        return empresasDto;
    }

    private List<Empresa> consultaFindAllEmpresas() {
        return empresaRepository.findAll();
    }
}