package com.mycompany.ejemploslibrerias;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainOrdenamiento {

    public static void main(String[] args) {

        Persona luis = new Persona("Luis", 38, LocalDate.of(1981, 5, 6));
        Persona pedro = new Persona("Pedro", 26, LocalDate.of(1993, 5, 3));
        Persona marisa = new Persona("Marisa", 54, LocalDate.of(1965, 9, 1));
        Persona axel = new Persona("Axel", 2, LocalDate.of(2017, 2, 22));
        
//        List<Persona> personas = Arrays.asList(luis, pedro, marisa, axel);
//        
//        
//        personas.sort(Comparator.comparing(Persona::getEdad));
//        
//        System.out.println(personas);

    }
    
}
