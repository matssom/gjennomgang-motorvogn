package com.example.demo.repository;

import com.example.demo.model.Motorvogn;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AppRepository {
    private final ArrayList<Motorvogn> motorvognliste = new ArrayList<>();

    public void leggInn(Motorvogn motorvogn) {
        motorvognliste.add(motorvogn);
    }

    public ArrayList<Motorvogn> hentAlle() {
        return motorvognliste;
    }

    public void slettAlle() {
        motorvognliste.clear();
    }
}