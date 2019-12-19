package com.mycompany.ejemploslibrerias;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class MainMap {

    public static void main(String[] args) {

        Persona luis = new Persona("Luis", 38, LocalDate.of(2019, 05, 06));
        Persona pedro = new Persona("Pedro", 26, LocalDate.of(2019, 05, 03));
        Persona marisa = new Persona("Marisa", 54, LocalDate.of(2019, 05, 01));
        Persona axel = new Persona("Axel", 2, LocalDate.of(2019, 05, 22));
        
        List<Persona> personas = Arrays.asList(luis, pedro, marisa, axel);

//        personas.stream().map(persona -> persona.getNombre() + "...")
//                .forEach(persona -> System.out.println(persona));
    }

}
