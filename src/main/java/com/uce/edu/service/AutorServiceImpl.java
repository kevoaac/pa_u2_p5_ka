package com.uce.edu.service;

import com.uce.edu.repository.IAutorRepository;
import com.uce.edu.repository.modelo.Autor;
import com.uce.edu.repository.modelo.Autor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl implements IAutorService {
    @Autowired
    private IAutorRepository iAutorRepository;

    @Override
    public void registrar(Autor autor) {
        this.iAutorRepository.insertar(autor);
    }

    @Override
    public void registrar(Autor2 autor2) {
        this.iAutorRepository.insertar(autor2);
    }

    @Override
    public Autor buscar(Integer id) {
        return this.iAutorRepository.seleccionar(id);
    }

    @Override
    public void actualizar(Autor autor) {
        this.iAutorRepository.actualizar(autor);
    }

    @Override
    public void eliminar(Integer id) {
        this.iAutorRepository.eliminar(id);
    }
}
