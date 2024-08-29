package com.example.WebStream.controllers;


import com.example.WebStream.models.Filme;
import com.example.WebStream.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

import static com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat.URI;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<Filme> getAllTopicos() {
        return filmeService.listarfilmes();
    }

    @PostMapping
    public ResponseEntity<Filme> createFilme(@RequestBody Filme filme) {
        Filme createdfilme;
        createdfilme = filmeService.createFilme(filme);
        return ResponseEntity.ok(createdfilme);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> getFilmePorId(@PathVariable("idFilme") Long idFilme){
       var filme = filmeService.getFilmePorId(idFilme);
        return filme.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
