package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public String almacenar(Persona persona) {
        this.personaRepository.save(persona);
        return "Persona almacenada OK";
    }
    public List<Persona> listar() {
        return this.personaRepository.findAll();
    }
}
