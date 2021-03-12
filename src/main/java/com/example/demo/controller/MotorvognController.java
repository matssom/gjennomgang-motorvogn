package com.example.demo.controller;

import com.example.demo.model.Motorvogn;
import com.example.demo.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class MotorvognController {

    @Autowired
    AppRepository repo;

    @PostMapping("/motor")
    public void lagre(Motorvogn motorvogn) {
        repo.leggInn(motorvogn);
    }

    @GetMapping("/motor")
    public ArrayList<Motorvogn> hent() {
        return repo.hentAlle();
    }

    @DeleteMapping("/motor")
    public void slett() {
        repo.slettAlle();
    }
}