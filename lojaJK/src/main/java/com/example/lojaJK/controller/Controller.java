package com.example.lojaJK.controller;

import com.example.lojaJK.tenis.Tenis;
import com.example.lojaJK.tenis.TenisRepository;
import com.example.lojaJK.tenis.TenisResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tenis")
public class Controller {

    @Autowired
    private TenisRepository repository;
    @CrossOrigin(origins = "*", allowCredentials = "*")
    @PostMapping
    public void saveTenis(@RequestBody TenisResponseDTO data){
        Tenis TenisData = new Tenis(data);
        repository.save(TenisData);
        return;

    }
    @CrossOrigin(origins = "*", allowCredentials = "*")
    @GetMapping
    public List<TenisResponseDTO> getAll(){

        List<TenisResponseDTO> tenisList = repository.findAll().stream().map(TenisResponseDTO::new).toList();
        return tenisList;

    }
}
