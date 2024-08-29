package com.example.WebStream.services;

import com.example.WebStream.models.Filme;
import com.example.WebStream.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;








    public List<Filme> listarfilmes() {
        return filmeRepository.findAll();
    }
}
