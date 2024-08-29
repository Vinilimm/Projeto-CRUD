package com.example.WebStream.services;

import com.example.WebStream.models.Filme;
import com.example.WebStream.repositorys.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public List<Filme> listarfilmes() {
        return filmeRepository.findAll();
    }

    public Filme createFilme(Filme filme) {
      return filmeRepository.save(filme);
    }

    public Optional<Filme> getFilmePorId(Long idFilme){
       return filmeRepository.findById(idFilme);
    }

}
