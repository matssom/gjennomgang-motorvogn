package com.example.demo.controller;

import com.example.demo.model.Bil;
import com.example.demo.model.Motorvogn;
import com.example.demo.repository.BilRepository;
import com.example.demo.repository.MotorvognRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class BilController {

    @Autowired
    BilRepository repo;

    @PostMapping("/bil")
    public void lagre(Bil motorvogn) {
        repo.leggInn(motorvogn);
    }

    @GetMapping("/bil")
    public ArrayList<Bil> hent() {
        return repo.hentAlle();
    }

    @DeleteMapping("/bil")
    public void slett() {
        repo.slettAlle();
    }

    /*
     * Utfordring:
     * Lag en metode som tar inn merke og modell og sletter kun den bilen fra serveren
     * */
}
