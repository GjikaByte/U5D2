package org.example.u5d2.entities;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CLR implements CommandLineRunner {

    @Override
    public void run (String... args){
        System.out.println("Funziona CommandLineRunner");
    }
}
