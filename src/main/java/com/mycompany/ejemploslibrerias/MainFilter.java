package com.mycompany.ejemploslibrerias;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainFilter {

    public static void main(String[] args) {

        Persona luis = new Persona("Luis", 38, LocalDate.of(2019, 05, 06));
        Persona pedro = new Persona("Pedro", 26, LocalDate.of(2019, 05, 03));
        Persona marisa = new Persona("Marisa", 54, LocalDate.of(2019, 05, 01));
        Persona axel = new Persona("Axel", 2, LocalDate.of(2019, 05, 22));
        
        List<Persona> personas = Arrays.asList(luis, pedro, marisa, axel);

//        personas.stream().filter(persona -> persona.getEdad() > 18)
//                .forEach(persona -> System.out.println(persona));
    }

}
